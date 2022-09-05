
public class Main {

	public static void main(String[] args) {

		Claro c = new Claro(1,1,1);
		Claro c1 = new Claro(2,2,2);
		
		c.getTotalPagar();
		c.tarifaClaro();
		c1.tarifaClaro();
		
		System.out.println(c.getTotalPagar());
		System.out.println(c.getTarifaActual());
		
	}

}
