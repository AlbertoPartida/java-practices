package es.curso.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import es.curso.modelo.entidad.Login;
import es.curso.modelo.persistencia.DaoLogin;

//Anotaciones de Spring
@Component
@Scope("prototype")
public class GestorLogin {	

	@Autowired
	private DaoLogin loginDao;
	
	public boolean buscar(Login login) {
		loginDao = new DaoLogin();
		return loginDao.buscar(login);
	}
	
}
