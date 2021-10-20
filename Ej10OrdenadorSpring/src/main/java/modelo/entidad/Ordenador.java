package modelo.entidad;

import java.util.List;

public class Ordenador {

	private int id;
	private double precio;
	private String marca;
	private Procesador procesador;
	private PlacaBase placaBase;
	private List<Ram> listaRam;	
	private List<TarjetaGrafica> listTarjetaGrafica;
	private List<Periferico> listPerifericos;
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Procesador getProcesador() {
		return procesador;
	}
	
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	
	public PlacaBase getPlacaBase() {
		return placaBase;
	}
	
	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}
	
	public List<Ram> getListaRam() {
		return listaRam;
	}
	
	public void setListaRam(List<Ram> listaRam) {
		this.listaRam = listaRam;
	}
	
	public List<TarjetaGrafica> getListTarjetaGrafica() {
		return listTarjetaGrafica;
	}
	
	public void setListTarjetaGrafica(List<TarjetaGrafica> listTarjetaGrafica) {
		this.listTarjetaGrafica = listTarjetaGrafica;
	}
	
	public List<Periferico> getListPerifericos() {
		return listPerifericos;
	}
	
	public void setListPerifericos(List<Periferico> listPerifericos) {
		this.listPerifericos = listPerifericos;
	}
	
	
	public double getPrecioTotalComponenets() {
		
		return this.getPlacaBase().getPrecio() + this.getProcesador().getPrecio()
				+ this.getPrecioPrerifericos() + this.getPrecioRAMS() + this.getPrecioTarjetasGraficas();
	}
	
	public double getPrecioPrerifericos() {
		double precioPerifericos = 0;
		for (Periferico per: this.getListPerifericos()) {
			precioPerifericos = precioPerifericos + per.getPrecio();
		}
		return precioPerifericos;
	}
	
	public double getPrecioRAMS() {
		double precioRams = 0;
		for (Ram ram: this.getListaRam()) {
			precioRams = precioRams + ram.getPrecio();
		}
		return precioRams;
	}
	
	public double getPrecioTarjetasGraficas() {
		double precioTarjetasGraficas = 0;
		for (TarjetaGrafica targ: this.getListTarjetaGrafica()) {
			precioTarjetasGraficas = precioTarjetasGraficas + targ.getPrecio();
		}
		return precioTarjetasGraficas;
	}
	
	@Override
	public String toString() {
		return "Computer [id=" + id + ", marca=" + marca + ", precio=" + precio + "€ "
				+ "\n \t - Procesador=" + procesador 
				+ "\n \t - PlacaBase=" + placaBase
				+ "\n \t - Rams=" + listaRam			
				+ "\n \t - Tarjetas Graficas=" + listTarjetaGrafica 
				+ "\n \t - Perifericos=" + listPerifericos + "]";
	}
}
