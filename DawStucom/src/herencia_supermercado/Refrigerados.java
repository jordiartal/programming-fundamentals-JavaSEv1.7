package herencia_supermercado;
import java.util.Date;


public class Refrigerados extends Producto {

	private String codigo;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Refrigerados(Date fecha_caducidad, int num_lot, String codigo) {
		super(fecha_caducidad, num_lot);
		this.codigo = codigo;
	}

	public String toString() {
		return "Refrigerados [codigo=" + codigo + ", fecha_caducidad="
				+ fecha_caducidad + ", num_lot=" + num_lot + "]";
	}


}
