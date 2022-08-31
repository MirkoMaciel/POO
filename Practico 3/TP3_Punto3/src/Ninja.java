
public class Ninja extends Personaje {

	
	public Ninja() {
		super();
		this.setVida(150); //Donde creo una constante para la vida
		this.setNivelAtaque(159);
		this.setNivelDefensa(200);
	}

	@Override
	public Integer defender(Integer puntos) {

		if (this.getNivelDefensa() > 0) { //Si existe defensa
			if (this.getNivelDefensa() > puntos) { //Si los puntos son menos a la defensa
				this.setNivelDefensa(this.getNivelDefensa() - puntos); //El ataque disminuye la defensa solamente
				return this.getNivelDefensa();
			} else
				this.setVida(this.getVida() - (puntos - this.getNivelDefensa() ) ); //Si no, rompe la defensa y resta la diferencia a la vida
				this.setNivelDefensa(0); //Defensa "rota", se queda en 0
		}else if (this.getVida() <= puntos) {	//Si la vida es menos igual a los puntos "muere" el pj
				this.setVida(0);
		}else this.setVida(this.getVida() - puntos);
		
		if (this.getVida() <= puntos) {	
			System.out.println("el ataque te mató");
			this.setVida(0);
		}
		return this.getVida();
	}

	@Override
	public void defenderPrueba(Integer puntos) {
		// TODO Auto-generated method stub
		
	}

	public Integer atacar () {
		if(this.getVida() > (( getVida()*66)/100 ) ) { //Si la vida supera al 66% el ataque se duplica
			//System.out.println("111111");
			this.setNivelAtaque((this.getNivelAtaque()*2));
			return this.getNivelAtaque();
		} this.setNivelAtaque(this.getNivelAtaque() - 20); //Si no, el ataque pierde 20 puntos de daño
		//System.out.println("22222");
		return this.getNivelAtaque();
	}
	
}
