package es.curso.modelo.entidad;

public class Videojuego {
	
	private int id;
	private String nombre;
	private String compania;
	private String notaMedia;
	private String nombreCreador;
	private String webOficial;

	public Videojuego() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public String getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(String notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String getNombreCreador() {
		return nombreCreador;
	}

	public void setNombreCreador(String nombreCreador) {
		this.nombreCreador = nombreCreador;
	}

	public String getWebOficial() {
		return webOficial;
	}

	public void setWebOficial(String webOficial) {
		this.webOficial = webOficial;
	}

	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", compania=" + compania + ", notaMedia=" + notaMedia
				+ ", nombreCreador=" + nombreCreador + ", webOficial=" + webOficial + "]";
	}	

	
	
}
