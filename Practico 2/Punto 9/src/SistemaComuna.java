//import java.util.Scanner;

public class SistemaComuna {

	public static void main(String[] args) {
		
		//Scanner in = new Scanner(System.in);
		//Character rta;
		Persona integrante = new Persona("", "", "" , "", "", "");
		Familia grupoFamiliar = new Familia (0 , "" , "");
		
		System.out.println(" INICIO DEL CENSO ");
		System.out.println(" Desea censar una familia? S/N");
		//rta = in.next().toUpperCase().charAt(0);
		
		//do {
			grupoFamiliar.ingresoVec(integrante);
			System.out.println();
			//System.out.println("Desea ingresar otro familiar? S/N");
			//rta = in.next().toUpperCase().charAt(0);
		//}while (rta == 'S');
	 
			for (int i = 0 ; i <grupoFamiliar.familia.size() ; i++) {
				System.out.println("Nombre: " +integrante.getNombre());
				System.out.println("Apellido: "+integrante.getApellido());
				System.out.println("Edad: "+integrante.getEdad());
				System.out.println("Sexo: "+integrante.getSexo());
				System.out.println("Estudio: "+integrante.getEstudio());
				System.out.println("Trabajo: "+integrante.getTrabajo());
			}
	
			
	}

}
