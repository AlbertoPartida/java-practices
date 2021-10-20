package modelo.entidad;

public class Procesador {

	private int id;
	private double precio;
	private double hz;
	private String marca;
	

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
	
	public double getHz() {
		return hz;
	}
	
	public void setHz(double hz) {
		this.hz = hz;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Procesador [id=" + id + ", precio=" + precio + ", hz=" + hz + ", marca=" + marca + "]";
	}

	
}
