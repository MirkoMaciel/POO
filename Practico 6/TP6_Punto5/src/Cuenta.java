
public class Cuenta {

	private Double saldo;

	public Cuenta(Double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public void descuentoSaldo(Double valor) {
		this.saldo = this.saldo - valor;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	
	
}
