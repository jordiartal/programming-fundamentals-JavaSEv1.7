package interface_lloguer;
public interface Lloguer {
	static double preu_dia = 50;
	static double preu_dia_persona = 1.5;
	static double preu_seient = 15;
	static double preu_microbus = 2;
	static double preu_fijo_peso = 20;
	static double preu_camio = 40;
	public void calcula_pressupost(double dies);
}