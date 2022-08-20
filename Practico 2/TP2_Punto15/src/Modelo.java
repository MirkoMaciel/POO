
import java.security.SecureRandom; //Clase que genera numero aleatorios (RNG) criptograficamente solidos

public class Modelo {
	
	private static String caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; //Determina un String con todo todo el alfabeto en Min y May + numeros
	private String contraseña; //Crea un atributo privado de tipo String llamado contraseña

	public String getContraseña() { //getter contraseña
		return contraseña; 
	}

	public void setContraseña(String contraseña) { //Setter Contraseña
		this.contraseña = contraseña;
	}

	public void generarContraseña() { //Genera una contraseña random
		SecureRandom secureRandom = new SecureRandom(); //Creo la instancia de la clase SecureRandom
		StringBuilder stringBuilder = new StringBuilder(32);  //Creo la instancia de la clase stringBuldier con una capacidad de 32 caracters
		for (int i = 0; i < 32; i++) 
			stringBuilder.append(caracteres.charAt(secureRandom.nextInt(caracteres.length()))); //Añade al final del String el caracteres de la posicion charAT indicada
																								//que es un valor de tipo entero random con una longitud posible de toda la cadena caracteres						
		this.contraseña = stringBuilder.toString(); //Le asigna a esta contraseña, la cadena toString del buldier
	}
}