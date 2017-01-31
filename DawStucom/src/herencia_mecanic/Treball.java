package herencia_mecanic;
public class Treball {
	protected String descripcio;
	protected int hores;
	protected boolean acaba=false;
	protected double preu_hora=30;
	protected double preu_final;
	

	public String getDescripcio() {
		return descripcio;
	}
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	public int getHores() {
		return hores;
	}
	public void setHores(int hores) {
		this.hores = hores;
	}
	public boolean isAcaba() {
		return acaba;
	}
	public void setAcaba(boolean acaba) {
		this.acaba = acaba;
	}
	public double getPreu_hora() {
		return preu_hora;
	}
	public void setPreu_hora(double preu_hora) {
		this.preu_hora = preu_hora;
	}
	public double getPreu_final() {
		return preu_final;
	}
	public void setPreu_final(double preu_final) {
		this.preu_final = preu_final;
	}
	public Treball( String descripcio, int hores, boolean acaba,
			double preu_hora, double preu_final) {
		super();
		this.descripcio = descripcio;
		this.hores = hores;
		this.acaba = acaba;
		this.preu_hora = preu_hora;
		this.preu_final = preu_final;
	}
	
	
	public Treball() {
		super();
	}
	public String toString() {
		return "treball [descripcio=" + descripcio + ", hores="
				+ hores + ", acaba=" + acaba + ", preu_hora=" + preu_hora
				+ ", preu_final=" + preu_final + "]";
	}
	
}