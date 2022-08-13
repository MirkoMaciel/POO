import java.util.ArrayList;



public class Familia {

	ArrayList<Persona> familia = new ArrayList<Persona>();
	Integer cantidadIntegrantes = 0 ;
	Integer cantidadPersonas
	String ciudad;
	
	public Familia(Integer cantidadIntegrantes, String direccion, String ciudad) {
		super();
		this.cantidadIntegrantes = cantidadIntegrantes;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	public Integer getCantidadIntegrantes() {
		return cantidadIntegrantes;
	}

	public void setCantidadIntegrantes(Integer cantidadIntegrantes) {
		this.cantidadIntegrantes = cantidadIntegrantes;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
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
	
	public void ingresoVec (Persona persona) {
		generadorIntegrante(persona);
		this.familia.add(persona);	
	}
}