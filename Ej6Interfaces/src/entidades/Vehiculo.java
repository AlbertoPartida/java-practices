package entidades;

import interfaz.Movible;

public class Vehiculo implements Movible{

	 String id;
	 int caballos;
	 String nombre;
	
	public Vehiculo(String id, int caballos, String nombre) {
		this.id = id;
		this.caballos = caballos;
		this.nombre = nombre;
	}
	
	@Override
	public void mover(int distancia) {
		System.out.println("paso por vehiculo");
	}

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
