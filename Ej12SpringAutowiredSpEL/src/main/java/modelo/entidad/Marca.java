package modelo.entidad;

import java.util.concurrent.ThreadLocalRandom;

public class Marca {

	String[] listaMarcas ;
	

	public String[] getListaMarcas() {
		return listaMarcas;
	}

	public void setListaMarcas(String[] listaMarcas) {
		this.listaMarcas = listaMarcas;
	}

	public String getMarca() {
		int indiceAleatorio = ThreadLocalRandom.current().nextInt(0,listaMarcas.length);
		return listaMarcas[indiceAleatorio];
	}	
	
	@Override
	public String toString() {
		return "Marca [marcas=" + listaMarcas + "]";
	}
	
	
	
}
