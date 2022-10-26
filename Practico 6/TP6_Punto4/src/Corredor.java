
public class Corredor extends Thread{

	private Integer seg;
	
	public Corredor(Integer seg) {
		
		this.seg = seg;
	}

	@Override
	public  void run() {
		// TODO Auto-generated method stub
		System.out.println("Inicia Corredor "+ Thread.currentThread().getName()+" Segundos: "+seg/1000);
		try {
			sleep(seg);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
	
}
