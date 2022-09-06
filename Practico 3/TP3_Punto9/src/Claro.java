
public class Claro extends TarifaProveedor {


	public Claro() {
		super();
	}
	
	public Claro (Integer totalSMS , Integer totalMinutos , Integer totalGigas) {
		super();
		this.setTotalSMS(totalSMS);
		this.setTotalMinutos(totalMinutos);
		this.setTotalGigas(totalGigas);
		this.setPorcentajeExtra(20);
	}


}