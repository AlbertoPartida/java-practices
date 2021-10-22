package modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component (value="raton")
@Scope
public class Raton extends Periferico{
	
	@Value("5")
	private int botones;
	
	@Value("true")
	private boolean inalambrico;
	
	
	
	public Raton() {
		super();
		this.setMarca(new Marca().getMarca());
		this.setPrecio(Math.round(Math.random() * 700));
	}

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
		return "Raton [botones=" + botones + ", inalambrico=" + inalambrico + ", Precio=" + getPrecio()
				+ ", Marca=" + getMarca() + "]";
	}

	

	
}
