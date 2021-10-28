package es.curso.controlador;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.curso.modelo.entidad.Login;
import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.negocio.GestorLogin;
import es.curso.modelo.negocio.GestorVideojuegos;

//Para dar de alta un controlador  y que FrontController sepa localizarlo
//usaremos la anotacion @Controller
@Controller
public class ControladorVideojuego {
	
	@Autowired
	private GestorLogin gestorLogin;
	@Autowired
	private Login login;
	@Autowired
	private GestorVideojuegos gestorVideojuegos;
	@Autowired
	private Videojuego videojuego;
	
	//Podemos en la anotacion @RequestMapping restringir el acceso al metodo
	//que queramos.
		
	//A los metodos anotados con anotaciones de SpringWeb podemos pasarle
	//por parametro muchos tipos de objetos.
		
	//1. Si anotamos un parametro de entrada con @RequestMapping, Spring
	//buscara un parametro con ese nombre para inyectarlo
	//2. Podemos tambien pasarle el objeto HttpServletRequest para obtener
	//parametos, datos, etc.
	//3. Podemos pasarle tambien directamente el objeto HttpSession
	//4. Podemos pasarle un objeto de tipo Model (o ModelAndView) para 
	//almacenar datos que mandaremos a la vista
		
	//Los metodos de Spring MVC pueden devolver String, ModelAndView o View
	@RequestMapping(path="loginControlador",method=RequestMethod.POST)
	public String metodoLogin(@RequestParam("usuario") String usuario,
			@RequestParam("password") String password,
			HttpServletRequest request, 
			HttpSession session,
			ModelAndView mav){
		
		String page;
		login.setPassword(password);
		login.setUsuario(usuario);
		boolean correcto = gestorLogin.buscar(login);
		if(correcto) {
			List <Videojuego> listaVideojuegos = gestorVideojuegos.listar();
			System.out.println(listaVideojuegos);
			session.setAttribute("sessionListaVideojuegos",listaVideojuegos);
			page = "listaVideojuegos";
		}else {
			request.setAttribute("errorLogin","El usuario/contraseña no existe.");
			page = "errorLogin";
		}
		
		System.out.println(usuario + " 0-0 " + password);
		
		return page;
	}   
	
	@RequestMapping(path="videojuegosControlador",method=RequestMethod.POST)
	public String buscarVideojugoID(@RequestParam("id") String id,
			HttpServletRequest request, 
			HttpSession session,
			ModelAndView mav){
		
		String page;
		videojuego = gestorVideojuegos.buscar(id);
		
		System.out.println(videojuego);

		if(videojuego != null) {
			request.setAttribute("errorVideojuego", null);
			request.setAttribute("juego", videojuego);
			page = "videojuegoDetalle";
		}else {
			request.setAttribute("errorVideojuego", "El id del videojuego no existe.");
			page = "listaVideojuegos";
		}		
		
		return page;
	} 
	
	//Mediante la anotacion @RequestMapping (que es propia de MVC) podemos
	//mapear URLs
	@RequestMapping("volverListaVideojuegos")
	public String volverListaVideojuegos() {
		//al devolver "listaVideojuegos" usara el objeto viewResolver para formar
		//la direccion "/WEB-INF/vistas/formularioSaludo.jsp"
		return "listaVideojuegos";
	}
	
}
