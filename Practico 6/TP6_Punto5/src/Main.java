
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Cuenta cuenta = new Cuenta(2000.0);

//		Tarjeta tarjeta1 = new Tarjeta(1, cuenta);
//		Tarjeta tarjeta2 = new Tarjeta(2, cuenta);
//		Tarjeta tarjeta3 = new Tarjeta(3, cuenta);
//		Tarjeta tarjeta4 = new Tarjeta(4, cuenta);
//		Tarjeta tarjeta5 = new Tarjeta(5, cuenta);

		for (int i = 0; i < 10; i++) {
			Tarjeta tarjeta = new Tarjeta(i, cuenta);
			tarjeta.start();
			tarjeta.join();
			if (cuenta.getSaldo() <= 0.0) {
				System.out.println("Saldo insuficiente: "+cuenta.getSaldo());
			}
		}

	}

}
