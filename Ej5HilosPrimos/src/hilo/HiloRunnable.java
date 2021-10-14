package hilo;

public class HiloRunnable implements Runnable{

	private int posiblePrimo;

	// String name
	public HiloRunnable(int posiblePrimo) {
		this.posiblePrimo = posiblePrimo;
	}

	// Una vez que arranquemos el hilo, inmediantamente despues ejecutará el 
	// metodo "run". Un hilo siempre se debe arrancar con el metodo "start"
	// que esta implementado en la clase Tread, y sera este el que llame a su
	// vez al metodo "run"
	// Este metodo lo podemos entender como un "main"
	// La ciclo de vida de este hilo sería desde el inicio del metodo hasta el 
	// final del mismo
	@Override
	public void run() {
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName() + " con el numero " + this.posiblePrimo);
		long startTime = System.nanoTime();
		
		boolean primo = false;
	   	primo = this.isPrime();
	   	if(primo) {
	   		System.out.println("El nuemro " + this.posiblePrimo +" es primo.");
	   	}else {
	   		System.out.println("El nuemro " + this.posiblePrimo +" no es primo.");
	   	}
	   	long endTime = System.nanoTime() - startTime;
	   	System.out.println("El hilo " + Thread.currentThread().getName() + " tardo: " + endTime/1e6 + " ms" );
		
	}
	
	/**
	 * 
	 * @return retorna true o false si el numero que le estas pasando a la clase HiloRunnable en el 
	 * constructor es primo.
	 */
	
	
	//Revisa si un numero entero es primo o no.
	boolean isPrime() {
	    //revisa si n es multiplo de 2
	    if (this.posiblePrimo%2==0) return false;
	    //si no, solo revisa los impares
	    for(int i=3;i*i<=this.posiblePrimo;i+=2) {
	        if(this.posiblePrimo%i==0)
	            return false;
	    }
	    return true;
	}
	
}
