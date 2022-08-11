import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Persona per = new Persona("Mirko" , "Maciel" , LocalDate.ofYearDay(2001 , 03));
		System.out.println(per);
	
	}

}
