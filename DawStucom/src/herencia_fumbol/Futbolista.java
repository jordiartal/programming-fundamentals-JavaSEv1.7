package herencia_fumbol;

public abstract class Futbolista implements Comparable<Futbolista>{
	protected String nombre;
	protected int dorsal;
	protected int goles;
	
	public Futbolista(String nombre, int dorsal, int goles) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.goles = goles;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	@Override
	public String toString() {
		return "Futbolista [nombre=" + nombre + ", dorsal=" + dorsal
				+ ", goles=" + goles + "]";
	}

	public abstract int getValoracion();

	@Override
	public int compareTo(Futbolista o) {
		return (this.getValoracion() - o.getValoracion());
	}
}
