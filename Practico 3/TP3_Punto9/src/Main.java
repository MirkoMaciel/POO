
public class Main {

	public static void main(String[] args) {
		Claro c= new Claro(1,1,1); //Cantidad SMS , minutos , Giga
		Claro c1= new Claro(2,2,2);
		Claro c2= new Claro(3,3,3);
		
		System.out.println("C :" + c.calcular() + " , " + c.calculoPorcentaje() );
		System.out.println("Total a pagar por c "+c.totalPago());
		
		System.out.println("C1 :" + c1.calcular() + " , " + c1.calculoPorcentaje() );
		System.out.println("Total a pagar por c1 "+c1.totalPago());
		
		System.out.println("C2 :" + c2.calcular() + " , " + c2.calculoPorcentaje() );
		System.out.println("Total a pagar por c2 "+c2.totalPago());
	
		
	}

}
