
public abstract class Arma { /*
								 * No se puede crear un objeto de esta clase por ser abstract
								 */
	private String nombre;
	private Double Ancho, largo;

	public Arma() { // Constructor: metodo que se ejecuta cuando se crea el objeto
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getAncho() {
		return Ancho;
	}

	public void setAncho(Double ancho) {
		Ancho = ancho;
	}

	public Double getLargo() {
		return largo;
	}

	public void setLargo(Double largo) {
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Nombre del arma: " + nombre + " | Ancho: " + Ancho + "| Largo: " + largo;
	}

	
	
}
