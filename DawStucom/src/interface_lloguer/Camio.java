package interface_lloguer;
public class Camio extends Vehiculo implements Lloguer {
	double pma;
	public double getPma() {
		return pma;
	}
	public void setPma(int pma) {
		this.pma = pma;
	}
	public Camio(String matricula, String marca, String modelo, double pma) {
		super(matricula, marca, modelo);
		this.pma = pma;
	}
	public String toString() {
		return "Camio [pma=" + pma + ", matricula=" + matricula + ", marca="
				+ marca + ", modelo=" + modelo + "]";
	}
	public void calcula_pressupost(double dies) {
		double preu_total = 40+(dies*50)+(pma*20*dies);
		System.out.println("Serán: "+preu_total+"€");
	}
}
