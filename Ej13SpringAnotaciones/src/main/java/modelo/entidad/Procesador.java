package modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope
public class Procesador {

	@Value("1")
	private int id;
	
	@Value("#{T(java.lang.Math).round(T(java.lang.Math).random() * 1000 )}")
	private double precio;
	
	@Value("39")
	private double hz;
	
	@Value("#{marca.getMarca()}")
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
