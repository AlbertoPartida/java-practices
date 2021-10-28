package es.curso.modelo.persistencia;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import es.curso.modelo.entidad.Login;

//Anotaciones de Spring
@Component
@Scope("prototype")
public class DaoLogin {
	
	private String usuario = "Alberto";
	private String password = "trece";

	public DaoLogin() {
	}
	
	public boolean buscar(Login login){
		if(login.getUsuario().equals(this.usuario) && login.getPassword().equals(this.password)) {
			return true;
		}
		return false;
	}
}
