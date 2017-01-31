package herencia_supermercado;
import java.util.Date;


public class Producto {
	protected Date fecha_caducidad;
	protected int num_lot;
	public String toString() {
		return "Producto [fecha_caducidad=" + fecha_caducidad + ", num_lot="
				+ num_lot + "]";
	}
	public Producto(Date fecha_caducidad, int num_lot) {
		super();
		this.fecha_caducidad = fecha_caducidad;
		this.num_lot = num_lot;
	}
	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}
	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	public int getNum_lot() {
		return num_lot;
	}
	public void setNum_lot(int num_lot) {
		this.num_lot = num_lot;
	}

}

