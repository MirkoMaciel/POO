import java.util.ArrayList;
import java.util.Random;

public class FormacionFamilia {

	Integer tope =2;
	ArrayList<Familias> familias = new ArrayList<Familias>();


	generadorNombreApellido g = new generadorNombreApellido();
	
	
	public FormacionFamilia() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void generarFamilias() {
		
		g.generadorNombres();
		g.generadorApellidos();
		for (int i= 0 ; i < tope ; i++) {
			Familias f = new Familias();
			Persona pe = new Persona(g.nombres.get(i), g.apellidos.get(i) , g.edadAleatoria());
			f.addtegrante(pe);
			familias.add(f);
		}
	}

	public void imprimirResultado() {
		for (Familias f : familias) {
			System.out.println(f);
		}
		
	}
}
