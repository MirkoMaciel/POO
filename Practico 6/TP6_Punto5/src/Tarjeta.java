
public class Tarjeta extends Thread{

	private Integer id;
	private Cuenta cuenta;
	private final Double monto=100.0;
	
	public Tarjeta (Integer id, Cuenta cuenta) { //Tarjeta asociada a una cuenta bancaria
		this.id = id;
		this.cuenta=cuenta;
	}

	@Override
	public synchronized void run() {
		for (int i = 0 ; i < 2 ; i++) {
			if (this.cuenta.getSaldo() > 0.0) {
				this.cuenta.descuentoSaldo(this.monto);
				System.out.println("Nuevo Gasto - Tarjeta "+this.id+" - Monto:"+this.monto);
			}else Thread.currentThread().stop();	
		}
		System.out.println("Salgo actual: "+cuenta.getSaldo());
	}
	
	
	//Como matar un hilo 
	//Como sabes si esta vivo
	
	
	
	
	
}
