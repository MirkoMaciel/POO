
public class Main {

	public static void main(String[] args) {
		
		//Lo unico que funciona es generar los nombres de manera aleatoria, no supe como hacer para agregarlos al arreglo de personas
		// y de ahi agregar aleatoriamente una persona a una familia, esa era la idea.
	
//		generadorNombreApellido c = new generadorNombreApellido();
//		c.generadorNombres();
//		c.generadorApellidos();
//		System.out.println(c.getApellidos());
//		System.out.println(c.getNombres());
		
		FormacionFamilia f = new FormacionFamilia();
		f.generarFamilias();
		f.imprimirResultado();
		
	}

}
