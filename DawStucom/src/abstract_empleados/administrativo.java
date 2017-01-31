package abstract_empleados;
import java.util.*;
public class administrativo extends empleados implements Comparable<administrativo>{
	ArrayList<String> estudios = new ArrayList<String>();
	int pc_asig;
	public administrativo() {
		super();
	}
	public administrativo(String nombre, int sueldo_base, int edad,
			ArrayList<String> estudios, int pc_asig) {
		super(nombre, sueldo_base, edad);
		this.estudios = estudios;
		this.pc_asig = pc_asig;
	}
	public int getPc_asig() {
		return pc_asig;
	}
	public void setPc_asig(int pc_asig) {
		this.pc_asig = pc_asig;
	}
	public ArrayList<String> getEstudios() {
		return estudios;
	}
	public void setEstudios(ArrayList<String> estudios) {
		this.estudios = estudios;
	}
	@Override
	public String visualizarTodosDatos() {
		String dades="";
		for(int i=0;i<estudios.size();i++){
			dades = dades + ("id de estudio="+i+",descripcion estudio="+estudios.get(i)+",");
		}		
		return "administrativo [nombre=" + nombre + ", sueldo_base=" + sueldo_base
				+ ", edad=" + edad + ", pc_asig=" + pc_asig + dades + "]";
	}
	public int compareTo(administrativo A) {
		return (this.estudios.size() - A.estudios.size());
	}
}

