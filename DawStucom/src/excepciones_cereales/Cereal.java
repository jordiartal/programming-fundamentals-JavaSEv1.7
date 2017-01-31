package excepciones_cereales;
public class Cereal {
	private String nombre;
	private boolean chocolateado;
	private int calorias;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isChocolateado() {
		return chocolateado;
	}
	public void setChocolateado(boolean chocolateado) {
		this.chocolateado = chocolateado;
	}
	public int getCalorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	public String toString() {
		return "Cereal [nombre=" + nombre + ", chocolateado=" + chocolateado
				+ ", calorias=" + calorias + "]";
	}
}
