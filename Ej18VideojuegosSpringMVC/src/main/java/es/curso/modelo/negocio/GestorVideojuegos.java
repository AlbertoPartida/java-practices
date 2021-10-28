package es.curso.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.persistencia.DaoVideojuego;

//Anotaciones de Spring
@Component
@Scope("prototype")
public class GestorVideojuegos {	

	@Autowired
	private DaoVideojuego videojuegoDao;
	
	public List<Videojuego> listar(){
		videojuegoDao = new DaoVideojuego();
		return videojuegoDao.listar();
	}
	
	public Videojuego buscar(String idVideojuego) {
		videojuegoDao = new DaoVideojuego();
		int id = Integer.parseInt(idVideojuego);
		return videojuegoDao.buscar(id);
	}
	
}
