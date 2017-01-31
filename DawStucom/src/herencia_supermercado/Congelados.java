package herencia_supermercado;
import java.util.Date;


public class Congelados extends Producto {
	private int temperatura;
	public Congelados(Date fecha_caducidad, int num_lot, int temperatura) {
		super(fecha_caducidad, num_lot);
		this.temperatura = temperatura;
	}
	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public String toString() {
		return "Congelados [temperatura=" + temperatura + ", fecha_caducidad="
				+ fecha_caducidad + ", num_lot=" + num_lot + "]";
	}
}
