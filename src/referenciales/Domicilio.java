package referenciales;

public class Domicilio {
	
	private Integer persona_id;
	private String calles;
	private String nrocasa;
	
	public Domicilio() {
		// TODO Auto-generated constructor stub
	}

	public Domicilio(Integer persona_id, String calles, String nrocasa) {
		super();
		this.persona_id = persona_id;
		this.calles = calles;
		this.nrocasa = nrocasa;
	}

	public String getCalles() {
		return calles;
	}

	public void setCalles(String calles) {
		this.calles = calles;
	}

	public String getNrocasa() {
		return nrocasa;
	}

	public void setNrocasa(String nrocasa) {
		this.nrocasa = nrocasa;
	}

	public Integer getPersona_id() {
		return persona_id;
	}

	public void setPersona_id(Integer persona_id) {
		this.persona_id = persona_id;
	}

	@Override
	public String toString() {
		return "Domicilio [persona_id=" + persona_id + ", calles=" + calles + ", nrocasa=" + nrocasa + "]";
	}
	
}
