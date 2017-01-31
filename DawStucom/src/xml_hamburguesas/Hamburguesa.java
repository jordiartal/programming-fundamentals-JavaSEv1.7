package xml_hamburguesas;
public class Hamburguesa {
	private double calorias;
	private String nombre;
	private String tipoCarne;
	private double peso;
	public Hamburguesa(double calorias, String nombre, String tipoCarne,
			double peso) {
		super();
		this.calorias = calorias;
		this.nombre = nombre;
		this.tipoCarne = tipoCarne;
		this.peso = peso;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoCarne() {
		return tipoCarne;
	}
	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Hamburguesa [calorias=" + calorias + ", nombre=" + nombre
				+ ", tipoCarne=" + tipoCarne + ", peso=" + peso + "]";
	}	
}