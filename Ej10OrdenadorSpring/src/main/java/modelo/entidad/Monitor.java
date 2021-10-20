package modelo.entidad;

public class Monitor extends Periferico {

	private double hz;
	private double tama�o;
	
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
		return "Monitor [hz=" + hz + ", tama�o=" + tama�o + ", getPrecio()=" + getPrecio() + ", getMarca()="
				+ getMarca() + "]";
	}

	
}
