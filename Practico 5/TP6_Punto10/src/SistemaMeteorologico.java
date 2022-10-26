
public class SistemaMeteorologico extends Observable{

	private String clima;

	public void setClima(String clima) {
		this.clima = clima;
		notificar(); //Notifico a todos los suscriptores
	}
	
	
}
