package herencia_mecanic;

public class Chapa extends Treball {
	
	public Chapa(String descripcio, int hores, boolean acaba, double preu_hora,
			double preu_final) {
		super(descripcio, hores, acaba, preu_hora, preu_final);
		
	}

	public Chapa() {
	}

	private double preu_material;
	private static double cost_material=1.3;
	
	public double getPreu_material() {
		return preu_material;
	}
	public void setPreu_material(double preu_material) {
		this.preu_material = preu_material;
	}
	public static double getCost_material() {
		return cost_material;
	}
	public static void setCost_material(double cost_material) {
		Chapa.cost_material = cost_material;
	}
	
	public String toString() {
		return "chapa [preu_material=" + preu_material + ", descripcio=" + descripcio + ", hores=" + hores
				+ ", acaba=" + acaba + ", preu_hora=" + preu_hora
				+ ", preu_final=" + preu_final + "]";
	}
	
}
