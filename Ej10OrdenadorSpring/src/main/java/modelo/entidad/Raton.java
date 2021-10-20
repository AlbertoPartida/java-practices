package modelo.entidad;

public class Raton extends Periferico{

	private int botones;
	private boolean inalambrico;
	
	
	public int getBotones() {
		return botones;
	}
	
	public void setBotones(int botones) {
		this.botones = botones;
	}
	
	public boolean isInalambrico() {
		return inalambrico;
	}
	
	public void setInalambrico(boolean inalambrico) {
		this.inalambrico = inalambrico;
	}

	@Override
	public String toString() {
		return "Raton [botones=" + botones + ", inalambrico=" + inalambrico + ", getPrecio()=" + getPrecio()
				+ ", getMarca()=" + getMarca() + "]";
	}

	

	
}
