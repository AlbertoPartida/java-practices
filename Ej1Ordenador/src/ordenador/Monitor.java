package ordenador;

public class Monitor extends Periferico {

	private double hz;
	private double tamaño;
	
	public double getHz() {
		return hz;
	}
	
	public void setHz(double hz) {
		this.hz = hz;
	}
	
	public double getTamaño() {
		return tamaño;
	}
	
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return super.toString() + "Monitor [hz=" + hz + ", tamaño=" + tamaño + "]";
	}
}
