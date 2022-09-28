
public class PersonalUniversitario {

	private String nombre;
	private String apellido;
	private Integer antiguedad;
	private String sector;
	

	public PersonalUniversitario(String nombre, String apellido, Integer antiguedad, String sector) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
		this.sector = sector;
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


	public Integer getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}

	
	
	
}
