
public class Main {

	public static void main(String[] args) {
		Ametralladora arma = new Ametralladora();
		Ametralladora arma2 = new Ametralladora();
		
		arma.setNombre("M4");
		arma.setLargo(14.5);
		arma.setAncho(2.4);
		
		arma2.setNombre("M8A1");
		arma2.setLargo(17.23);
		arma2.setAncho(3.0);
		
		System.out.println(arma.toString());
		System.out.println(arma2.toString());
	}
	
}
