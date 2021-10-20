package modelo.persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import modelo.entidad.Ordenador;
import modelo.entidad.Periferico;
import modelo.entidad.Ram;
import modelo.entidad.TarjetaGrafica;


//En este caso estoy simulando una persistencia, realmente lo que tenemos
//es un array en memoria que guarda las peliculas
//Tambien para darle un poco más de complejidad establecemos un numero 
//maximo de peliculas que podemos tener guardadas
public class DaoOrdenador {

	/**
	 * Metodo que inserta una pelicula a la lista
	 * @param p la pelicula a insertar
	 * @return true en caso correcto, false en caso de que el array
	 * este lleno
	 */
	public boolean persistir(Ordenador o, String nombreFichero) {
		
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			//Abrimos el fichero en modo escritura, cada vez que lo abrimos se borra lo anterior
			fw = new FileWriter(nombreFichero, true);//Si ponemos (nombreFichero,true) add en vez de borrar
			//fw = new FileWriter(new File(NOMBRE_FICHERO));//equivalente
			pw = new PrintWriter(fw);
			pw.println(o);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			//siempre debemos de cerrar el fichero despues de usarlo
			if(fw != null && pw != null){
				pw.close();
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}    
	
	public Double precioTotal(Ordenador o){
		return o.getPrecioTotalComponenets();
	}
	
	

}
