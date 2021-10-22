package modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component (value="teclado")
@Scope
public class Teclado extends Periferico {

	@Value("mecanico")
	private String tipo;
	
	public Teclado() {
		super();
		this.setMarca(new Marca().getMarca());
		this.setPrecio(Math.round(Math.random() * 700));
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Teclado [tipo=" + tipo + ", Precio=" + getPrecio() + ", Marca=" + getMarca() + "]";
	}

}
