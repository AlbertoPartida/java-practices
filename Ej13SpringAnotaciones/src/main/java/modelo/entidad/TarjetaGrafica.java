package modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="gigabyte")
@Scope(value="prototype")
public class TarjetaGrafica {

	@Value("1")
	private int id;
	
	@Value("#{marca.getMarca()}")
	private String marca;
	
	@Autowired
	//Si queremos hacerlo por id utilizaremos la etiqueta @Qualifier, 
	//ademas de @Autowire
	@Qualifier("goodram")
	private Ram ram;
	
	@Value("GeForce RTX3070")
	private String modelo;
	
	@Value("#{T(java.lang.Math).round(T(java.lang.Math).random() * 2000 )}")
	private double precio;
	
	
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
	
	public Ram getRam() {
		return ram;
	}
	
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "TarjetaGrafica [id=" + id + ", marca=" + marca + ", ram=" + ram + ", modelo=" + modelo + ", precio="
				+ precio + "€]";
	}
}
