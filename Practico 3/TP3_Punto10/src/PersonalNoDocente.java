
public class PersonalNoDocente extends PersonalUniversitario{

	private Double jornada;
//	private Double jornadaDos = 20.0 ;
	
	public PersonalNoDocente(String nombre, String apellido, Integer antiguedad, String sector, Double jornada) {
		super(nombre, apellido, antiguedad, sector);
		// TODO Auto-generated constructor stub
		this.jornada=jornada;
	}

	public Double getJornada() {
		return jornada;
	}

	public void setJornada(Double jornada) {
		this.jornada = jornada;
	}

	
	
}
