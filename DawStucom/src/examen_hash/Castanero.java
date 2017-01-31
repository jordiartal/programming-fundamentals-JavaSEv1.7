package examen_hash;

public final class Castanero extends Jugador {
	public double castanasVendidas=0, pinasVendidas=0, mordiscos=0, factorCastana=1.1, factorPina=1.5;
	
	public final double getCastanasVendidas() {
		return castanasVendidas;
	}

	public final void setCastanasVendidas(double castanasVendidas) {
		this.castanasVendidas = castanasVendidas;
	}

	public final double getPinasVendidas() {
		return pinasVendidas;
	}

	public final void setPinasVendidas(double pinasVendidas) {
		this.pinasVendidas = pinasVendidas;
	}

	public final double getMordiscos() {
		return mordiscos;
	}

	public final void setMordiscos(double mordiscos) {
		this.mordiscos = mordiscos;
	}

	public final double getFactorCastana() {
		return factorCastana;
	}

	public final void setFactorCastana(double factorCastana) {
		this.factorCastana = factorCastana;
	}

	public final double getFactorPina() {
		return factorPina;
	}

	public final void setFactorPina(double factorPina) {
		this.factorPina = factorPina;
	}

	

	@Override
	double CalcularPuntuacion() {
		double puntuacion= this.getPuntuacion() +
				( this.getCastanasVendidas()*this.getFactorCastana() ) +
				( this.getPinasVendidas()*this.getFactorPina() ) -
				this.getMordiscos();
		return puntuacion;
	}

	@Override
	public String toString() {
		return "Castanero [castanasVendidas=" + castanasVendidas
				+ ", pinasVendidas=" + pinasVendidas + ", mordiscos="
				+ mordiscos + ", factorCastana=" + factorCastana
				+ ", factorPina=" + factorPina + ", nombre=" + nombre
				+ ", puntuacion=" + puntuacion + "]";
	}

	public Castanero(String nombre, double castanasVendidas,
			double pinasVendidas) {
		super(nombre, 0);
		this.castanasVendidas = castanasVendidas;
		this.pinasVendidas = pinasVendidas;
	}

}
