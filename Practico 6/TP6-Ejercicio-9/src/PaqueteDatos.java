
public class PaqueteDatos {
	private Double anguloVertical;
	private Double anguloHorizontal;

	public PaqueteDatos(Double anguloVertical, Double anguloHorizontal) {
		super();
		this.anguloVertical = anguloVertical;
		this.anguloHorizontal = anguloHorizontal;
	}

	@Override
	public String toString() {
		return "PaqueteDatos [anguloVertical= " + anguloVertical + ", anguloHorizontal= " + anguloHorizontal + "]";
	}

	public Double getAnguloVertical() {
		return anguloVertical;
	}

	public void setAnguloVertical(Double anguloVertical) {
		this.anguloVertical = anguloVertical;
	}

	public Double getAnguloHorizontal() {
		return anguloHorizontal;
	}

	public void setAnguloHorizontal(Double anguloHorizontal) {
		this.anguloHorizontal = anguloHorizontal;
	}
}
