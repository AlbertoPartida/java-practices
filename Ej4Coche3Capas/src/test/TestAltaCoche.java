package test;

import modelo.entidad.Coche;
import modelo.negocio.GestorCoche;


public class TestAltaCoche {
	public static void main(String[] args) {
		Coche coche = new Coche();
		coche.setMatricula("1111BCD");
		coche.setMarca("AMG GTR");
		coche.setModelo("Mercedes-Benz");
		coche.setKilometros(54);
		
		GestorCoche gestorCoche = new GestorCoche();
		try {
			boolean alta = gestorCoche.alta(coche);
			if(alta){
				System.out.println("El coche se ha dado de alta");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
