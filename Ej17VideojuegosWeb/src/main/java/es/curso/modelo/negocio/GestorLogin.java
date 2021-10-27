package es.curso.modelo.negocio;

import es.curso.modelo.entidad.Login;
import es.curso.modelo.persistencia.DaoLogin;


public class GestorLogin {	

	private DaoLogin loginDao;
	
	public boolean buscar(Login login) {
		loginDao = new DaoLogin();
		return loginDao.buscar(login);
	}
	
}
