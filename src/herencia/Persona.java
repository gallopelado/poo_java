package herencia;

import referenciales.Ciudad;
import referenciales.Domicilio;

/**
 * Persona
 * 
 * Se define la clase persona como práctica para plantilla base.
 * 
 * @author Juan Jose González Ramírez <juanftp100@gmail.com>
 *
 */
public class Persona {

	private Integer id;
	private String nombres;//Agregacion
	private String apellidos;
	private Domicilio domicilio = new Domicilio();//Composicion, se hace el new dentro de la clase
	private Ciudad ciudad;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	// En la agregación, el objeto ya viene resuelto de afuera, como en el caso de ciudad.
	public Persona(Integer id, String nombres, String apellidos, Ciudad ciudad, String calles, String nrocasa) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		//domicilio
		/*
		 * Porque se hace de esta manera?
		 * En la linea 9, de domicilio, se realiza una composición, esta fuerte esto guacho!
		 * Resulta ser que, si relacionamos ambas entidades, Una persona __vive__ en un domicilio, este domicilio le pertenece,
		 * por ende, la relación es de 1 a 1(relación identificable en Bases de datos, pero esto de POO, puro y canguro)
		 * Cuando se crea una instancia con este constructor, esa instancia puede tener UNA y SOLO UNA instancia de ciudad, por eso en NEW
		 * Por eso el id de persona es igual al persona_id del domicilio.
		 * Ojo: no estamos hablando del caso cuando la persona TIENE varios domicilios, es dónde vive, no puede vivir en cuatro domicilios
		 * a la vez, por dar ejemplo.
		 * Lo lindo de esto es que, al desaparecer la instancia de persona, automaticamente desaparece la instancia de domicilio.
		 */
		this.domicilio.setPersona_id(id);
		this.domicilio.setCalles(calles);
		this.domicilio.setNrocasa(nrocasa);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
		domicilio.setPersona_id(id);
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	/**
	 * getPersona_id
	 * 
	 * Se obtiene el identificador del domicilio, que es el
	 * identificador de persona.
	 * 
	 * @return Integer persona_id
	 */
	public Integer getPersona_id() {
		return domicilio.getPersona_id();
	}

	public String getCalles() {
		return domicilio.getCalles();
	}

	public void setCalles(String calles) {
		domicilio.setCalles(calles);
	}

	public String getNrocasa() {
		return domicilio.getNrocasa();
	}

	public void setNrocasa(String nrocasa) {
		domicilio.setNrocasa(nrocasa);
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", domicilio=" + domicilio
				+ ", ciudad=" + ciudad + "]";
	}

}
