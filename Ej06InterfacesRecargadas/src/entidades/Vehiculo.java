package entidades;

import interfaz.Movible;
import interfaz.MovibleAvion;
import interfaz.MovibleBarco;

public class Vehiculo implements Movible, MovibleBarco, MovibleAvion{

	 String id;
	 int caballos;
	 String nombre;
	
	public Vehiculo(String id, int caballos, String nombre) {
		this.id = id;
		this.caballos = caballos;
		this.nombre = nombre;
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

	@Override
	public void mover(int distancia) {
		if(this instanceof Moto || this instanceof Coche) {
			Movible.super.mover(distancia,this);
		}
		if(this instanceof Barco) {
			MovibleBarco.super.mover(distancia + (this.caballos*2));
		}
		if(this instanceof Avion) {
			MovibleAvion.super.mover(distancia + (this.caballos*3));
		}
	}
	
}
