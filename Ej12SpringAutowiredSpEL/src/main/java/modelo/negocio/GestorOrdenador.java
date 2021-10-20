package modelo.negocio;

import java.util.List;

import modelo.entidad.Ordenador;
import modelo.persistencia.DaoOrdenador;


public class GestorOrdenador {
	
	private DaoOrdenador daoOrdenador;
	private String nombreFichero;
	
	/**
	 * Metodo que insertara una pelicula mediante el daoPelicula. La pelicula
	 * no puede tener el titulo vacio para poder ser insertada
	 * @param p la pelicula a insertar
	 * @return 0 en caso de que hayamos podido insertar la pelicula, 1 en caso
	 * de que el titulo este vacio y 2 en caso de la lista no admita más peliculas
	 */
	public boolean persistir(Ordenador o) {
		return daoOrdenador.persistir(o, this.nombreFichero);
	}
	
/*	public List<Pelicula> listar(){
		return daoPelicula.listar();
	}		*/

	//Los getter y setter para las insertar las dependencias con el DaoPelicula
	public DaoOrdenador getDaoOrdenadora() {
		return daoOrdenador;
	}

	public void setDaoOrdenador(DaoOrdenador daoOrdenador) {
		this.daoOrdenador = daoOrdenador;
	}

	public String getNombreFichero() {
		return nombreFichero;
	}

	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}
	
	
	
	
}
