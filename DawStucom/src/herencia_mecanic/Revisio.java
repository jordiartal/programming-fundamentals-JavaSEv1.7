package herencia_mecanic;

public class Revisio extends Treball {
	
	public Revisio(String descripcio, int hores, boolean acaba,
			double preu_hora, double preu_final) {
		super(descripcio, hores, acaba, preu_hora, preu_final);
	}


	public Revisio() {
		
	}


	private static double cost=20;

	public static double getCost() {
		return cost;
	}

	public static void setCost(double cost) {
		Revisio.cost = cost;
	}

	
	public String toString() {
		return "revisio [descripcio=" + descripcio + ", hores="
				+ hores + ", acaba=" + acaba + ", preu_hora=" + preu_hora
				+ ", preu_final=" + preu_final + "]";
	}
}
