
public class Main {

	public static void main(String[] args) {
		Servidor servidor = new Servidor();
		new IngEnObra(servidor, "Laskowski").start();
		new IngEnObra(servidor, "Casas").start();
		
		new IngenieroCivil(servidor, "Ingeniero").start();
	}

}
