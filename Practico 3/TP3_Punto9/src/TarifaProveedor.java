
public abstract  class  TarifaProveedor {
	
	
	private Integer totalSMS;
	private Integer totalMinutos;
	private Integer totalGigas;
	private Integer porcentajeExtra;
	private Integer totalPagar;

	
	protected Integer valorxSMS = 1;
	protected Integer valorxLlamada=15;
	protected Integer valorxGiga= 20;
	
	public TarifaProveedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer totalPago () {
		return calcular() + calculoPorcentaje();
	}
	
	public Integer calculoPorcentaje() {
		return(calcular() * porcentajeExtra) / 100;
	}
	
	public Integer calcular () {
		return calcularSMS(totalSMS) + calcularMinutosDeLlamada(totalMinutos) + calcularConsumoGB(totalGigas);
	}
		
	public Integer calcularSMS (Integer totalSMS) {
		return totalSMS * valorxSMS;
	}
	
	public Integer calcularMinutosDeLlamada (Integer totalMinutos ) {
		return totalMinutos * valorxLlamada;
	}
	
	public Integer calcularConsumoGB (Integer totalGigas) {
		return totalGigas * valorxGiga;
	}
	
	
	
	public Integer getTotalSMS() {
		return totalSMS;
	}


	public void setTotalSMS(Integer totalSMS) {
		this.totalSMS = totalSMS;
	}


	public Integer getTotalMinutos() {
		return totalMinutos;
	}


	public void setTotalMinutos(Integer totalMinutos) {
		this.totalMinutos = totalMinutos;
	}


	public Integer getTotalGigas() {
		return totalGigas;
	}


	public void setTotalGigas(Integer totalGigas) {
		this.totalGigas = totalGigas;
	}


	public Integer getTotalPagar() {
		return totalPagar;
	}


	public void setTotalPagar(Integer totalPagar) {
		this.totalPagar = totalPagar;
	}

	
	public Integer getPorcentajeExtra() {
		return porcentajeExtra;
	}


	public void setPorcentajeExtra(Integer porcentajeExtra) {
		this.porcentajeExtra = porcentajeExtra;
	}

	public String getNombre(String nombreProveedor) { //Metodo abstracto que devuelve el nombre del proveedor
		return nombreProveedor;
	}

	
}
