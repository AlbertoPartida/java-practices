package ordenador;

public class Procesador {

	private static int countId = 0;
	private int id;
	private String marca;
	private double precio;
	private double hz;
	
	public Procesador() {
		this.id = ++Procesador.countId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
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

	@Override
	public String toString() {
		return "Procesador [id=" + id + ", marca=" + marca + ", precio=" + precio + "€, hz=" + hz + "]";
	}
}
