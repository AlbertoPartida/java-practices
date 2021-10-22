package modelo.entidad;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "marca")
@Scope
public class Marca {

	@Value("MSI,HP,ASUS,DELL,LENOVO")
	String[] listaMarcas = {"MSI","HP","ASUS","DELL","LENOVO"};
	
	

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
