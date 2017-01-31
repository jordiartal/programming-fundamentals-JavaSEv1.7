package hashmap_juegos;

public class JuegoMesa extends Juego {
	@Override
	public String toString() {
		return "JuegoMesa [numeroJugadores=" + numeroJugadores + ", tipo="
				+ tipo + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", precio=" + precio + "]";
	}
	private int numeroJugadores;
	private String tipo;
	public JuegoMesa(int codigo, String nombre, double precio,
			int numeroJugadores, String tipo) {
		super(codigo, nombre, precio);
		this.numeroJugadores = numeroJugadores;
		this.tipo = tipo;
	}
	public int getNumeroJugadores() {
		return numeroJugadores;
	}
	public void setNumeroJugadores(int numeroJugadores) {
		this.numeroJugadores = numeroJugadores;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
