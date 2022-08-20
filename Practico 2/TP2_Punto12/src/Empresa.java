import java.util.ArrayList;


public class Empresa {
	String nombre;
	String direccion;
	ArrayList<Persona> empleados = new ArrayList<Persona>();
	
	public Empresa(String nombre, String direccion, ArrayList<Persona> empleados) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.empleados = empleados;
	}
	
	public Empresa() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Persona> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Persona> empleados) {
		this.empleados = empleados;
	}
	
	public void generarEmpleado (Persona persona) {
		System.out.println("Nombre: "); persona.setNombre(persona.getNombre());
		System.out.println("Apellido: "); persona.setApellido(persona.getApellido());
		System.out.println("Fecha Nacimiento: ");persona.setFechaNacimiento(persona.getFechaNacimiento());
	}
	
	public void añadirEmpleado (Persona persona) {
		generarEmpleado(persona);
		empleados.add(persona);
	}
	
	public Integer cantidadEmpleados(ArrayList<Persona> empleados) {
		return empleados.size();
	}
	
	
	
}
