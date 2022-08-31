

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
		return null;
	}


	@Override
	public void defenderPrueba(Integer puntos) {
		if(this.getNivelDefensa() > puntos ) { /*Si la defensa es mejor que el ataque, solo le saca un tercio */
			this.setNivelDefensa(this.getNivelDefensa()-(puntos * 1/3 )) ; 
		}else this.setNivelDefensa(this.getNivelDefensa()- ( (puntos * 75 ) / 100 )); /* Si el ataque es mejor que la defensa saca el 75% del ataque*/
		
	}
	
	
	
}

