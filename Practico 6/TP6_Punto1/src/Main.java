
public class Main {

	public static void main(String[] args) {
		
		
		for (int i = 1 ; i < 7 ; i++) {
			new Thread(new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread().getName()+" Hola mundo");
				}
			},"Hilo"+i).start();
			
			try {
				Thread.sleep(i*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
