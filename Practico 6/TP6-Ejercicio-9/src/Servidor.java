import java.util.LinkedList;

public class Servidor {
	private LinkedList<PaqueteDatos> buffer = new LinkedList<PaqueteDatos>();

	public synchronized PaqueteDatos obtenerDato() {
		while (buffer.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		PaqueteDatos unPaquete = buffer.removeFirst();
		if (unPaquete != null) {
			System.out.println("OBTENER DATO: " + unPaquete.toString());
		}
		notifyAll();
		return unPaquete;
	}

	public synchronized void agregarDato(PaqueteDatos unPaqueteDatos) {
		while (buffer.size() >= 3) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		if (unPaqueteDatos != null) {
			System.out.println("\nAGREGA DATO: " + unPaqueteDatos.toString());
		}
		buffer.add(unPaqueteDatos);
		notifyAll();
	}

	public LinkedList<PaqueteDatos> getBuffer() {
		return buffer;
	}

	public void setBuffer(LinkedList<PaqueteDatos> buffer) {
		this.buffer = buffer;
	}

}
