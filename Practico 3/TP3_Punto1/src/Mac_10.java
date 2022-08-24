
public class Mac_10 extends Subfusil {

	
	public Mac_10(String nombre) {
		System.out.println(nombre);
	}
	
	public Mac_10(Double peso) {
		super(peso);
	}
	
	public void dispara() {
		System.out.println("Dispara balas calibre 9");
		super.dispara();
	}
	
}
