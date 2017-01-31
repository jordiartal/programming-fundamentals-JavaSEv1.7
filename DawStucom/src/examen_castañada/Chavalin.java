package examen_casta�ada;
public class Chavalin extends Jugador {
	double caramelos, casta�as, pinas, mordiscos;
	public double getCaramelos() {
		return caramelos;
	}
	public void setCaramelos(double caramelos) {
		this.caramelos = caramelos;
	}
	public double getCasta�as() {
		return casta�as;
	}
	public void setCasta�as(double casta�as) {
		this.casta�as = casta�as;
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
			this.casta�as = 5;
			this.pinas = 1;
		}
		else{
			this.caramelos = 0;
			this.casta�as = 0;
			this.pinas = 0;
		}
	}
	@Override
	public String toString() {
		return "chavalin [caramelos=" + caramelos + ", casta�as=" + casta�as
				+ ", pinas=" + pinas + ", mordiscos=" + mordiscos + ", nombre="
				+ nombre + ", puntuacion=" + puntuacion + ", getCaramelos()="
				+ getCaramelos() + ", getCasta�as()=" + getCasta�as()
				+ ", getPinas()=" + getPinas() + ", getMordiscos()="
				+ getMordiscos() + ", calcularPuntuacion()="
				+ calcularPuntuacion() + ", getNombre()=" + getNombre()
				+ ", getPuntuacion()=" + getPuntuacion() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	// METODE PER PUNTUAR
	double calcularPuntuacion() {
	double	puntuacion = getCaramelos()+getCasta�as()+getPinas()-getMordiscos();
		return puntuacion;
	}
}