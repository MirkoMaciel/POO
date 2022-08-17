import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Persona> empleados = new ArrayList<Persona>();
		Empresa empresa = new Empresa();
		Puesto cargo = new Puesto("Administrativo");
		Puesto cargo2 = new Puesto ("Gerente");
		Puesto cargo3 = new Puesto("Tesorero");
		
		Persona p1 = new Persona("Mirko","Maciel", LocalDate.of(2001, 3, 9), cargo);
		Persona p2 = new Persona("Santino","Borda", LocalDate.of(2011, 9, 2), cargo);
		Persona p3 = new Persona("Pepito" , "Juarez", LocalDate.of(1999, 1, 1), cargo);
		Persona p4 = new Persona("Random" , "Random", LocalDate.of(1980, 2, 2), cargo2);
		Persona p5 = new Persona("Randon2" , "Randon2" , LocalDate.of(1970, 3, 3), cargo3);
		
		System.out.println("-Empresa-");
		empresa.setNombre("Mirkos company");
		empresa.setDireccion("Km3 - Foyel 61 \n\n");
		empleados.add(p1);
		empleados.add(p2);
		empleados.add(p3);
		empleados.add(p4);
		empleados.add(p5);

//		System.out.println(empresa.getNombre());
//		System.out.println(empresa.getDireccion());
//		System.out.print("Empleados: ");System.out.println(empleados+"\n");
//		System.out.println("Cantidad empleados: "+empresa.cantidadEmpleados(empleados));
	
		System.out.println(empleados);
		

	}

}
