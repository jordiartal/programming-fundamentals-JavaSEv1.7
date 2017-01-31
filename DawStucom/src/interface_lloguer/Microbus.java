package interface_lloguer;
public class Microbus extends Vehiculo implements Lloguer {
	double plaza;
	public double getPlaza() {
		return plaza;
	}
	public void setPlaza(int plaza) {
		this.plaza = plaza;
	}
	public Microbus(String matricula, String marca, String modelo, double plaza) {
		super(matricula, marca, modelo);
		this.plaza = plaza;
	}
	public String toString() {
		return "Microbus [plaza=" + plaza + ", matricula=" + matricula
				+ ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	public void calcula_pressupost(double dies){
		double preu_total = (dies*50)+(plaza*1.5*dies)+(plaza*2);
		System.out.println("Serán: "+preu_total+"€");
	} 
}
