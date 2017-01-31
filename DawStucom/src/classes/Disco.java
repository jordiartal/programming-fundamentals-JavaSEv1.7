package classes;
class Disco {

	private String titol;
	private String grupos;
	private int num_temes;
	private double 	duracio;
	
	public Disco(String titol, String grupos, int num_temes, double duracio) {
		this.titol = titol;
		this.grupos = grupos;
		this.num_temes = num_temes;
		this.duracio = duracio;
	}

	public String getTitol() {
		return titol;
	}

	public void setTitol(String titol) {
		this.titol = titol;
	}

	public String getGrupos() {
		return grupos;
	}

	public void setGrupos(String grupos) {
		this.grupos = grupos;
	}

	public int getNum_temes() {
		return num_temes;
	}

	public void setNum_temes(int num_temes) {
		this.num_temes = num_temes;
	}

	public double getDuracio() {
		return duracio;
	}

	public void setDuracio(double duracio) {
		this.duracio = duracio;
	}

}