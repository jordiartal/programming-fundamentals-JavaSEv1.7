package interface_lloguer;
public class Cotxe extends Vehiculo implements Lloguer{
	double plaza;
	public double getPlaza() {
		return plaza;
	}
	public void setPlaza(int plaza) {
		this.plaza = plaza;
	}
	public String toString() {
		return "Cotxe [plaza=" + plaza + ", matricula=" + matricula
				+ ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	public Cotxe(String matricula, String marca, String modelo, double plaza) {
		super(matricula, marca, modelo);
		this.plaza = plaza;
	}
	public void calcula_pressupost(double dies){
		double preu_total = (dies*50)+(plaza*1.5*dies);	
		System.out.println("Serán: "+preu_total+"€");
	}
}