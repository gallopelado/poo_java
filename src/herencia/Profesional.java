package herencia;

import referenciales.Ciudad;
import referenciales.Domicilio;
import referenciales.Especialidad;

public class Profesional extends Persona {

	private String codigo_profesion;
	private Especialidad especialidad;
	
	public Profesional() {
		// TODO Auto-generated constructor stub
	}

	public Profesional(Integer id, String nombres, String apellidos, Ciudad ciudad, String calles, String nrocasa,
			String codigo_profesion, Especialidad especialidad) {
		super(id, nombres, apellidos, ciudad, calles, nrocasa);
		this.codigo_profesion = codigo_profesion;
		this.especialidad = especialidad;
	}

	public String getCodigo_profesion() {
		return codigo_profesion;
	}

	public void setCodigo_profesion(String codigo_profesion) {
		this.codigo_profesion = codigo_profesion;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesional [codigo_profesion=" + codigo_profesion + ", especialidad=" + especialidad + ", toString()="
				+ super.toString() + "]";
	}

}
