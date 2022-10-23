package datosAleatorios;

import java.util.HashMap;
import java.util.Map;

public class Peliculas {

	private Map<String, Integer> peliculas = new HashMap<String, Integer>();

	public Peliculas() {
		super();
		peliculas.put("Barney", 1);
		peliculas.put("Sex and the city", 2);
		peliculas.put("Barby", 1);
		peliculas.put("Actividad paranormal", 2);		
		peliculas.put("Piratas del caribe", 1);
		peliculas.put("Una mujer en apuros", 2);
		peliculas.put("XD", 1);
		peliculas.put("Pelicula random", 2);
		peliculas.put("EL HOMBRE ARAÑA", 1);
	}

	public Map<String, Integer> getPeliculas() {
		return peliculas;
	}
	
	
	
	
	
}
