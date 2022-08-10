
public class Main {

	public static void main(String[] args) {
	
		Materia poo = new Materia("POO", "IF153");
		
		Materia algebra= new Materia("Algebra", "183" );
		
		Materia introduccion= new Materia("Introducción a la computación", "IF300");
		
		//introduccion.setCodigo("IF300");
		
		Materia algoritmica=  new Materia("Algoritmica", "500");
		
		//ArrayList<Profesor> profesores = new ArrayList<String>();
		
		//ArrayList<Materia> materias = new ArrrayList<String>();
		
		Profesor profesor1 = new Profesor("Pedro", "Hernandez",  );
		
		profesor1.añadirMateria(poo);
		
		profesor1.añadirMateria(algebra);
		
		profestores.add(profesor1);
		
		Profesor profesor2 = new Profesor("Romina", "Alvarez");
		
		profesor2.añadirMateria(introduccion);
		
		profesor2.añadirMateria(algoritmica);
		
		Profesor profesor3 = new Profesor("Laura", "Perez");
		
		profestores.add(profesor1);
		
		for (int i=0;i<profesores.size();i++) {
			
		System.out.println("Profesor: " + profesores.get(i).getNombre() + " " +
		profesores.get(i).getApellido());
		System.out.println("Materias: ");
		
		for (int i=0;i<profesores.get(i).getMaterias().size();i++) {
		System.out.println(profesores.get(i).getMaterias().get(i).getNombre());
		}
		}
		}
		}
		
		
		
	}

}
