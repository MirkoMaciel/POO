import java.time.LocalDate;

public class Persona {

		private String nombre;
		private String apellido;
		private LocalDate fechaNacimiento;
		
		public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaNacimiento = fechaNacimiento;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
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
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
					+ "]";
		}
		
		public void impriFecha(LocalDate fechaNacimiento) { //clase que no devuelve un valor
			//Entra fechaNac que es local date y la imprimo
			System.out.println(fechaNacimiento);
		}
		
}
	


