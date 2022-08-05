import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String texto1 , texto2;
	
		System.out.print("Ingrese una frase: ");
		texto1 = in.nextLine();

		System.out.print("Ingrese la segunda frase: ");
		texto2 = in.nextLine();

		
		//String res = (texto1 == texto2) ? "Verdadero" : "falso";
		String res = (texto1.equals(texto2)) ? "Verdadero" : "falso";
		
		if (texto1 == texto2) {
			System.out.println("Verdadero");
		}else System.out.println("Falso");
	
	
	if (texto1.equals(texto2)) {
		System.out.println(texto1+ " es igual a "+ texto2);	
	}else System.out.println(texto1+ " no es igual a "+ texto2);
	
	System.out.print(" "+res);
	}
	

}
