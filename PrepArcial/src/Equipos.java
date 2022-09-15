import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Equipos {

	private Integer numeroParticipar;
	private String nombre;
	
	ArrayList<String> equipos = new ArrayList<String>(Arrays.asList("EQ1","EQ2","EQ3","EQ4","EQ5","EQ6","EQ7","EQ8","EQ9","EQ10","EQ11","EQ12","EQ13","EQ14","EQ15","EQ16"));

	
	public Equipos() { //Constructor
		
	}
	
	public String seleccionEquipo() {
		Random ran = new Random();
		return equipos.get(ran.nextInt());
	}
	
	public void imprimirEquipos() {
		for (int i  = 0 ; i < equipos.size() ; i++ ) {
			System.out.println(equipos.get(i));
		}
	}

	public Integer getNumeroParticipar() {
		return numeroParticipar;
	}

	public void setNumeroParticipar(Integer numeroParticipar) {
		this.numeroParticipar = numeroParticipar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
	
	
}
