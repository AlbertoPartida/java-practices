package es.curso.modelo.persistencia;


import es.curso.modelo.entidad.Login;


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
