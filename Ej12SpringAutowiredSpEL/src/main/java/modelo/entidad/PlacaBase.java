package modelo.entidad;

public class PlacaBase {

	private int id;
	private String marca;
	private String model;
	private int precio;
	
	
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
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "PlacaBase [id=" + id + ", marca=" + marca + ", model=" + model + ", precio=" + precio + "€]";
	}
}
