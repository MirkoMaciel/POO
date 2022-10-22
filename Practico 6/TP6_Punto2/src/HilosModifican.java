
public class HilosModifican implements Runnable{
		
	private Contador contador;
	
	public HilosModifican(Contador contador) {
		super();
		this.contador = contador;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		contador.incrementar();
		System.out.println(Thread.currentThread().getName()+ " " +contador.getContador());
		
	}

	public Contador getContador() {
		return contador;
	}

	
}
