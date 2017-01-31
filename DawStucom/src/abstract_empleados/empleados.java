package abstract_empleados;
public abstract class empleados {
	String nombre;
	int sueldo_base;
	int edad;
	public empleados() {
		super();
	}
	public empleados(String nombre, int sueldo_base, int edad) {
		super();
		this.nombre = nombre;
		this.sueldo_base = sueldo_base;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldo_base() {
		return sueldo_base;
	}
	public void setSueldo_base(int sueldo_base) {
		this.sueldo_base = sueldo_base;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public abstract String visualizarTodosDatos();
}