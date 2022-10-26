
public class Reportero implements Observer {

	private String nombre;
	
	public Reportero(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("El clima se modifico");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nombre;
	}

	
	
	
}
