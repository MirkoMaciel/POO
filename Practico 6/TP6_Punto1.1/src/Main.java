
//Implementando runnable
public class Main implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main mainPrueba = new Main();
		
		for (int i =1 ; i < 7 ; i++) {		
			(new Thread(mainPrueba, "Hilo "+i)).start();
			try {
				Thread.sleep(i*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+ " Hola Mundo");
	}

}
