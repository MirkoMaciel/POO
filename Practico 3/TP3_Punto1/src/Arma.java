
public abstract class Arma {
	private String nombre;
	private Double peso;

	public Arma() {
		super();
		System.out.println("Esto es un arma. ");
	}
	
	public Arma (String nombre) {
		System.out.println("El nombre es: "+ this.nombre);
	}
	
	public Arma(Double peso) {
		System.out.println("El peso es: "+peso);
	}
	
	public abstract void dispara ();
	
	
	
}
