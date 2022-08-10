import java.util.ArrayList;

public class Profesor {

	private String nombre;
	private String apellido;
	private ArrayList<Materia> materias = new ArrayList<Materia>();; //Atributo privado de arreglo, para la clase materia
	

	public Profesor(String nombre, String apellido) { //Constructor
		this.setNombre(nombre); //Usamos el set, porque si queremos realizar algun tratamiento al atributo
		this.setApellido(apellido);
		//this.setMaterias(materias);
	}
	
	public String getNombre() { 
		return apellido;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getApellido() {
		return nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public ArrayList<Materia> getMaterias() {
		return materias;
	}
	
	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}
	
	public void añadirMateria(Materia materia) {
		this.materias.add(materia);
	}
	
	public void imprimirDatos() {
		System.out.print(this.toString());
	}
	
	@Override
	public String toString() {
		return "Profesor: "+apellido+ " " +nombre;
	}

}
