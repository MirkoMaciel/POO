
public class ProfesorSuplente extends Profesor {

	private final Double valorHora = 200.0;

	public ProfesorSuplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
		super(nombre, apellido, edad, horasTrabajadas);
		// TODO Auto-generated constructor stub
	}

	public Double getValorHora() {
		return valorHora;
	}

	@Override
	public Double getRemuneracionMensual() {
		return getValorHora() * this.getHorasTrabajadas();
	}
		
	public Double getRemuneracionPorAntiguedad() {
		return null;
	}
}
