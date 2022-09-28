
import java.util.ArrayList;

public class Alumno extends Persona {
	ArrayList<String> materias = new ArrayList<>();

	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);
	}

	public ArrayList<String> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<String> materias) {
		this.materias = materias;
	}

	public void agregarMateria(String materia) {
		this.materias.add(materia);
	}

	public String materia() {
		String msg = "El Alumno se encuentra cursando las siguientes materias \n";
		for (String materia : materias) {
			msg = msg + materia + "\n";
		}
		return msg;
	}
	
	
	public String materia (String dato) { //Cambio los parametros
		String msg = "El alumno no cursa las siguientes materias";
		return msg;
	}
	
/*Polimorfismo estatico = sobreescribis metodos en la misma clase
 * Polimorfsimo dinamico, es cuando sobrecargar metodos de una clase padre/ base, cambien o no
 * los comportamientos */
}
