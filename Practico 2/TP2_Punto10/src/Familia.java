import java.util.ArrayList;



public class Familia {

	ArrayList<Persona> integrante = new ArrayList<Persona>(); //Arreglo de personas
	Integer cantidadFamilias = 0;
	Integer cantidadIntegrantes = 0 ;
	Integer cantidadPersonas = 0;
	Float promedioEdad; 
	
	public Familia(ArrayList<Persona> integrante , Integer cantidadFamilias , Integer cantidadIntegrantes, Integer cantidadPersonas , Float promedioEdad) {
		super();
		this.integrante = integrante;
		this.cantidadFamilias = cantidadFamilias;
		this.cantidadIntegrantes = cantidadIntegrantes;
		this.cantidadPersonas = cantidadPersonas;
		this.promedioEdad = promedioEdad;
		
	}
		
	
	
	public Familia() {
		super();
	}



	public ArrayList<Persona> getIntegrante() {
		return integrante;
	}


	public void setIntegrante(ArrayList<Persona> integrante) {
		this.integrante = integrante;
	}


	public Integer getCantidadIntegrantes() {
		return cantidadIntegrantes;
	}

	public void setCantidadIntegrantes(Integer cantidadIntegrantes) {
		this.cantidadIntegrantes = cantidadIntegrantes;
	}
	
	public Integer getCantidadFamilias() {
		return cantidadFamilias;
	}

	public void setCantidadFamilias(Integer cantidadFamilias) {
		this.cantidadFamilias = cantidadFamilias;
	}

	public Integer getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(Integer cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public Float getPromedioEdad() {
		return promedioEdad;
	}

	public void setPromedioEdad(Float promedioEdad) {
		this.promedioEdad = promedioEdad;
	}

	public void generadorIntegrante(Persona persona) {
		
		System.out.println("Integrante: ");
		System.out.print("Nombre "); persona.setNombre(persona.getNombre());
		System.out.print("Apellido "); persona.setApellido(persona.getApellido());
		System.out.print("Edad "); persona.setEdad(persona.getEdad());
		System.out.print("Sexo "); persona.setSexo(persona.getSexo());
		System.out.print("Estudio "); persona.setEstudio(persona.getEstudio());
		System.out.print("Trabajo "); persona.setTrabajo(persona.getTrabajo());

	}
	
	public void generadorFamilia (Persona persona) {
		generadorIntegrante(persona);
		this.integrante.add(persona);	
	}
}