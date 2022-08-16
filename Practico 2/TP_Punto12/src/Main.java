import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Persona> empleados = new ArrayList<Persona>();
		Empresa empresa = new Empresa();
		Persona p = new Persona("Mirko", "Maciel", LocalDate.of(2001, 3, 9));
		Persona p1 = new Persona();

		
		System.out.println("-Empresa-");
		empresa.setNombre("Mirkos company");
		empresa.setDireccion("Km3 - Foyel 61");
			empleados.add(p);
			empresa.generarEmpleado(p1);
			empleados.add(p1);	
		System.out.println(empresa.getNombre());
		System.out.println(empresa.getDireccion());
		System.out.print("Empleados: ");System.out.println(empleados+"\n");
		
		
	

}
}
