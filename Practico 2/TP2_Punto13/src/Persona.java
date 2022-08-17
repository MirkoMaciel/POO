import java.time.LocalDate;
import java.util.Scanner;


public class Persona {

		Scanner sc = new Scanner(System.in);
		
		private String nombre;
		private String apellido;
		private LocalDate fechaNacimiento;
		private Puesto puesto;
		
		public Persona(String nombre, String apellido, LocalDate fechaNacimiento , Puesto puesto) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaNacimiento = fechaNacimiento;
			this.puesto = puesto;
		}
		
		public Persona() {
			super();
		}


		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			nombre = sc.nextLine();
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			apellido = sc.nextLine();
			this.apellido = apellido;
		}

		public LocalDate getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(LocalDate fechaNacimiento) {
			
			this.fechaNacimiento = fechaNacimiento;
		}

		
		public Puesto getPuesto() {
			return puesto;
		}

		public void setPuesto(Puesto puesto) {
			puesto.nombre = sc.nextLine();
			this.puesto = puesto;
		}

		@Override
		public String toString() {
			
			return "Nombre: " + nombre + ", Apellido:" + apellido + ", FechaNacimiento: " + fechaNacimiento
					+ " Puesto: " + puesto + "\n\n";
		}
		
		public void impriFecha(LocalDate fechaNacimiento) { //clase que no devuelve un valor
			//Entra fechaNac que es local date y la imprimo
			System.out.println(fechaNacimiento);
		}
		
}
