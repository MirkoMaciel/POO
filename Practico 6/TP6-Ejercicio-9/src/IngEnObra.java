import java.util.Random;

public class IngEnObra extends IngenieroCivil implements Agrimesor { //Productor
	private Random rand;

	public IngEnObra(Servidor servidor, String nombre) {
		super(servidor, nombre);
	}

	@Override
	public PaqueteDatos medir() {
		Random rnd = new Random();
		Double vertical = rnd.nextDouble(91);
		Double horizontal = rnd.nextDouble(181);
		return new PaqueteDatos(vertical, horizontal);
	}

	@Override
	public void enviarMedicion(PaqueteDatos dato) throws FallaInternetException {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (new Random().nextInt(100) < 40) {
			throw new FallaInternetException();
		}
		this.getServidor().agregarDato(dato);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				this.enviarMedicion(this.medir());
			} catch (FallaInternetException e) {
				System.err.println(
						"ERROR: (" + this.getNombre() + ") No hay conexión a internet, no se envió el paquete!");
			}
		}
		this.getServidor().agregarDato(null);
	}

}
