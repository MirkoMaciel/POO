import java.util.Random;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner in = new Scanner (System.in);
		Integer vecEnteros [] = new Integer [6] ;
		Integer vecUser [] = new Integer [6];
		int i, x;
		Integer aciertos = 0;
		Boolean bol = true;
		Character rta;
		
		
		while (bol == true){
		for (i = 0 ; i<6 ; i++) {
			vecEnteros[i] = ran.nextInt(1,50); 
		}
		

		System.out.println("Ingrese los número que desea jugar. ");
		System.out.println("Sin importar orden, en una seguidilla. ");
		for (i = 0 ; i<6 ; i++) {
			vecUser[i] = in.nextInt(); 
		}
		
		
		System.out.print("Combinacion ganadora: ");
		for (i = 0 ; i < 6 ;i++) {
			System.out.print(vecEnteros[i]+", ");
		} 
		
		System.out.println("");
		
		System.out.print("Numero elegidos: ");
		for (i = 0 ; i < 6 ;i++) {
			System.out.print(vecUser[i]+", ");
		} 
	
		for (i = 0 ; i < 6 ;i++) {
			for (x = 0 ; x < 6 ;x++) { 	
				if (vecEnteros[i] == vecUser [x]) {
					aciertos++;
				}
			}
		} 
		System.out.println("");
		System.out.println("Aciertos: "+aciertos);
		
		System.out.println("Desea volver a jugar? S/N");
			rta = in.next().toUpperCase().charAt(0);
			if (rta != 'S') {
				bol = false;
			}
		}

	}
}
