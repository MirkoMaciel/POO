import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
			
		int a,b,resultado;
		Scanner lectura = new Scanner(System.in);
		
		System.out.print("Primer numero: ");
		a=lectura.nextInt();
		System.err.print("Segundo numero: ");
		b=lectura.nextInt();
		resultado=a+b;
		System.out.println("El resultado es: "+resultado);
		
	}

}
