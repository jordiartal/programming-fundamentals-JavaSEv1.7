package examen_castañada;

public class Castanero extends Jugador {
	double castanasVendidas, pinasVendidas, mordiscos;
	protected static double factorCastana = 1.1;
	protected static double factorPina = 1.5; 
	public double getCastanasVendidas() {
		return castanasVendidas;
	}
	public void setCastanasVendidas(int castanasVendidas) {
		this.castanasVendidas = castanasVendidas;
	}
	public double getPinasVendidas() {
		return pinasVendidas;
	}
	public void setPinasVendidas(int pinasVendidas) {
		this.pinasVendidas = pinasVendidas;
	}
	public double getMordiscos() {
		return mordiscos;
	}
	public void setMordiscos(int mordiscos) {
		this.mordiscos = mordiscos;
	}
	public static double getFactorCastana() {
		return factorCastana;
	}
	public static void setFactorCastana(double factorCastana) {
		Castanero.factorCastana = factorCastana;
	}
	public static double getFactorPina() {
		return factorPina;
	}
	public static void setFactorPina(double factorPina) {
		Castanero.factorPina = factorPina;
	}
	//constructor
	public Castanero(String nombre) {
		super(nombre, 0);
		this.castanasVendidas = 0;
		this.pinasVendidas = 0;
		this.mordiscos = 0;
	}
	@Override
	public String toString() {
		return "Castanero [castanasVendidas=" + castanasVendidas
				+ ", pinasVendidas=" + pinasVendidas + ", mordiscos="
				+ mordiscos + ", nombre=" + nombre + ", puntuacion="
				+ puntuacion + ", getCastanasVendidas()="
				+ getCastanasVendidas() + ", getPinasVendidas()="
				+ getPinasVendidas() + ", getMordiscos()=" + getMordiscos()
				+ ", calcularPuntuacion()=" + calcularPuntuacion()
				+ ", getNombre()=" + getNombre() + ", getPuntuacion()="
				+ getPuntuacion() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	//METODE PER PUNTUAR
	double calcularPuntuacion() {
		double puntuacion;
		puntuacion = ((getCastanasVendidas()*getFactorCastana())+(getPinasVendidas()*getFactorPina()))-getMordiscos();
		return puntuacion;
	}
}