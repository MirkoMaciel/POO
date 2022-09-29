
public abstract class Personaje {

	private Integer vida = 100;
	private Integer nivelAtaque;
	private Integer nivelDefensa;
	
	
	public Personaje() { //Constructor
		super();
		// TODO Auto-generated constructor stub
	}

	public Personaje(Integer vida, Integer nivelAtaque, Integer nivelDefensa) { //COnstructor

		super();
		this.vida = vida;
		this.nivelAtaque = nivelAtaque;
		this.nivelDefensa = nivelDefensa;
	}

	public Integer atacar () { //implementado
		return this.nivelAtaque;
	}
	
	public abstract Integer defender(Integer puntos); //No Implentado, asigno a los hijos

	public abstract void defenderPrueba(Integer puntos);
	
	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getNivelAtaque() {
		return nivelAtaque;
	}

	public void setNivelAtaque(Integer nivelAtaque) {
		this.nivelAtaque = nivelAtaque;
	}

	public Integer getNivelDefensa() {
		return nivelDefensa;
	}

	public void setNivelDefensa(Integer nivelDefensa) {
		this.nivelDefensa = nivelDefensa;
	}
	
	
	
}
