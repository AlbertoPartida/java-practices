package modelo.negocio;

import java.util.List;
import modelo.entidad.Coche;
import modelo.persistencia.CocheDaoMySql;
//import modelo.persistencia.PersonaDaoDerby;
import modelo.persistencia.interfaces.DaoCoche;


//Aquí irian todas las reglas de negocio de nuestra aplicacion, se aplicarian
//antes de llamar a la BBDD. Por ejemplo si la persona tiene que tener al
//menos un nombre con 3 caracteres 

public class GestorCoche {
	
	//Aqui podemos jugar con cambiar el dao que queremos usar
	//podemos usar PersonaDaoDerby o PersonaDaoMySql
	//Gracias a las interfaces solo tenemos que cambiar el objeto
	DaoCoche cocheDao = new CocheDaoMySql();
	
	public boolean alta(Coche c) throws Exception{
		//aplicamos la regla de negocio
		if(c.getMatricula().length() < 1) {
			throw new Exception("La matricula del coche es obligatoria");
		}else if(c.getMarca().length() < 1) {
			throw new Exception("La marca del coche es obligatoria");
		}else if(c.getModelo().length() < 1) {
			throw new Exception("El modelo del coche es obligatorio");
		}else if(c.getMatricula().length() == 7) {
			boolean alta = cocheDao.alta(c);
			return alta;
		} else {
			throw new Exception("La matricula debe tener 7 caracteres");
		}
	
	}
	
	public boolean baja(String matricula){
		boolean baja = cocheDao.baja(matricula);
		return baja;
	}
	
	public boolean modificar(Coche c) throws Exception{
		//aplicamos la regla de negocio
		if(c.getMatricula().length() < 1) {
			throw new Exception("La matricula del coche es obligatoria");
		}else if(c.getMarca().length() < 1) {
			throw new Exception("La marca del coche es obligatoria");
		}else if(c.getModelo().length() < 1) {
			throw new Exception("El modelo del coche es obligatorio");
		}else if(c.getMatricula().length() == 7) {
			boolean modificada = cocheDao.modificar(c);
			return modificada;
		} else {
			throw new Exception("La matricula debe tener 7 caracteres");
		}
		
	}
	
	public Coche obtener(String matricula) throws Exception{
		if(matricula.length() < 1) {
			throw new Exception("La matricula del coche es obligatoria");
		}else if(matricula.length() == 7) {
			Coche coche = cocheDao.obtener(matricula);
			return coche;
		} else {
			throw new Exception("La matricula debe tener 7 caracteres");
		}	
	}
	
	public List<Coche> listar(){
		List<Coche> listaCoche = cocheDao.listar();
		return listaCoche;
	}
	
}
