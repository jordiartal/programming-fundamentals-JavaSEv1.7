package abstract_empleados;
public class maquinista extends empleados implements Comparable<maquinista> {
	int maq_anyos;
	int maq_id; 
	public maquinista() {
		super();
	}
		public maquinista(String nombre, int sueldo_base, int edad, int maq_anyos,
			int maq_id) {
		super(nombre, sueldo_base, edad);
		this.maq_anyos = maq_anyos;
		this.maq_id = maq_id;
	}
	public int getMaq_anyos() {
		return maq_anyos;
	}
	public void setMaq_anyos(int maq_anyos) {
		this.maq_anyos = maq_anyos;
	}
	public int getMaq_id() {
		return maq_id;
	}
	public void setMaq_id(int maq_id) {
		this.maq_id = maq_id;
	}
	@Override
	public String visualizarTodosDatos() {
		return "maquinista [nombre=" + nombre + ", sueldo_base=" + sueldo_base
				+ ", edad=" + edad + ", id maquina=" + maq_id + ", años con maquina=" + maq_anyos +"]";
	}
	public int compareTo(maquinista M) {
		return ( this.getMaq_anyos() - M.getMaq_anyos());
	}
}
