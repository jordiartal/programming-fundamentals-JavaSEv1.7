package herencia_starcraft;
public abstract class Escuadron implements Comparable<Escuadron>{
	protected String nombre;
	protected double victorias;
	protected double ataque;
	protected double defensa;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getVictorias() {
		return victorias;
	}
	public void setVictorias(double victorias) {
		this.victorias = victorias;
	}
	public double getAtaque() {
		return ataque;
	}
	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}
	public double getDefensa() {
		return defensa;
	}
	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}
	public String toString() {
		return "Escuadron [nombre=" + nombre + ", victorias=" + victorias
				+ ", ataque=" + ataque + ", defensa=" + defensa + "]";
	}
	public Escuadron(String nombre, double victorias, double ataque,
			double defensa) {
		super();
		this.nombre = nombre;
		this.victorias = victorias;
		this.ataque = ataque;
		this.defensa = defensa;
	}
	public abstract void defensa();
	public abstract void atac();
	
	public int compareTo(Escuadron o) {
		return (int) (this.getVictorias() - o.getVictorias());
	}
}