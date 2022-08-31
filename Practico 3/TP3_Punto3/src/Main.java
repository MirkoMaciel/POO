import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		Random ran = new Random ();
		Ninja kakashi = new Ninja();
		
		System.out.println("Vida ninja: "+kakashi.getVida());
		System.out.println("Escudo ninja: "+kakashi.getNivelDefensa()+"\n");
		//System.out.println("\n");
		kakashi.defender(ran.nextInt(500));
		//System.out.println("Ay me atacaron");
		System.out.println("Vida ninja: "+kakashi.getVida());
		System.out.println("Escudo ninja: "+kakashi.getNivelDefensa());
		
		System.out.println(kakashi.atacar());
	}

}
