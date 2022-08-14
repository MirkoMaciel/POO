
public class Main {

	public static void main(String[] args) {

		Persona user = new Persona ("Mirko", "Maciel", 21 , "Masculino", "Si", "Si");
		Persona user1 = new Persona ("Santino", "Borda", 16 , "Masculino", "Si", "Si");
		
		if (user.edad > 16) {
			System.out.println(user.nombre+" "+ user.apellido+", esta en edad de trabajar");
		}else System.out.println(user.nombre+" "+ user.apellido+", no esta en edad de trabajar ");
		if(user.edad > 17) {
			System.out.println(user.nombre+" "+ user.apellido+", esta en edad de manejar ");
		}else System.out.println(user.nombre+" "+ user.apellido+", no esta en edad de manejar ");
	
		System.out.println("\n\n");
		
	if (user1.edad >= 16) {
		System.out.println(user1.nombre+" "+ user1.apellido+", esta en edad de trabajar");
	}else System.out.println(user1.nombre+" "+ user1.apellido+", no esta en edad de trabajar ");
	if(user1.edad >= 17) {
		System.out.println(user1.nombre+" "+ user1.apellido+", esta en edad de manejar ");
	}else System.out.println(user1.nombre+" "+ user1.apellido+", no esta en edad de manejar ");
}

}
