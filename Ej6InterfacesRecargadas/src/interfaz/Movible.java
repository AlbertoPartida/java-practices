package interfaz;

import entidades.Coche;
import entidades.Vehiculo;

//Las interfaces son una coleccion de metodos (hasta antes de la version 1.8 de java)
//abstractos
public interface Movible {
	
	
	default void mover(int  distancia, Vehiculo v ) {
		for(int i=1; i<distancia+1; i++) {
			try {
				Thread.sleep(500);
				if(v instanceof Coche) {
					System.out.println( "El coche " + v.getNombre() + " avanza " + i + " km");
				}else {
					System.out.println( "La moto " + v.getNombre() + " avanza " + i + " km");
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
}
