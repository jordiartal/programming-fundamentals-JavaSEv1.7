package interface_lloguer;
public class Furgoneta extends Vehiculo implements Lloguer {
	double pma;
	public double getPma() {
		return pma;
	}
	public void setPma(int pma) {
		this.pma = pma;
	}
	public Furgoneta(String matricula, String marca, String modelo, double pma) {
		super(matricula, marca, modelo);
		this.pma = pma;
	}
	public String toString() {
		return "Furgoneta [pma=" + pma + ", matricula=" + matricula
				+ ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	public void calcula_pressupost(double dies){
		double preu_total = (dies*50)+(pma*20*dies);
		System.out.println("Serán: "+preu_total+"€");
	}
}