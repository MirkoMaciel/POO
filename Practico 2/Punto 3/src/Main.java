

public class Main {

	public static void main(String[] args) {

		Cancion cn = new Cancion("Un velero llamado libertad" , "José Luis Perales" , 100);
			System.out.print(cn);
			
	}
}

//Lo que hice fue separar la clase Cancion de la main
//Coloque los getters y setters, además del constructor. Posterior defini el ToString, para poder imprimir
//Lo último que se modifico de dicha clase, es la privacidad de los atributos, para que solo puedan ser accedidos por dicha clase
//En la main, borre los 3 llamados aparte que tenia "cancion", para hacerlo unitariamente con el ToString
//Y defini todo en una sola linea.



