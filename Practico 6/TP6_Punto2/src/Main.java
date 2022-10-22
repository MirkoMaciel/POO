
public class Main {

	public static void main(String[] args) {
		
	Contador c = new Contador();
	HilosModifican hm = new HilosModifican(c);
	Thread t1 = new Thread(hm);
	Thread t2 = new Thread(hm);
	
	t1.start();
	t2.start();

}
}