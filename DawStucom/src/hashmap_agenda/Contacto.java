package hashmap_agenda;

public class Contacto {

	
		private String nombre;
		private String telefono;
		private String direccion;
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		
		public Contacto(String nombre, String telefono, String direccion) {
			this.nombre = nombre;
			this.telefono = telefono;
			this.direccion = direccion;
		}
		
		public String toString() {
			return "Contacto [nombre=" + nombre + ", telefono=" + telefono
					+ ", direccion=" + direccion + "]";
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((direccion == null) ? 0 : direccion.hashCode());
			result = prime * result
					+ ((nombre == null) ? 0 : nombre.hashCode());
			result = prime * result
					+ ((telefono == null) ? 0 : telefono.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Contacto other = (Contacto) obj;
			if (direccion == null) {
				if (other.direccion != null)
					return false;
			} else if (!direccion.equals(other.direccion))
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			if (telefono == null) {
				if (other.telefono != null)
					return false;
			} else if (!telefono.equals(other.telefono))
				return false;
			return true;
		}
		
		
}
