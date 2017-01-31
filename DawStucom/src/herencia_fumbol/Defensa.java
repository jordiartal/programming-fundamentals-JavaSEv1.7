package herencia_fumbol;

public class Defensa extends Futbolista {
	private int pases;
	private int recuperaciones;
	
	public Defensa(String nombre, int dorsal, int goles, int pases,
			int recuperaciones) {
		super(nombre, dorsal, goles);
		this.pases = pases;
		this.recuperaciones = recuperaciones;
	}

	public int getPases() {
		return pases;
	}

	public void setPases(int pases) {
		this.pases = pases;
	}

	public int getRecuperaciones() {
		return recuperaciones;
	}

	public void setRecuperaciones(int recuperaciones) {
		this.recuperaciones = recuperaciones;
	}

	@Override
	public String toString() {
		return "Defensa [pases=" + pases + ", recuperaciones=" + recuperaciones
				+ ", nombre=" + nombre + ", dorsal=" + dorsal + ", goles="
				+ goles + "]";
	}
	
	public int getValoracion(){
		return this.pases + (this.recuperaciones * 4) + (this.goles * 30);
	}
}
