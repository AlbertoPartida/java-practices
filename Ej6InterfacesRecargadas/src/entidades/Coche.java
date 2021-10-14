package entidades;

import interfaz.Movible;

public class Coche extends Vehiculo implements Movible {

	
	public Coche(String id, int caballos, String nombre) {
		super(id, caballos, nombre);
	}

	@Override
	public void mover(int distancia) {
		
		for(int i=1; i<distancia+1; i++) {
			try {
				Thread.sleep(500);
				System.out.println("El coche "+ this.nombre + " avanza " + i + " km");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
