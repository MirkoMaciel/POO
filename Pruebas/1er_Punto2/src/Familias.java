import java.util.ArrayList;

public class Familias {
	
	
	ArrayList<Persona> integrante = new ArrayList<Persona>();
	private Double promedioEdad;
	
	public Familias () {
		
	}
	
	public Familias(ArrayList<Persona> integrante, Double promedioEdad) {
		super();
		this.integrante = integrante;
		this.promedioEdad = promedioEdad;
	}


	public ArrayList<Persona> getIntegrante() {
		return integrante;
	}

	public void setIntegrante(ArrayList<Persona> integrante) {
		this.integrante = integrante;
	}

	public Double getPromedioEdad() {
		return promedioEdad;
	}

	public void setPromedioEdad(Double promedioEdad) {
		this.promedioEdad = promedioEdad;
	}

	public void addtegrante(Persona integrante) { 
		this.integrante.add(integrante);
	}

	@Override
	public String toString() {
		return "Familias [integrante=" + integrante + ", promedioEdad=" + promedioEdad + "]";
	}
	
	
}
