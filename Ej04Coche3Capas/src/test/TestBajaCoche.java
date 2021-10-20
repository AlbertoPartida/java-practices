package test;

import modelo.negocio.GestorCoche;


public class TestBajaCoche {
	public static void main(String[] args) {
		GestorCoche gc = new GestorCoche();
		String matricula = "1111CD";
		
		boolean baja = gc.baja(matricula);
		if(baja){
			System.out.println("El coche se ha dado de baja");
		}else{
			System.out.println("El coche NO se ha dado de baja");
		}
	}
}
