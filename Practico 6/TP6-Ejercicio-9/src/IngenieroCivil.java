import java.util.ArrayList;

public class IngenieroCivil extends Thread { //Consumidor
	private String nombre;
	private Servidor servidor;
	private ArrayList<PaqueteDatos> colPaquete = new ArrayList<PaqueteDatos>();

	public IngenieroCivil(Servidor servidor, String nombre) {
		super();
		this.nombre = nombre;
		this.servidor = servidor;
	}

	public void informe() {
		Integer apto = 0;
		for (PaqueteDatos paqueteDatos : colPaquete) {
			if(paqueteDatos.getAnguloVertical() < 30.0) {
				apto += 1;
			}
		}
		System.out.println("\nDe los " + colPaquete.size() + ", " + apto + " son aptos para construir.");
	}

	public void run() {
		Integer contador = 0;
		while (contador < 2) { //Porque son 2 ingObra
			PaqueteDatos paquete = this.getServidor().obtenerDato();
			if (paquete == null) {
				contador++;
			} else {
				this.getColPaquete().add(paquete);
			}
		}
		
		this.informe();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public ArrayList<PaqueteDatos> getColPaquete() {
		return colPaquete;
	}

	public void setColPaquete(ArrayList<PaqueteDatos> colPaquete) {
		this.colPaquete = colPaquete;
	}

}
