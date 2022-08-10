public class Materia {
	
	private String nombre;
	private String codigo;
	
	
	public Materia(String nombre, String codigo) { //Constructor
		this.setNombre(nombre); // this se llama así mismo, "dentro mio hay un atributo asi que llamalo" HACIENDO referencia a este atributo
		this.setCodigo(codigo);
	}
	
	public String getNombre() { //Devuelve el valor que tiene nombre
		return nombre;
	}
	
	public String getCodigo() { //Setea , asigna a la variable codigo, lo que entra por parametro
		return codigo; 
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void imprimirDatos () {
		System.out.println("Materias: ");
		System.out.println(nombre+""+codigo);
	}

}

