package herencia_mecanic;
public class Mecanica extends Treball {
	private double preu_material;
	static double cost_material=1.1;
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
		Mecanica.cost_material = cost_material;
	}		
	public Mecanica(String descripcio, int hores, boolean acaba,
			double preu_hora, double preu_final) {
		super(descripcio, hores, acaba, preu_hora, preu_final);
	}
	public Mecanica(String descripcio, int hores, boolean acaba,
			double preu_hora, double preu_final, double preu_material) {
		super(descripcio, hores, acaba, preu_hora, preu_final);
		this.preu_material = preu_material;
	}
	public Mecanica() {
	}
	public String toString() {
		return "mecanica [preu_material=" + preu_material + ", descripcio=" + descripcio + ", hores=" + hores
				+ ", acaba=" + acaba + ", preu_hora=" + preu_hora
				+ ", preu_final=" + preu_final + "]";
	}
}
