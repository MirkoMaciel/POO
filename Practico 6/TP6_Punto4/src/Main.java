import java.util.Random;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Random ran = new Random();
		
		for (int i = 0; i < 7; i++) {
			Thread t = new Corredor(ran.nextInt(5000, 10001));
			t.setName(""+i);
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO: handle exception
			e.printStackTrace();
			}
		}
		
	}
}