package vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Ordenador;
import modelo.negocio.GestorOrdenador;

public class Main {
	
	public static ApplicationContext context = null;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
/*		Monitor m = context.getBean("monitor", Monitor.class);
		System.out.println(m);
		Teclado t = context.getBean("teclado", Teclado.class);
		System.out.println(t);
		Raton r = context.getBean("raton", Raton.class);
		System.out.println(r);
		
		ArrayList al = context.getBean("listPerifericos", ArrayList.class);
		System.out.println(al);
		
		GestorOrdenador go = context.getBean("gestorOrdenador", GestorOrdenador.class);
		go.escribir();
		
		PlacaBase pb = context.getBean("placaBase", PlacaBase.class);
		System.out.println(pb);
		
		ArrayList alram = context.getBean("listRam", ArrayList.class);
		System.out.println(alram);
		
		ArrayList altg = context.getBean("listGraficas", ArrayList.class);
		System.out.println(altg);
		
		Ordenador ordenador = context.getBean("ordenador", Ordenador.class);
		ordenador.setPrecio();
		System.out.println(ordenador);
*/		
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
