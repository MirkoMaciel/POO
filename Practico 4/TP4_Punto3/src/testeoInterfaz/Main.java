package testeoInterfaz;

//import datos.IDatos.*; //Debido a que se van a usar variables clase/intefaces, se pone .* Importa los tipos Interfaces y tipo Clase
import datos.*;  //paquete.*

public class Main {

	public static void main(String[] args) {

		/* IDatos datos = new IDatos();  No se puede instanciar objetos de interfaces, ya que son abstractas
		/Para trabajar con los metodos implementados en la interfaces, vamos a tomar las clases que implementan la interfaz
		 * 
		 * En la interfaz abstraemos, comportamientos o funcionalidades.
		 * */
		
		IDatos datos = new ImplementacionPesoArgentino();
		IDatos datos2 = new ImplementacionDolarEEUU();
		
		var i = 1000.7;
		
		datos.formatearFecha("12", "2", "1");
		datos.formatearMoneda(i);
		
		datos2.formatearFecha("12", "2", "1");
		datos2.formatearMoneda(i);
	}

}
		