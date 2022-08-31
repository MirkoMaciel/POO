
public class Ninja extends Personaje {

	public Ninja() {
		super();
		this.setVida(120);
		this.setNivelAtaque(159);
		this.setNivelDefensa(200);
	}

	@Override
	public Integer defender(Integer puntos) {

		if (this.getNivelDefensa() > 0) {
			if (this.getNivelDefensa() > puntos) {
				this.setNivelDefensa(this.getNivelDefensa() - puntos);
				return this.getNivelDefensa();
			} else
				this.setVida(this.getVida() - (puntos - this.getNivelDefensa() ) );
				this.setNivelDefensa(0);
		}else if (this.getVida() <= puntos) {	
				this.setVida(0);
		}else this.setVida(this.getVida() - puntos);
		
		if (this.getVida() <= puntos) {	
			System.out.println("el ataque te mató");
			this.setVida(0);
		}
		return this.getVida();
	}


}
