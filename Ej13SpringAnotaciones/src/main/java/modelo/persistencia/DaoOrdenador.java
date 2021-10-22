package modelo.persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import modelo.entidad.Ordenador;

@Component 
@Scope(value="prototype")
public class DaoOrdenador {

	/**
	 * Metodo que inserta un ordenador en un fichero
	 * @param o es el ordenador y nombreFichero en donse se insertara
	 * @return true en caso correcto, false en caso contrario
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
	
	public void escribir() {
		System.out.println("holaaa");
	}

}
