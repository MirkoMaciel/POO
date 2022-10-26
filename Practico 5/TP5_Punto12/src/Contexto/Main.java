package Contexto;
import Subclases.PeliculasGeneral;
import Subclases.PeliculasNiños;
import interfazStrategy.Catalogo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creo una variable de la clase interfaz de tipo PeliculasGeneral 
		
		Catalogo peliculas;
		
		System.out.println("Probando estrategia general.\n\n");
		peliculas = new PeliculasGeneral();
		peliculas.listadoPeliculas();
		
		System.out.println("Probando estrategia para menores.\n\n");
		peliculas = new PeliculasNiños(); //Cuando cambia la instancia, modifica el comporatmiento
		peliculas.listadoPeliculas();
		
		//peliculasNiños.listadoPeliculas();
	}

}
