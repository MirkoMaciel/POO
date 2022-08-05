import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		
			Scanner in = new Scanner (System.in);
			String texto1 , texto2;
			System.out.print("Ingrese una frase: ");
			texto1 = in.nextLine();
			System.out.print("Inggrese otra frase: ");
			texto2 = in.nextLine();
			System.out.print("El resultado de las dos frases es: "+texto1+" "+texto2);
		
	}

}
