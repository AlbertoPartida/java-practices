package modelo.entidad;

public class Periferico {

	private int id;
	private double precio;
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
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Periferico [id=" + id + ", precio=" + precio + "€, marca=" + marca
				+ "]";
	}
}
