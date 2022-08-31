

public class Barbaro extends Personaje{
	
	
	public Barbaro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Barbaro(Integer vida ,Integer nivelAtaque, Integer nivelDefensa) {
		super(vida , nivelAtaque, nivelDefensa);
		this.setVida(vida);
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
	
	
}

