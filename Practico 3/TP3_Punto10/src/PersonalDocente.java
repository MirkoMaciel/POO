
public class PersonalDocente extends PersonalUniversitario{

	private Double horasTrabajadas;
//	private Double horaSemiExclusiva = 20.0;
//	private Double exclusiva= 40.0	;
	

	public PersonalDocente(String nombre, String apellido, Integer antiguedad, String sector,Double horasTrabajadas) {
		super(nombre, apellido, antiguedad, sector);
		// TODO Auto-generated constructor stub
		this.horasTrabajadas=horasTrabajadas;
	}
	
	public Double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	
	
	
}
