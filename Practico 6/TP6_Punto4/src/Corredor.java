
public class Corredor extends Thread implements Runnable {


	

	@Override
	public  void run() {
		// TODO Auto-generated method stub
		System.out.println("Inicia Corredor "+ Thread.currentThread().getName());
//		if (Thread.holdsLock(getContextClassLoader()) != true) {
//			System.out.println("Corriendo");
//		}
	}

	
	
}
