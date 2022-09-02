import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// Random ran = new Random ();
		Ninja kakashi = new Ninja();
		Barbaro okrim = new Barbaro();
		Combate c = new Combate();

		// System.out.println(kakashi.atacar());
		c.combatePJ(kakashi, okrim);
		System.out.println(kakashi.getVida());
		System.out.println(okrim.getVida());
		
		if (kakashi.getVida() <= 0) {
			System.out.println("Gano el barbaro");
		} else if (okrim.getVida() <= 0) {
			System.out.println("Gano el ninja");
		}

	}

}
