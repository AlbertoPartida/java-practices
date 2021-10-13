package test;

import modelo.entidad.Coche;
import modelo.negocio.GestorCoche;

public class TestModificarCoche {
	public static void main(String[] args) {
		Coche coche = new Coche();
		coche.setMatricula("0005LLL");
		coche.setMarca("");
		coche.setModelo("Mercedes-Benz");
		coche.setKilometros(54);
		
		GestorCoche gestorCoche = new GestorCoche();
		try {
			boolean modificar = gestorCoche.modificar(coche);
			if(modificar){
				System.out.println("El coche se ha modificado");
			}else {
				System.out.println("El coche no existe");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
