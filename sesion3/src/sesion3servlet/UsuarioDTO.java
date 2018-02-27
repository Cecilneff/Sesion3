package sesion3servlet;

public class UsuarioDTO {
		public String dni;
		public String nombre;
		public String apellido;
		
			
		public UsuarioDTO(String DNI, String nombre, String apellido) {
			
			this.dni = DNI;
			this.nombre = nombre;
			this.apellido = apellido;
		}
		public UsuarioDTO() {
			// TODO Auto-generated constructor stub
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
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
		
		@Override
		public String toString() {
			return this.getNombre()+" "+this.getApellido();
		}
	
	


}
