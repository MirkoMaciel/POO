import java.util.Scanner;

public class Persona {

	private String nombre;
	private String apellido;
	private String edad;
	private String sexo;
	private Boolean estudio;
	private Boolean trabajo;
	Scanner in = new Scanner(System.in);
	
	public Persona (String nombre , String apellido , String edad , String sexo ,
			Boolean estudio , Boolean trabajo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.estudio = estudio;
		this.trabajo = trabajo;
	}
	
	
	public Persona() {
		super();
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		nombre = in.nextLine();
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		apellido = in.nextLine();
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		edad = in.nextLine();
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		sexo= in.nextLine();
		this.sexo = sexo;
	}

	public Boolean getEstudio() {
		return estudio;
	}

	public void setEstudio(Boolean estudio) {
		this.estudio = estudio;
	}

	public Boolean getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Boolean trabajo) {
		this.trabajo = trabajo;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo
				+ ", estudio=" + estudio + ", trabajo=" + trabajo + "]";
	}
	
	
	
	


}
