package modelo.entidad;

public class Teclado extends Periferico {

	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Teclado [tipo=" + tipo + ", getPrecio()=" + getPrecio() + ", getMarca()=" + getMarca() + "]";
	}

}
