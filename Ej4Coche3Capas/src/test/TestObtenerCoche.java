package test;

import java.util.List;
import modelo.entidad.Coche;
import modelo.negocio.GestorCoche;


public class TestObtenerCoche {
	public static void main(String[] args) {
		String matricula = "888BRZ";
		GestorCoche gc = new GestorCoche();
		try {
			Coche coche = gc.obtener(matricula);
			System.out.println(coche);
			
			System.out.println("*******************");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		List<Coche> listaCoche = gc.listar();
		for(Coche c : listaCoche){
			System.out.println(c);
		}
	}
}
