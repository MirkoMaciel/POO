
public class Alumno {

	private String nombre;
	private String apellido;
	private int dni;
	

	public Alumno(String nombre, String apellido, int dni) { //COnstructor
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public Alumno (String nombre , String apellido) { //Super posicion de clases 
		//Constructor 2
	}
	
	public Alumno () { //Super posicion de clases
		
	}
	//getters and setters de los atributos.
	
	public String getNombreYApellido () {
		return nombre + apellido;
	}
	
	public String getNombre() { 
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
	
	
	
}

