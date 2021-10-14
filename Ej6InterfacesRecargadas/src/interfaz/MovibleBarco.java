package interfaz;

//Las interfaces son una coleccion de metodos (hasta antes de la version 1.8 de java)
//abstractos
public interface MovibleBarco {
	
	default void mover(int  distancia) {
		
		for(int i=1; i<distancia+1; i++) {
			try {
				Thread.sleep(500);
				System.out.println("El barco navega " + i + " km");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
	}
	
}
