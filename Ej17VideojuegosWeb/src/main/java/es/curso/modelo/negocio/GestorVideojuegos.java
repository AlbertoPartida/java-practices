package es.curso.modelo.negocio;

import java.util.List;

import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.persistencia.DaoVideojuego;

public class GestorVideojuegos {	

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
