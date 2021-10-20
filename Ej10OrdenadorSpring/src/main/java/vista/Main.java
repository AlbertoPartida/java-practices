package vista;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import modelo.entidad.Ordenador;

public class Main {
	
	public static ApplicationContext context = null;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Ordenador ordenador = context.getBean("ordenador", Ordenador.class);
		System.out.println(ordenador);
		System.out.println("Precio original: " + ordenador.getPrecioTotalComponenets());
		
	}

}
