package herencia_fumbol;

public class Portero extends Futbolista {
	private int paradas;

	public Portero(String nombre, int dorsal, int goles, int paradas) {
		super(nombre, dorsal, goles);
		this.paradas = paradas;
	}

	public int getParadas() {
		return paradas;
	}

	public void setParadas(int paradas) {
		this.paradas = paradas;
	}

	@Override
	public String toString() {
		return "Portero [paradas=" + paradas + ", nombre=" + nombre
				+ ", dorsal=" + dorsal + ", goles=" + goles + "]";
	}
	
	public int getValoracion(){
		return (this.paradas * 5) + (this.goles * 30);
	}
}
