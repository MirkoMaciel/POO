import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Persona user1 = new Persona ("Mirko" , "Maciel", LocalDate.of(2001, 3, 9));
		Persona user2 = new Persona ("Santino" , "Borda", LocalDate.of(2011, 9, 2));
		Persona user3 = new Persona ("Pitufo", "Rodriguez", LocalDate.now());
	
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		
		user1.impriFecha(user1.getFechaNacimiento()); //LLamo al proc imprimirFecha, que tiene de parametro 
		user2.impriFecha(user2.getFechaNacimiento()); //La fecha de nacimiento, imprimo
		user3.impriFecha(user3.getFechaNacimiento());
	}

}
