package examen_piloto;

public class Piloto implements Comparable<Piloto>{
	protected String nombre, equipo; 
	protected double dorsal, puntos=0;
	public final String getNombre() {
		return nombre;
	}
	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public final String getEquipo() {
		return equipo;
	}
	public final void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public final double getDorsal() {
		return dorsal;
	}
	public final void setDorsal(double dorsal) {
		this.dorsal = dorsal;
	}
	public final double getPuntos() {
		return puntos;
	}
	public final void setPuntos(double puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", equipo=" + equipo + ", dorsal="
				+ dorsal + ", puntos=" + puntos + "]";
	}
	public Piloto(String nombre, String equipo, double dorsal) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
		this.dorsal = dorsal;
	}
	@Override
	public int compareTo(Piloto d) {

		return 0;
	}
	
}
