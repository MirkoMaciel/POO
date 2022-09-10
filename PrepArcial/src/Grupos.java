import java.util.ArrayList;

public class Grupos extends Competicion{

	Integer topeArreglo = 4;
	ArrayList<String> grupos = new ArrayList<String>(4); //Arreglo grupos con String, con 4 elementos
	Equipos auxS = new Equipos();
	
	public Grupos () {
	
	}
	
	public void armarGrupos() {
		for (int i = 0 ; i < topeArreglo ; i++) {
			String aux = auxS.seleccionEquipo();
			grupos.add(aux);
		}
	}
	
	public void imprimirGrupos() {
		for (int i = 0 ; i < grupos.size(); i++) {
			System.out.println(grupos.get(i));
		}
	}
	
}
