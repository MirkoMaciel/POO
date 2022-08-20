import java.util.ArrayList;


public class CensoD {

	Integer totalidadFamilias = 0; // Total familias censadas
	Integer totalidadIntegrantes = 0; // Integrantes en total censado
	Integer totalidadEdad = 0; // Totalidad de edad de todas las personas
	Integer totalidadEmpleados;
	Integer promedioEdad = 0;

	ArrayList<Familia> familias = new ArrayList<Familia>();
	ArrayList<Persona> persona = new ArrayList<Persona>();

	public void censoHogares() {

		Familia familia1 = new Familia();
		Familia familia2 = new Familia();
		Familia familia3 = new Familia();

		Persona p1 = new Persona("Mirko", "Maciel", 21, true, true);
		Persona p2 = new Persona("Santino", "Borda", 11, true, false);
		Persona p3 = new Persona("Claudia ", "Casas", 49, false, true);
		Persona p4 = new Persona("Jorge", "Borda", 42, false, true);
		Persona p5 = new Persona("Pepe", "Perez", 5, false, false);
		Persona p6 = new Persona("Blass", "Rodriguez", 17, false, false);

		familia1.addtegrante(p1);
		familia1.addtegrante(p2);
		familia1.addtegrante(p3);

		familia2.addtegrante(p4);
		familia2.addtegrante(p5);

		familia3.addtegrante(p6);

		familias.add(familia1);
		familias.add(familia2);
		familias.add(familia3);
	}

	public void cantidadIntegrantes() {
		for (int i = 0; i < familias.size(); i++) {
			for (int j = 0; j < familias.get(i).getIntegrante().size(); j++) {
				totalidadIntegrantes++;
			}
		}
	}

	public void cantidadFamilias() {
		totalidadFamilias = familias.size();
	}

	public void promedioEdades() {
		for (int i = 0; i < familias.size(); i++) {
			for (int j = 0; j < familias.get(i).getIntegrante().size(); j++) {
				promedioEdad = promedioEdad + familias.get(j).integrante.get(j).getEdad();
			}
		}
	}

	public void personaLaboralActiva() {
		for (int i = 0; i < familias.size(); i++) {
			for (int j = 0; j < familias.get(i).getIntegrante().size(); j++) {
				if (familias.get(j).integrante.get(j).getTrabajo() == true)
					;
				totalidadEmpleados++;
			}
		}
	}

	public void imprimirResultado() {
		cantidadIntegrantes();
		cantidadFamilias();
		promedioEdades();
		personaLaboralActiva();
		System.out.println("Personas censadas: "+totalidadIntegrantes+"\n");
		System.out.println("Familias Censadas: "+totalidadFamilias+"\n");
		System.out.println("Promedio edades: "+promedioEdad+"\n");
		System.out.println("Persona activa laboralmente: "+totalidadEmpleados+"\n");
	}
	
}


