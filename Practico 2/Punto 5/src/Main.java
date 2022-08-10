import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
			
		ArrayList<Profesor> profesores = new ArrayList<Profesor>(); //Un arreglo de listas de objetos Profesor llamado profesor que contiene el obj Profesor
		
		ArrayList<Materia> materias = new ArrayList<Materia>(); //Un arreglo de listas de objetos Materia llamado materias que es de Materia
		
		Materia poo = new Materia("POO", "IF153");
		
		Materia algebra= new Materia("Algebra", "183" );
		
		Materia introduccion= new Materia("Introducción a la computación", "IF300");
		
		Materia algoritmica=  new Materia("Algoritmica", "500");
		
		
		Profesor profesor1 = new Profesor("Pedro", "Hernandez", materias ); //Poner el parametro
		
		profesor1.añadirMateria(poo);
		
		profesor1.añadirMateria(algebra);
		
		profesores.add(profesor1);
		
		Profesor profesor2 = new Profesor("Romina", "Alvarez" , materias);
		
		profesor2.añadirMateria(introduccion);
		
		profesor2.añadirMateria(algoritmica);
		
		profesores.add(profesor2);
		
		Profesor profesor3 = new Profesor("Laura", "Perez" , materias);
		
		profesores.add(profesor3);
		
		for (int i=0;i<profesores.size();i++) {
			
		System.out.println("Profesor: " + profesores.get(i).getNombre() + " " +
		profesores.get(i).getApellido());
		System.out.println("Materias: ");
		
		for (int i=0; i<profesores.get(i).getMaterias().size(); i++) {
			profesores.imprimirDatos();
		}
		
		}
		
	}
		
}
		
		
		
	}

}
