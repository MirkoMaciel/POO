import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
			
		ArrayList<Profesor> profesores = new ArrayList<Profesor>(); //Un arreglo de listas de objetos Profesor llamado profesor que contiene el obj Profesor
		
		//ArrayList<Materia> materias = new ArrayList<Materia>(); //Un arreglo de listas de objetos Materia llamado materias que es de Materia		
		
		Materia poo = new Materia("POO", "IF153");
		
		Materia algebra= new Materia("Algebra", "183" );
		
		Materia introduccion= new Materia("Introduccion a la computacion", "IF300");
		
		Materia algoritmica=  new Materia("Algoritmica", "500");
		
		
		Profesor profesor1 = new Profesor("Pedro", "Hernandez"  ); //Poner el parametro
		
		profesor1.añadirMateria(poo);
		
		profesor1.añadirMateria(algebra);
		
		profesores.add(profesor1);
		
		
		Profesor profesor2 = new Profesor("Romina", "Alvarez" );
		
		profesor2.añadirMateria(introduccion);
		
		profesor2.añadirMateria(algoritmica);
		
		profesores.add(profesor2);
		
		
		Profesor profesor3 = new Profesor("Laura", "Perez");
		
		profesores.add(profesor3);
		
		
//		for (int i=0; i<profesores.size(); i++) {
//			
//		System.out.println("Profesor: " + profesores.get(i).getApellido() + " " + profesores.get(i).getNombre());
//			profesores.get(i).toString();
//			
//			 for (int j=0; j<profesores.get(j).getMaterias().size(); j++) {
//				//System.out.println("Materias: ");
//				materias.get(j).imprimirDatos();				
//			}  	
//	} 
	
		for (int j=0; j<profesores.size(); j++) {
			System.out.println("Profesor: " + profesores.get(j).getNombre() + " " +
			profesores.get(j).getApellido());
			System.out.println("Materias: ");
			
			for (int i=0; i<profesores.get(j).getMaterias().size();i++) {
			System.out.println(profesores.get(j).getMaterias().get(i).getNombre());
		
		//System.out.println("Materias: " + materias.get(1).getNombre() + " " + profesores.get(1).getCodigo());	

		/* materias.get(0).imprimirDatos();
		materias.get(1).imprimirDatos(); 
		materias.get(4).imprimirDatos(); */
}
		
	}
		
		}
	
	}

