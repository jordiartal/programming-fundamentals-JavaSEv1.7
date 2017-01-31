package examen_castañada;
public class Chavalin extends Jugador {
	double caramelos, castañas, pinas, mordiscos;
	public double getCaramelos() {
		return caramelos;
	}
	public void setCaramelos(double caramelos) {
		this.caramelos = caramelos;
	}
	public double getCastañas() {
		return castañas;
	}
	public void setCastañas(double castañas) {
		this.castañas = castañas;
	}
	public double getPinas() {
		return pinas;
	}
	public void setPinas(double pinas) {
		this.pinas = pinas;
	}
	public double getMordiscos() {
		return mordiscos;
	}
	public void setMordiscos(double mordiscos) {
		this.mordiscos = mordiscos;
	}
	public Chavalin(String nombre) {
		super(nombre, 0);
		this.mordiscos = 0;
		if (nombre.equals("Little Nicholas")){
			this.caramelos = 10;
			this.castañas = 5;
			this.pinas = 1;
		}
		else{
			this.caramelos = 0;
			this.castañas = 0;
			this.pinas = 0;
		}
	}
	@Override
	public String toString() {
		return "chavalin [caramelos=" + caramelos + ", castañas=" + castañas
				+ ", pinas=" + pinas + ", mordiscos=" + mordiscos + ", nombre="
				+ nombre + ", puntuacion=" + puntuacion + ", getCaramelos()="
				+ getCaramelos() + ", getCastañas()=" + getCastañas()
				+ ", getPinas()=" + getPinas() + ", getMordiscos()="
				+ getMordiscos() + ", calcularPuntuacion()="
				+ calcularPuntuacion() + ", getNombre()=" + getNombre()
				+ ", getPuntuacion()=" + getPuntuacion() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	// METODE PER PUNTUAR
	double calcularPuntuacion() {
	double	puntuacion = getCaramelos()+getCastañas()+getPinas()-getMordiscos();
		return puntuacion;
	}
}