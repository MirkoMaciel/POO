package Contexto;
import Subclases.PeliculasGeneral;
import Subclases.PeliculasNiños;
import interfazStrategy.Catalogo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creo una variable de la clase interfaz de tipo PeliculasGeneral 
		
		Catalogo peliculas = new PeliculasGeneral();
		//Catalogo peliculasNiños = new PeliculasNiños();
		
//		
//		System.out.println("Peliculas: \n1) TIPO 1 = TODO PUBLICO\n2) TIPO 2 = SOLO NIÑOS\n");
//		
//		peliculas.listadoPeliculas();
//		System.out.println();
		
		System.out.println("Probando estrategia general.\n\n");
		peliculas.listadoPeliculas();
		
		System.out.println("Probando estrategia para menores.\n\n");
		peliculas = new PeliculasNiños(); //Cuando cambia la instancia, modifica el comporatmiento
		peliculas.listadoPeliculas();
		
		//peliculasNiños.listadoPeliculas();
	}

}
