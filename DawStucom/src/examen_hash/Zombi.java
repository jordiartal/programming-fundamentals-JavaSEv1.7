package examen_hash;
public final class Zombi extends Jugador {
	double chavalinesMordidos=0, castanerosMordidos=0, factorChavalin = 1.6;

	@Override
	double CalcularPuntuacion() {
		double puntuacion= this.getPuntuacion() + 
				(this.getChavalinesMordidos()*this.getfactorChavalin())+
				(this.getCastanerosMordidos());
		return puntuacion;
	}

	public final double getChavalinesMordidos() {
		return chavalinesMordidos;
	}

	public final void setChavalinesMordidos(double chavalinesMordidos) {
		this.chavalinesMordidos = chavalinesMordidos;
	}

	public final double getCastanerosMordidos() {
		return castanerosMordidos;
	}

	public final void setCastanerosMordidos(double castanerosMordidos) {
		this.castanerosMordidos = castanerosMordidos;
	}

	public final double getfactorChavalin() {
		return factorChavalin;
	}

	public final void setfactorChavalin(double factorChavalin) {
		this.factorChavalin = factorChavalin;
	}

	@Override
	public String toString() {
		return "Zombi [chavalinesMordidos=" + chavalinesMordidos
				+ ", castanerosMordidos=" + castanerosMordidos
				+ ", factorChavalin=" + factorChavalin + ", nombre=" + nombre
				+ ", puntuacion=" + puntuacion + "]";
	}

	public Zombi(String nombre, double chavalinesMordidos,
			double castanerosMordidos) {
		super(nombre,0);
		this.chavalinesMordidos = chavalinesMordidos;
		this.castanerosMordidos = castanerosMordidos;
	}

}
