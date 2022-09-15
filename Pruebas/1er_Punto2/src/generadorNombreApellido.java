import java.util.ArrayList;
import java.util.Random;

public class generadorNombreApellido {

	private Integer tope =20;
	
	ArrayList<String> nombres = new ArrayList<String>();
	ArrayList<String> apellidos = new ArrayList<String>();

	
	public generadorNombreApellido() {
		super();
	}

	public void generadorNombres() {
		for(int i = 0 ; i < tope ; i++) {
			nombres.add("a"+i);
		}
	}
	
	public void generadorApellidos() {
		for(int i = 0 ; i < tope ; i ++) {
			apellidos.add("b"+i);
		}
	}
	
	public Integer edadAleatoria() {
		Random ran = new Random();
		return ran.nextInt(50)+1;
	}

	public ArrayList<String> getNombres() {
		return nombres;
	}

	public void setNombres(ArrayList<String> nombres) {
		this.nombres = nombres;
	}

	public ArrayList<String> getApellidos() {
		return apellidos;
	}

	public void setApellidos(ArrayList<String> apellidos) {
		this.apellidos = apellidos;
	}

	
	
	
}
