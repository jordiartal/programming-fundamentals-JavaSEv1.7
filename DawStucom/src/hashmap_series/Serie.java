package hashmap_series;
public class Serie implements Comparable<Serie>{
	private String titulo;
	private String tipo;
	private int anyo;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public Serie(String titulo, String tipo, int anyo) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
		this.anyo = anyo;
	}
	public String toString() {
		return "Serie [titulo=" + titulo + ", tipo=" + tipo + ", anyo=" + anyo
				+ "]";
	}
	public int compareTo(Serie arg0) {
		return this.getAnyo()-arg0.getAnyo();
	}
}
