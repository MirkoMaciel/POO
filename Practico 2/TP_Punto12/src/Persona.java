import java.time.LocalDate;
import java.util.Scanner;


public class Persona {

		Scanner sc = new Scanner(System.in);
		
		private String nombre;
		private String apellido;
		private LocalDate fechaNacimiento;
		
		public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaNacimiento = fechaNacimiento;
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

		@Override
		public String toString() {
			return "Nombre: " + nombre + ", Apellido:" + apellido + ", FechaNacimiento: " + fechaNacimiento
					+ "";
		}
		
		public void impriFecha(LocalDate fechaNacimiento) { //clase que no devuelve un valor
			//Entra fechaNac que es local date y la imprimo
			System.out.println(fechaNacimiento);
		}
		
}
