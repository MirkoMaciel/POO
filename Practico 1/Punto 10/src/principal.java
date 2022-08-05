import java.io.IOException;
import java.util.Random; //libreria random
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Random ran = new Random(); //Creo una variable de tipo ran asignada a la libreria
		Integer valor1 , valor2; //Creo variables de tipo entero(obj)
		Integer victoria = 0 , derrota = 0;
		char rta; 
		int dato;
		Scanner in = new Scanner(System.in);   
		
		do {
			
	        /* try { //linea para borrar la consola
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (IOException | InterruptedException e) {
	       
	        } */
	      
			
		do { 			
			valor1 = ran.nextInt(100);			
			valor2 = ran.nextInt(100);				
		}while (valor1 == valor2); //Genero los valores aleatorios y no finaliza el bucle hasta que sean distintos
		
		System.out.print("A que numero desea apostar? Numero 1 o Numero 2: ");
		dato=in.nextInt();
		System.out.println("Numero 1: "+valor1);
		System.out.println("Numero 2: "+valor2);
						
		switch (dato) {

		case 1 : if (valor1>valor2) {
			System.out.println("Ganador. ");
			victoria = victoria + 1;
			break;
		}
		
		case 2 : if (valor2>valor1) {
			System.out.print("Ganador. ");
			victoria = victoria + 1;
			break;
		}
		
		default : System.out.println("Perdedor"); 
					derrota = derrota + 1;
		}
		
		System.out.println("Desea volver a jugar? S/N");
		rta=in.next().toUpperCase().charAt(0);  //Se obtiene el primer caracter del String Mayusculisado
		
		}while(rta == 'S');
		System.out.println("Victorias "+victoria);
		System.out.println("Derrota "+derrota);
	}

}
