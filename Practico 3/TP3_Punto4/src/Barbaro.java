

public class Barbaro extends Personaje{
	
	
	public Barbaro() {
		super();
		this.setVida(340);
		this.setNivelAtaque(250);
		this.setNivelDefensa(500);
	}
	
	
	@Override
	public Integer defender(Integer puntos) {
		return null;
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


	@Override
	public void defenderPrueba(Integer puntos) {
		if(this.getNivelDefensa() > puntos ) { /*Si la defensa es mejor que el ataque, solo le saca un tercio */
			this.setNivelDefensa(this.getNivelDefensa()-(puntos * 1/3 )) ; 
		}else this.setNivelDefensa(this.getNivelDefensa()- ( (puntos * 75 ) / 100 )); /* Si el ataque es mejor que la defensa saca el 75% del ataque*/
		
	}
	
	
	
}

