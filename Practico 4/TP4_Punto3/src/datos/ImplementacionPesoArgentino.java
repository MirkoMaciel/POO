package datos;


public class ImplementacionPesoArgentino implements IDatos  {
	

	@Override
	public void formatearMoneda(Double cantidad) {
		System.out.println("Peso Argentino: $"+cantidad*280);
	}

	@Override
	public void formatearFecha(String dia, String mes, String año) {
		// TODO Auto-generated method stub
		System.out.println("D:"+dia+" M:"+mes+" A:"+año);
	}


}
