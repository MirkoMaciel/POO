import java.util.Random;

public class Combate {

	public Combate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void combatePJ(Personaje peleador1, Personaje peleador2) { // repetir 3 veces
		Random ran = new Random();
		Boolean turno = ran.nextBoolean();
		Integer i = 0;
		do {
			if (turno) {
				peleador2.defender(peleador1.atacar());
				if(peleador2.getVida() == 0) {
					break;
				}
			} else
				peleador1.defender(peleador2.atacar());
				if(peleador1.getVida() == 0) {
					break;
				}
			i++;
		} while (i <= 3);

	}

}
