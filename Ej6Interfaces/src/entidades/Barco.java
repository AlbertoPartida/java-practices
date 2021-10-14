package entidades;

import interfaz.Movible;

public class Barco extends Vehiculo {
	
	public Barco(String id, int caballos, String nombre) {
		super(id, caballos, nombre);
	}

	@Override
	public void mover(int distancia) {
		int distanciaTotal = distancia + (caballos*2);
		
		for(int i=1; i<distanciaTotal+1; i++) {
			try {
				Thread.sleep(500);
				System.out.println("El barco "+ this.nombre + " navega " + i + " km");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
}
