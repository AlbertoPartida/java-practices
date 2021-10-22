package modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="corsair")
@Scope(value="prototype")
public class Ram {

	@Value("1")
	private int id;
	
	@Value("#{T(java.lang.Math).round(T(java.lang.Math).random() * 700 )}")
	private double precio;
	
	@Value("3200")
	private double hz;
	
	@Value("16")
	private String generacion;
	
	
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
	
	public String getGeneracion() {
		return generacion;
	}
	
	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ram [id= " + id + " precio=" + precio + "€, hz=" + hz + ", generacion=" + generacion + "]";
	}
}
