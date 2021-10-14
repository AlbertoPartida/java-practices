package entidades;

import interfaz.Movible;

public class Avion extends Vehiculo {

	
	
	public Avion(String id, int caballos, String nombre) {
		super(id, caballos, nombre);
	}

	@Override
	public void mover(int distancia) {
		
		int distanciaTotal = distancia + (caballos*3);
		
		for(int i=1; i<distanciaTotal+1; i++) {
			try {
				Thread.sleep(500);
				System.out.println("El avion "+ this.nombre + " vuela " + i + " km");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
}
