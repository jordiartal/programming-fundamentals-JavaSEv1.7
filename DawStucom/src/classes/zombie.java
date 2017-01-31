package classes;
import java.util.Arrays;

public class zombie {
	static int vida = 0;
	private String nombre;
	int[]cerebros;

	public zombie(String nombre, int[] cerebros) {
		super();
		this.nombre = nombre;
		this.cerebros = cerebros;
	}

	public static int getVida() {
		return vida;
	}

	public static void setVida(int vida) {
		zombie.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getCerebros() {
		return cerebros;
	}

	public void setCerebros(int[] cerebros) {
		this.cerebros = cerebros;
	}

	@Override
	public String toString() {
		return "zombie [nombre=" + nombre + ", cerebros="+ Arrays.toString(cerebros) + "]";
	}
}
	
