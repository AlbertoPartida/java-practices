package es.curso.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.modelo.entidad.Login;
import es.curso.modelo.negocio.GestorLogin;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginControlador")
public class LoginControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestorLogin gl = new GestorLogin();
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		Login login = new Login();
		login.setPassword(password);
		login.setUsuario(usuario);
		
		boolean correcto = gl.buscar(login);
		
		if(correcto) {
			request.getRequestDispatcher("listaVideojuegos.jsp").forward(request, response);	

		}else {
			request.setAttribute("errorLogin", "El usuario/contraseña no existe.");
			request.getRequestDispatcher("index.jsp").forward(request, response);	
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
