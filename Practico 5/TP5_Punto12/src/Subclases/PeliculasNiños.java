package Subclases;

import java.util.Map.Entry;

import datosAleatorios.Peliculas;
import interfazStrategy.Catalogo;

public class PeliculasNiños implements Catalogo {

	private Peliculas p= new Peliculas();

	public PeliculasNiños() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void listadoPeliculas() {
		// TODO Auto-generated method stub
		System.out.println("Catalogo de peliculas para niños: ");
		for (Entry<String, Integer> valor : p.getPeliculas().entrySet()) {
			if (valor.getValue() == 1) {
				System.out.println("Pelicula: " + valor.getKey() + " - Tipo publico: " + valor.getValue());
				
			}
		}

	}
}
