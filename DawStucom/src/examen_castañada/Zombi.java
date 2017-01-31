package examen_castañada;
public class Zombi extends Jugador {
	double chavalinesMordidos, castanerosMordidos;
	protected static double factorChavalin = 1.6;
	public double getChavalinesMordidos() {
		return chavalinesMordidos;
	}
	public void setChavalinesMordidos(double chavalinesMordidos) {
		this.chavalinesMordidos = chavalinesMordidos;
	}
	public double getCastanerosMordidos() {
		return castanerosMordidos;
	}
	public void setCastanerosMordidos(double castanerosMordidos) {
		this.castanerosMordidos = castanerosMordidos;
	}
	public static double getFactorChavalin() {
		return factorChavalin;
	}
	public static void setFactorChavalin(double factorChavalin) {
		Zombi.factorChavalin = factorChavalin;
	}
	//CONSTRUCTOR
	public Zombi(String nombre) {
		super(nombre, 0);
		this.chavalinesMordidos = 0;
		this.castanerosMordidos = 0;
	}
	@Override
	public String toString() {
		return "zombi [chavalinesMordidos=" + chavalinesMordidos
				+ ", castanerosMordidos=" + castanerosMordidos + ", nombre="
				+ nombre + ", puntuacion=" + puntuacion
				+ ", getChavalinesMordidos()=" + getChavalinesMordidos()
				+ ", getCastanerosMordidos()=" + getCastanerosMordidos()
				+ ", calcularPuntuacion()=" + calcularPuntuacion()
				+ ", getNombre()=" + getNombre() + ", getPuntuacion()="
				+ getPuntuacion() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	// METODE PER PUNTUAR
	double calcularPuntuacion() {
		double puntuacion = (getChavalinesMordidos()*getFactorChavalin())+getCastanerosMordidos();
		return puntuacion;
	}
}
