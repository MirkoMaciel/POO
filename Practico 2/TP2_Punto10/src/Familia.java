import java.util.ArrayList;



public class Familia {

	ArrayList<Persona> integrante = new ArrayList<Persona>(); //Arreglo de personas
	private Integer cantidadIntegrantes = 0 ;
	private Integer cantidadPersonas = 0;
	private Float promedioEdad; 

	
	public Familia(ArrayList<Persona> integrante, Integer cantidadIntegrantes, Integer cantidadPersonas , Float promedioEdad) {
		super();
		this.integrante = integrante;
		this.cantidadIntegrantes = cantidadIntegrantes;
		this.cantidadPersonas = cantidadPersonas;
		this.promedioEdad = promedioEdad;
		
	}
			
	public Familia() {
		super();
	}

	public ArrayList<Persona> getIntegrante() {
		return integrante;
	}


	public void setIntegrante(ArrayList<Persona> integrante) {
		this.integrante = integrante;
	}


	public Integer getCantidadIntegrantes() {
		return cantidadIntegrantes;
	}

	public void setCantidadIntegrantes(Integer cantidadIntegrantes) {
		this.cantidadIntegrantes = cantidadIntegrantes;
	}
	
	public Integer getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(Integer cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public Float getPromedioEdad() {
		return promedioEdad;
	}

	public void setPromedioEdad(Float promedioEdad) {
		this.promedioEdad = promedioEdad;
	}

	public void addtegrante(Persona integrante) { 
		this.integrante.add(integrante);
	}
	


	@Override
	public String toString() {
		return "Familia [integrante= " + integrante +  ", cantidadIntegrantes= " + cantidadIntegrantes + ", cantidadPersonas= " + cantidadPersonas + ", promedioEdad= " + promedioEdad
				+ "]";
	}
	
	
}