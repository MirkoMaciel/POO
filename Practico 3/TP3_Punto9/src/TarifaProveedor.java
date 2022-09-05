
public abstract  class  TarifaProveedor {
	
	
	private Integer totalSMS;
	private Integer totalMinutos;
	private Integer totalGigas;
	private Integer totalPagar;
	private String nombreProveedor;
	
	protected Integer valorxSMS = 1;
	protected Integer valorxLlamada=15;
	protected Integer valorxGiga= 20;
	
	
	public TarifaProveedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer calcular(Integer totalSMS , Integer totalMinutos , Integer totalGigas) { //calcular el valor a pagar en PESOS, en base a los atributos
		this.totalSMS = calcularSMS(totalSMS);
		this.totalMinutos = calcularMinutosDeLlamada(totalMinutos);
		this.totalGigas = calcularConsumoGB(totalGigas);
		this.totalPagar =  this.totalSMS + this.totalMinutos + this.totalGigas;	
		return this.totalPagar;
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
	
	public String getNombre(String nombreProveedor) { //Metodo abstracto que devuelve el nombre del proveedor
		return nombreProveedor;
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

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombrePorveedor) {
		this.nombreProveedor = nombrePorveedor;
	}
	
	
	
}
