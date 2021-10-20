package ejemplo03;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static ApplicationContext context = null;
	
	
	public static void main(String[] args) {	
		
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Scanner sc = new Scanner(System.in);
		int casos = 0;
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("Escriba el numero de lo que desa hacer ");
			System.out.println("(1.Superheroes, 2.Añadir potencia, 3.Añadir volar,4.Listar potencia o 5.Listar volar, 0. Para salir):");
			System.out.println("-----------------------------------------------");
			System.out.println(" ");
			casos = sc.nextInt();
	
			switch (casos) {
			case 1:
				listarClassicSuperheroes();
				break;
			case 2:
				addSuperheroePotencia(sc);
				break;
			case 3:
				addSuperheroeVolar(sc);
				break;
			case 4:
				listarSuperheroes(context.getBean("listaSuperheroes",List.class));
				break;
			case 5:
				listarSuperheroes(context.getBean("listaSuperheroes2",List.class));
			}
		} while(casos != 0);
		System.out.println("FIN");
	}
	
	private static void listarClassicSuperheroes() {
		
		Superheroe spiderman = context.getBean("spiderman", Superheroe.class);
		System.out.println(spiderman);
		
		Superheroe deadpool = context.getBean("deadpool", Superheroe.class);
		System.out.println(deadpool);
		
		Superheroe drstrange = context.getBean("drstrange", Superheroe.class);
		System.out.println(drstrange);
		
	}
	
	private static void addSuperheroePotencia(Scanner sc) {
		Superheroe sh = context.getBean("superheroesPrototype", Superheroe.class);
		List<Superheroe> listaSuperheroe = 
				context.getBean("listaSuperheroes",List.class);
		
		System.out.println("Nombre");
		String nombre = sc.nextLine();
		sh.setNombre(nombre);
		
		System.out.println("Nombre Superheroe");
		String superHeroe = sc.nextLine();
		sh.setNombreSuperheroe(superHeroe);
		
		System.out.println("Super poder");
		String superPoder = sc.nextLine();
		sh.setSuperPoder(superPoder);
		
		System.out.println("Identificador");
		String id = sc.nextLine();
		sh.setId(id);
		
		listaSuperheroe.add(sh);
		
	}
	
	private static void addSuperheroeVolar(Scanner sc) {
		Superheroe sh = context.getBean("superheroesPrototype2", Superheroe.class);
		List<Superheroe> listaSuperheroe = 
				context.getBean("listaSuperheroes2",List.class);
		
		System.out.println("Nombre");
		String nombre = sc.nextLine();
		sh.setNombre(nombre);
		
		System.out.println("Nombre Superheroe");
		String superHeroe = sc.nextLine();
		sh.setNombreSuperheroe(superHeroe);
		
		System.out.println("Poder");
		int poder = sc.nextInt();
		sh.setPoder(poder);
		
		System.out.println("Identificador");
		String id = sc.nextLine();
		sh.setId(id);
		
		listaSuperheroe.add(sh);

	}
	
	private static void listarSuperheroes(List<Superheroe> listaSuperheroe) {
		for(Superheroe sh : listaSuperheroe) {
			System.out.println(sh);
		}
	}

}
