
public class ProfesorTitular extends Profesor {

	private final Double valorHora = 300.0;
	private final Double valorAntiguedad = 1000.0;
	private Integer antiguedad;
	
	public ProfesorTitular(String nombre, String apellido, Integer edad, Integer horasTrabajadas, Integer antiguedad) {
		super(nombre, apellido, edad, horasTrabajadas);
		// TODO Auto-generated constructor stub
		this.antiguedad = antiguedad;
	}
	
	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public Double getValorAntiguedad() {
		return valorAntiguedad;
	}

	@Override
	public Double getRemuneracionPorAntiguedad() {
		return getValorAntiguedad() * this.getAntiguedad();
	}

	@Override
	public Double getRemuneracionMensual() {
		return (getValorHora() * this.getHorasTrabajadas()) + this.getRemuneracionPorAntiguedad();
	}
}
