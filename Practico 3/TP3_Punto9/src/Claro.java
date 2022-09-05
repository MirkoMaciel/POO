
public class Claro extends TarifaProveedor {

	private Integer porcentajeAdherido= 20;
	private Integer tarifaActual;
	
	public Claro(Integer totalSMS , Integer totalMinutos, Integer totalGigas) {
		super();
		this.setTotalSMS(totalSMS);
		this.setTotalMinutos(totalMinutos);
		this.setTotalGigas(totalGigas);
		// TODO Auto-generated constructor stub
	}

	public void tarifaClaro() {
		this.setTotalPagar(calcular());
		Integer extraAlPago;
		extraAlPago = (this.getTotalPagar() * porcentajeAdherido) / 100 ;
		this.tarifaActual = (this.getTotalPagar() + extraAlPago);
	}
	

	public Integer getTarifaActual() {
		return tarifaActual;
	}

	public void setTarifaActual(Integer tarifaActual) {
		this.tarifaActual = tarifaActual;
	}
	

	
}