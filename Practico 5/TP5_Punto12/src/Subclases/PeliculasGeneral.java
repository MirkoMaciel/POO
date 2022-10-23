package Subclases;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import interfazStrategy.Catalogo;

public class PeliculasGeneral implements Catalogo{

	private Map<String , Integer> peliculas = new HashMap<String, Integer>();
	

	public PeliculasGeneral() {
		super();
		peliculas.put("Barney", 1);
		peliculas.put("Sex and the city", 2);
		peliculas.put("Barby",1);
		peliculas.put("Actividad paranormal", 2);
		peliculas.put("Piratas del caribe", 1);
		peliculas.put("Una mujer en apuros", 2);
		peliculas.put("XD", 1);
		peliculas.put("Pelicula random", 2);
		peliculas.put("EL HOMBRE ARAÑA", 1);
	}


	@Override
	public void listadoPeliculas() {
		// TODO Auto-generated method stub
		System.out.println("Catalogo disponible general: ");
		for (Entry<String, Integer> valor : peliculas.entrySet()) {    
			System.out.println("Pelicula: "+valor.getKey()+ " - Tipo publico: "+valor.getValue());
	}

	
	
	}
	
}
