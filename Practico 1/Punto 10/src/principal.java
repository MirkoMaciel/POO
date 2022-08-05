import java.util.Random;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Random ran = new Random();
		Integer valor1 , valor2 , dato;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.print("Primer numero: ");
			valor1 = ran.nextInt(100);
			System.out.print("Segundo numero: ");
			valor2 = ran.nextInt(100);				
		}while (valor1 == valor2);
		
/*		System.out.println("APUESTA  - EL NUMERO DE MAYOR VALOR GANA - ELIJA ");
		System.out.print("Elija 1 o 2: "); 
		dato = in.nextInt();
		
		System.out.print("Los numeros son: "+valor1+" "+valor2);
		if (dato == 1 && valor1 > valor2) {
			System.out.print("Ganador");
		}else System.out.print("Perdedor"); */
	}

}
