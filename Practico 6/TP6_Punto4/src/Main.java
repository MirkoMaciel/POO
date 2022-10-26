

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		var co = new Thread();
		
		Corredor c = new Corredor();
		Corredor c2 = new Corredor();
		Corredor c3 = new Corredor();
		Corredor c4 = new Corredor();
		
		c.setName("1");
		c2.setName("2");
		c3.setName("3");
		c4.setName("4");
		
		c.start();
		c.sleep(2000);
		c2.join();
		c2.start();
		c2.sleep(2000);
		c3.join();
		c3.start();
		c3.sleep(2000);
		c4.join();
		c4.start();
		c4.sleep(2000);
		
//		for (int i = 0 ; i < 4 ; i++) {
//			new Thread(co , "Corredor"+i);
//			co.start();
//			co.sleep(2000);
//			co.join();
//		}
		
		
	}
}