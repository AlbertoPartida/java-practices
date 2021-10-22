package modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import modelo.entidad.Ordenador;
import modelo.persistencia.DaoOrdenador;

@Component
@Scope(value="prototype")
public class GestorOrdenador {
	
	@Autowired
	private DaoOrdenador daoOrdenador;
	
	@Value("ordenador.txt")
	private String nombreFichero;
	
	/**
	 * Metodo que persiste un ordenador en un fichero
	 * @param o un ordenador 
	 * @return true si se inserto bien y false si fue algo mal
	 */
	public boolean persistir(Ordenador o) {
		return daoOrdenador.persistir(o, this.nombreFichero);
	}
	

	public void escribir() {
		daoOrdenador.escribir();
	}
	
	
	
}
