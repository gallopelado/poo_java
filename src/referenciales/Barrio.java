package referenciales;

public class Barrio extends Referencial {

	private String nromanzana;
	private String area;
	private String poblacion;
	
	public Barrio() {
		// TODO Auto-generated constructor stub
	}

	public Barrio(String id, String nombre, String fechacreacion, String creacionusuario, String fechamodificacion,
			String modificacionusuario, String nromanzana, String area, String poblacion) {
		super(id, nombre, fechacreacion, creacionusuario, fechamodificacion, modificacionusuario);
		this.nromanzana = nromanzana;
		this.area = area;
		this.poblacion = poblacion;
	}

	public String getNromanzana() {
		return nromanzana;
	}

	public void setNromanzana(String nromanzana) {
		this.nromanzana = nromanzana;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	@Override
	public String toString() {
		return "Barrio [nromanzana=" + nromanzana + ", area=" + area + ", poblacion=" + poblacion + ", toString()="
				+ super.toString() + "]";
	}
	
}
