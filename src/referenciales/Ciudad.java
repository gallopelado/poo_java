package referenciales;

public class Ciudad {
	private String idciudad;
	private String nombre_ciudad;
	private String capital;
	
	public Ciudad() {
		// TODO Auto-generated constructor stub
	}

	public Ciudad(String idciudad, String nombre_ciudad, String capital) {
		super();
		this.idciudad = idciudad;
		this.nombre_ciudad = nombre_ciudad;
		this.capital = capital;
	}

	public String getIdciudad() {
		return idciudad;
	}

	public void setIdciudad(String idciudad) {
		this.idciudad = idciudad;
	}

	public String getNombre_ciudad() {
		return nombre_ciudad;
	}

	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Ciudad [idciudad=" + idciudad + ", nombre_ciudad=" + nombre_ciudad + ", capital=" + capital + "]";
	}

	
}
