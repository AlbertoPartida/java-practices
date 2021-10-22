package modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component (value="monitor")
@Scope
public class Monitor extends Periferico {
	
	@Value("166")
	private double hz;
	
	@Value("25")
	private double tama�o;
	
	
	
	public Monitor() {
		super();
		this.setMarca(new Marca().getMarca());
		this.setPrecio(Math.round(Math.random() * 1000));
	}

	public double getHz() {
		return hz;
	}
	
	public void setHz(double hz) {
		this.hz = hz;
	}
	
	public double getTama�o() {
		return tama�o;
	}
	
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Monitor [hz=" + hz + ", tama�o=" + tama�o + ", Precio=" + getPrecio() + ", Marca="
				+ getMarca() + "]";
	}

	
}
