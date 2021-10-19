package ejemplo03;

public class Superheroe {
	private String id;
	private String nombre;
	private String nombreSuperheroe;
	private int poder;
	private String superPoder;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreSuperheroe() {
		return nombreSuperheroe;
	}

	public void setNombreSuperheroe(String nombreSuperheroe) {
		this.nombreSuperheroe = nombreSuperheroe;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public String getSuperPoder() {
		return superPoder;
	}

	public void setSuperPoder(String superPoder) {
		this.superPoder = superPoder;
	}

	@Override
	public String toString() {
		return "Superheroe [id=" + id + ", nombre=" + nombre + ", nombreSuperheroe=" + nombreSuperheroe + ", poder="
				+ poder + ", superPoder=" + superPoder + "]";
	}

	
	
	
	
}
