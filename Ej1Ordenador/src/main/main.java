package main;

import java.util.LinkedList;
import java.util.List;

import ordenador.Monitor;
import ordenador.Ordenador;
import ordenador.Periferico;
import ordenador.PlacaBase;
import ordenador.Procesador;
import ordenador.Ram;
import ordenador.Raton;
import ordenador.TarjetaGrafica;
import ordenador.Teclado;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ordenador ordenador = new Ordenador();
		Monitor monitor = new Monitor();
		Teclado teclado = new Teclado();
		Raton raton = new Raton();
		PlacaBase placaBase = new PlacaBase();
		Procesador procesador = new Procesador();
		Ram ram = new Ram();
		TarjetaGrafica tarjetaGrafica = new TarjetaGrafica();
		
		// PlacaBase object
		placaBase.setMarca("ASUS");
		placaBase.setModel("ASUS");
		placaBase.setPrecio(300);
		
		// Procesador
		procesador.setHz(75);
		procesador.setMarca("AMD");
		procesador.setPrecio(200);
		
		// Ram
		ram.setGeneracion("Decima");
		ram.setHz(75);
		ram.setPrecio(300);
		
		//Perifericos
		monitor.setMarca("ACER");
		monitor.setHz(75);
		monitor.setPrecio(120);
		monitor.setTamaño(23.5);	
		
		teclado.setMarca("HP");
		teclado.setTipo("Mecánico");
		teclado.setPrecio(50);
		
		raton.setMarca("ACER");
		raton.setBotones(23);
		raton.setInalambrico(true);
		raton.setPeso(120);
		raton.setPrecio(55);
		
		// Tarjeta Grafica
		tarjetaGrafica.setMarca("NVIDIA");
		tarjetaGrafica.setModelo("GTX1060");
		tarjetaGrafica.setPrecio(500);
		tarjetaGrafica.setRam(ram);
		
		// Adding to Lists
		List<Periferico> perifericos = List.of(monitor,teclado,raton);
		List<TarjetaGrafica> tarjetasGraficas = new LinkedList<TarjetaGrafica>();
		List<Ram> rams = new LinkedList<Ram>();
		
		tarjetasGraficas.add(tarjetaGrafica);
		rams.add(ram);
		
		ordenador.setMarca("Asus");
		ordenador.setPrecio(2000);
		ordenador.setListPerifericos(perifericos);
		ordenador.setListaRam(rams);
		ordenador.setListTarjetaGrafica(tarjetasGraficas);
		ordenador.setPlacaBase(placaBase);
		ordenador.setProcesador(procesador);
		
		System.out.println(ordenador);
		
		//Calculate Price of Components
		System.out.println("Total price of Components: " + ordenador.getTotalPriceComponents() + "€");
	}

}
