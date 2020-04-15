package herencia;

import referenciales.Barrio;
import referenciales.Ciudad;
import referenciales.Domicilio;
import referenciales.Especialidad;

public class PruebaPersona {

	public static void main(String[] args) {
		
		//Domicilio domicilio =  new Domicilio("Calle1 c/ Calle2", "333");
		Ciudad ciudad = new Ciudad("01", "Guarambare", "G2");
		//Especialidad especialidad = new Especialidad("01", "Ingeniero");
		//Persona persona1 = new Persona("Fernando", "Asilvera", domicilio, ciudad);
		
		//System.out.println(persona1);
		
		//Profesional profesional = new Profesional("Fernando", "Asilvera", domicilio, ciudad, "63636", especialidad);
		//System.out.println( profesional.getEspecialidad().getNombre_especialidad() );
		
		//Barrio barrio = new Barrio("33", "Los frijoles", "01/01/2020", "sys", null, null, "23", "633", "60");
		
		Persona persona2 = new Persona(1, "Juan", "Gonzalez", ciudad, "Palma esq. Acceso Sur", "173");
		System.out.println(persona2);
		
	}

}
