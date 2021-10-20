package text;

import java.util.ArrayList;

import entidades.Avion;
import entidades.Barco;
import entidades.Coche;
import entidades.Moto;
import entidades.Vehiculo;

public class Main {

	public static void main(String[] args) {
		
		Vehiculo coche = new Coche("1",150, "Peugeot");
//		coche.mover(5);
		
		Vehiculo moto = new Moto("2",75,"Honda");
//		moto.mover(2);
		
		Vehiculo avion = new Avion("3", 1, "Eurofighter");
//		avion.mover(2);
		
		Vehiculo barco = new Barco("4", 5, "La Santa Maria");
//		barco.mover(5);
		
		ArrayList<Vehiculo> array = new ArrayList<>();
	    
		array.add(coche);
		array.add(moto);
		array.add(avion);
		array.add(barco);
		
		for (Vehiculo vehiculo: array) {
			vehiculo.mover(5);
		}
		
	}

}
