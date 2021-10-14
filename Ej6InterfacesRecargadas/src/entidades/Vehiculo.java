package entidades;



public abstract class Vehiculo {

	 String id;
	 int caballos;
	 String nombre;
	
	public Vehiculo(String id, int caballos, String nombre) {
		this.id = id;
		this.caballos = caballos;
		this.nombre = nombre;
	}
	

	public abstract void mover(int distancia);

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
