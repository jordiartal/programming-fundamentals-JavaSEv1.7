package herencia_supermercado;
import java.util.Date;


public class Frescos extends Producto {
	public String toString() {
		return "Frescos [fecha_envasado=" + fecha_envasado + ", pais=" + pais
				+ ", fecha_caducidad=" + fecha_caducidad + ", num_lot="
				+ num_lot + "]";
	}
	public Date getFecha_envasado() {
		return fecha_envasado;
	}
	public void setFecha_envasado(Date fecha_envasado) {
		this.fecha_envasado = fecha_envasado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	private Date fecha_envasado;
	private String pais;
	public Frescos(Date fecha_caducidad, int num_lot, Date fecha_envasado,
			String pais) {
		super(fecha_caducidad, num_lot);
		this.fecha_envasado = fecha_envasado;
		this.pais = pais;
	}
}