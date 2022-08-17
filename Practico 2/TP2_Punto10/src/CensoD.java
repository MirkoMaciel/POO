import java.util.ArrayList;
import java.util.Scanner;


public class CensoD {

	Integer totalidadFamilias = 0; //Total familias censadas
	Integer totalidadIntegrantes= 0; //Integrantes en total censado
	Integer totalidadEdad = 0; //Totalidad de edad de todas las personas
	Integer totalidadEmpleados;
	Integer promedioEdad ;
	
	Persona p = new Persona();
	Familia fami = new Familia();
	
	ArrayList<Familia> familias = new ArrayList<Familia>();
	ArrayList<Persona> persona = new ArrayList<Persona>();
	
	
	
	public void censoHogares () {
		Familia familia1 = new Familia();
		Persona persona1 = new Persona();
		persona1.setNombre("Kevin");
		
		
		
		
		familia1.addIntegrante(persona1);
		
		familia1.getIntegrante().add(persona1);
		
		familia1.getIntegrante().get(0).getApellido();
		
		int edadTotal=0;
		for(int i=0; i<familia1.getIntegrante().size();i++) {
			edadTotal+= familia1.getIntegrante().get(i).getEdad();
		}
		edadTotal / familia1.getIntegrante().size();
		
		familias.add(familia1);
		
		
		
		Character rta = 'S';	
		Scanner in= new Scanner(System.in);
		do {
			int i = 1;
			do { //Primer iterativo para el integrante
				System.out.println("Integrante: "+i);
				fami.generadorFamilia(p);
				System.out.println("Desea ingresar otro integrante a la familia? S/N");
				rta = in.next().toUpperCase().charAt(0);
				i++;
			} while (rta == 'S');
				i=0;
				familias.add(fami);		
				System.out.println("Desea agregar otra familia?S/N");
				rta = in.next().toUpperCase().charAt(0);
			}while(rta == 'S');					
	}

	public void calculoFamilias() {
		System.out.println(familias.size());
	}
	
	public void calculoIntegrantes () {
		for (int i = 0 ; i<familias.size() ; i++) { 
		totalidadIntegrantes = totalidadIntegrantes + fami.getCantidadIntegrantes();
		}
	}

	public void calculoEdades() {
		for (int j= 0 ; j<persona.size(); j ++) { //Recorro el arreglo de personas dentro 1 fam
			totalidadEdad = totalidadEdad + p.getEdad(); //Recupero su edad y la sumo
		}
		promedioEdad = totalidadEdad + totalidadIntegrantes; //Promedio de edad de todo los censados
	}
	
	
	public void calculoEmpleados () {
	for (int x = 0 ; x<familias.size() ; x++) { //Recorro el arreglo de familias
		for (int j= 0 ; j<persona.size(); j ++) { //Recorro el arreglo de personas dentro 1 fam
			if (p.getTrabajo() == true) {
				totalidadEmpleados = totalidadEmpleados++;; //Recupero quien trabajo y quien no
				}
			}	
		}
	}


	public void pruebaCal () {
		calculoFamilias();
		System.out.println("Total familias: "+totalidadFamilias);
		calculoIntegrantes();
		System.out.println("Total integrantes: "+totalidadIntegrantes);
		calculoEdades();
		System.out.println("Promedio edades: "+promedioEdad);
		calculoEmpleados();
		System.out.println("Personas activas laboralmente: "+totalidadEmpleados);
	}
	
	
}


