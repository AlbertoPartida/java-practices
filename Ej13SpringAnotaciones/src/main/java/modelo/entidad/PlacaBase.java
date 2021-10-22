package modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope
public class PlacaBase {

	@Value("1")
	private int id;
	
	@Value("#{marca.getMarca()}")
	private String marca;
	
	@Value("MAG X570")
	private String model;
	
	@Value("#{T(java.lang.Math).round(T(java.lang.Math).random() * 1000 )}")
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
