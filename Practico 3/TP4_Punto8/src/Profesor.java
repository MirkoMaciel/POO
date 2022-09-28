
public abstract class Profesor {
	
	private String nombre;
	private String apellido;
	private Integer edad;
	private Integer horasTrabajadas;
	

	public Profesor(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.horasTrabajadas = horasTrabajadas;
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}



	public abstract Double getRemuneracionPorAntiguedad(); //No siempre debe ser VOID, depende el parametro que necesites
	
	public abstract Double getRemuneracionMensual();
	
}
