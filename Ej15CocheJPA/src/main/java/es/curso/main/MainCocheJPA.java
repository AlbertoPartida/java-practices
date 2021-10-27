package es.curso.main;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.curso.cfg.ConfiguracionJPA;
import es.curso.modelo.entidad.Coche;
import es.curso.modelo.negocio.GestorCoche;

public class MainCocheJPA {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext(ConfiguracionJPA.class);
		System.out.println("Inicializando BBDD...");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el numero de lo que desa hacer ");
		System.out.print("(1.Añadir, 2.Eliminar, 3.Modificar,4. Obtener o 5.Listar):");

		GestorCoche gc = context.getBean(GestorCoche.class);
		
		String casos = sc.nextLine();

		switch (casos) {
		case "1":
			altaModificarCoche(sc, gc, true);
			System.out.println("**** INSERTANDO COCHE ****");
			break;
		case "2":
			eliminarCoche(sc, gc);
			System.out.println("**** BORRAR COCHE ****");
			break;
		case "3":
			altaModificarCoche(sc, gc, false);
			System.out.println("**** MODIFICAR COCHE ****");
			break;
		case "4":
			buscarCoche(sc, gc);
			System.out.println("**** BUSCAR COCHE ****");
			break;
		case "5":
			listarCoches(gc);
			System.out.println("**** LISTAR COCHES ****");
		}

	}
	
	private static void listarCoches(GestorCoche gc) {
		List<Coche> listaCoches = gc.listar();
		for (Coche c : listaCoches) {
			System.out.println(c);
		}
	}

	private static void buscarCoche(Scanner sc, GestorCoche gc) {
		System.out.print("Escribe la matricula: ");
		String idL = sc.nextLine();
		Coche coche = gc.obtener(Integer.parseInt(idL));
		System.out.println(coche);
	}

	private static void eliminarCoche(Scanner sc, GestorCoche gc) {
		System.out.print("Escribe la id del coche: ");
		String idE = sc.nextLine();
		int baja = gc.baja(Integer.parseInt(idE));
		if (baja != 0 ) {
			System.out.println("El coche se ha eliminado");
		} else {
			System.out.println("El coche NO se ha eliminado");
		}
	}

	private static void altaModificarCoche(Scanner sc, GestorCoche gc, boolean alta) {
		Coche cocheA = new Coche();
		System.out.print("Escribe la marca: ");
		String marcaA = sc.nextLine();
		cocheA.setMarca(marcaA);
		System.out.print("Escribe el modelo: ");
		String modeloA = sc.nextLine();
		cocheA.setModelo(modeloA);
		System.out.print("Escribe los kilometros: ");
		String kmA = sc.nextLine();
		cocheA.setKm(Integer.parseInt(kmA));
		System.out.print("Escribe la matricula: ");
		String matriculaA = sc.nextLine();
		cocheA.setMatricula(matriculaA);

		int resultado = 0;
		if(alta)
			resultado = gc.alta(cocheA);
		else
			cocheA = gc.modificar(cocheA);
		
		if (resultado == 0) {
			System.out.println("El coche se ha incluido");
		} else if ( resultado == 2 || resultado == 3 || resultado == 4) {
				System.out.println("LAS CASILLAS MODELO MATRICULA Y MARCA SON OBLIGATORIAS");
		} else if(resultado == 1) {
			System.out.println("LA LONGITUD DE CARACTERES DE UNA MATRICULA ES DE 7 CARACTERES");
		} else if(resultado == 5) {
			System.out.println("Ha habido un fallo con la BBDD");
		}
	}
}
