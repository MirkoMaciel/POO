import java.util.ArrayList;
import java.util.Scanner;


public class Familia {

	ArrayList<Persona> integrante = new ArrayList<Persona>(); //Arreglo de personas
	Integer cantidadFamilias = 0;
	Integer cantidadIntegrantes = 0 ;
	Integer cantidadPersonas = 0;
	Float promedioEdad; 

	
	public Familia(ArrayList<Persona> integrante , Integer cantidadFamilias , Integer cantidadIntegrantes, Integer cantidadPersonas , Float promedioEdad) {
		super();
		this.integrante = integrante;
		this.cantidadFamilias = cantidadFamilias;
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
	
	public Integer getCantidadFamilias() {
		return cantidadFamilias;
	}

	public void setCantidadFamilias(Integer cantidadFamilias) {
		this.cantidadFamilias = cantidadFamilias;
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

	public void generadorIntegrante(Persona persona) { //Genera la una persona
		
		System.out.println("Integrante: ");
		System.out.print("Nombre "); persona.setNombre(persona.getNombre());
		System.out.print("Apellido "); persona.setApellido(persona.getApellido());
		System.out.print("Edad "); persona.setEdad(persona.getEdad());		

	}
	
	public void preguntasS(Persona persona) {
		Scanner in= new Scanner (System.in);
		Character rta;
		System.out.print("Estudio? S/N "); 
		rta = in.next().toUpperCase().charAt(0);
		
		if (rta == 'S') {
			persona.setEstudio(true);
		}else if(rta == 'N') {  persona.setEstudio(false);
		}
		
		System.out.println("Trabajo? S/N"); 
		rta = in.next().toUpperCase().charAt(0);
		if (rta == 'S') {
			persona.setTrabajo(true);
		}else if (rta == 'N') {persona.setTrabajo(false);
		}
		
	}
	
	public void generadorFamilia (Persona persona) {
		generadorIntegrante(persona);
		preguntasS(persona);
		this.integrante.add(persona);	
	}


	@Override
	public String toString() {
		return "Familia [integrante=" + integrante + ", cantidadFamilias=" + cantidadFamilias + ", cantidadIntegrantes="
				+ cantidadIntegrantes + ", cantidadPersonas=" + cantidadPersonas + ", promedioEdad=" + promedioEdad
				+ "]";
	}
	
	
}