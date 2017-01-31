package examen_hash;

public final class Chavalin extends Jugador {
	double caramelos=0, castanas=0, pinas=0, mordiscos=0;
	
	public Chavalin(String nombre, double caramelos,
			double castanas, double pinas) {
		super(nombre, 0);
		this.caramelos = caramelos;
		this.castanas = castanas;
		this.pinas = pinas;
	}

	@Override
	public String toString() {
		return "Chavalin [caramelos=" + caramelos + ", castanas=" + castanas
				+ ", pinas=" + pinas + ", mordiscos=" + mordiscos + ", nombre="
				+ nombre + ", puntuacion=" + puntuacion + "]";
	}

	public final double getCaramelos() {
		return caramelos;
	}

	public final void setCaramelos(double caramelos) {
		this.caramelos = caramelos;
	}

	public final double getCastanas() {
		return castanas;
	}

	public final void setCastanas(double castanas) {
		this.castanas = castanas;
	}

	public final double getPinas() {
		return pinas;
	}

	public final void setPinas(double pinas) {
		this.pinas = pinas;
	}

	public final double getMordiscos() {
		return mordiscos;
	}

	public final void setMordiscos(double mordiscos) {
		this.mordiscos = mordiscos;
	}

	@Override
	double CalcularPuntuacion() {
		double puntuacion= this.getPuntuacion()+ this.getCaramelos()+this.getCastanas()+this.getPinas()-this.getMordiscos();
		return puntuacion;
	}
	
}
