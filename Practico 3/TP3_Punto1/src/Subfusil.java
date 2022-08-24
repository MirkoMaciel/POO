
public class Subfusil extends Arma{

	public Subfusil () {
		super();
		System.out.println("Es un subfusil.");
	}
	
	public Subfusil (Double peso) {
		super(peso);
		System.out.println("Va desde 0kg a 15kg");
	}
	
	@Override
	public void dispara () {
		System.out.println("rattatatatatat");
	}
}
