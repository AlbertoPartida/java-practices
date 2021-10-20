package vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import modelo.entidad.Ordenador;
import modelo.negocio.GestorOrdenador;

public class Main {
	
	public static ApplicationContext context = null;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Ordenador ordenador = context.getBean("ordenador", Ordenador.class);
		ordenador.setPrecio();
		System.out.println(ordenador);
		System.out.println("Precio original: " + ordenador.getPrecioTotalComponenets());
		
		GestorOrdenador go = context.getBean("gestorOrdenador",GestorOrdenador.class);
		
		boolean respuesta = go.persistir(ordenador);
		if(respuesta) {
			System.out.println("Ordenador Persistido");
		}else {
			System.out.println("No fue posible");
		}
			
	}

}
