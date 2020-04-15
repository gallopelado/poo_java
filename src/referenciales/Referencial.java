package referenciales;

public class Referencial {
	
	private String id;
	private String nombre;
	private String fechacreacion;
	private String creacionusuario;
	private String fechamodificacion;
	private String modificacionusuario;
	
	public Referencial() {
		// TODO Auto-generated constructor stub
	}

	public Referencial(String id, String nombre, String fechacreacion, String creacionusuario, String fechamodificacion,
			String modificacionusuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechacreacion = fechacreacion;
		this.creacionusuario = creacionusuario;
		this.fechamodificacion = fechamodificacion;
		this.modificacionusuario = modificacionusuario;
	}

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

	public String getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getCreacionusuario() {
		return creacionusuario;
	}

	public void setCreacionusuario(String creacionusuario) {
		this.creacionusuario = creacionusuario;
	}

	public String getFechamodificacion() {
		return fechamodificacion;
	}

	public void setFechamodificacion(String fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	public String getModificacionusuario() {
		return modificacionusuario;
	}

	public void setModificacionusuario(String modificacionusuario) {
		this.modificacionusuario = modificacionusuario;
	}

	@Override
	public String toString() {
		return "Referencial [id=" + id + ", nombre=" + nombre + ", fechacreacion=" + fechacreacion
				+ ", creacionusuario=" + creacionusuario + ", fechamodificacion=" + fechamodificacion
				+ ", modificacionusuario=" + modificacionusuario + "]";
	}
	
}
