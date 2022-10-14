package datos;

public class ImplementacionDolarEEUU implements IDatos{

	@Override
	public void formatearMoneda(Double cantidad) {
		// TODO Auto-generated method stub
		System.out.println("Dolar EE.UU: U$$ "+ cantidad);
	}

	@Override
	public void formatearFecha(String dia, String mes, String año) {
		// TODO Auto-generated method stub
		System.out.println(" M:"+mes+" D:"+dia+" A:"+año);
	}

}
