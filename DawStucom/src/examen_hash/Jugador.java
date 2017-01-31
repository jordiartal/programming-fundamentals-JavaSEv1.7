package examen_hash;

public abstract class Jugador {
	public String nombre;
	public double puntuacion=0;
	abstract double CalcularPuntuacion();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
	}
	public Jugador(String nombre, double puntuacion) {
		super();
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}	
}
