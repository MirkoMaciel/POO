import java.util.ArrayList;

public class Observable {

	ArrayList<Observer> obs = new ArrayList<>();
	
	void agregar(Observer ob) {
		obs.add(ob);
	}
	
	void eliminar(Observer ob) {
		for (Observer var : obs) {
			if (var.equals(ob)) {
				obs.remove(var);
			}
		}
	}
	
	void notificar () { //Itera sobre todos los obs
		for (Observer var : obs) {
			System.out.println(var.toString());var.update();
		}
	}
	
	
	
}
