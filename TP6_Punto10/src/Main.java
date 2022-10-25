
public class Main {

	public static void main(String[] args) {
		
		SistemaMeteorologico sm = new SistemaMeteorologico();
		Reportero r = new Reportero("Julio");
		Reportero r2 = new Reportero("Mirko");
		Reportero r3 = new Reportero("Pepe");
		
		sm.agregar(r);
		sm.agregar(r2);
		sm.agregar(r3);
		
		sm.setClima("Soleado");

		
		
		//sm.obs.get(1).update();
		
	}
	
	
}
