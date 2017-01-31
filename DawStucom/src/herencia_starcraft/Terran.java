package herencia_starcraft;
public class Terran extends Escuadron {
	private double edificio;
	private double tecnologia;
	public double getEdificio() {
		return edificio;
	}
	public void setEdificio(double edificio) {
		this.edificio = edificio;
	}
	public double getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(double tecnologia) {
		this.tecnologia = tecnologia;
	}
	public String toString() {
		return "Terran [edificio=" + edificio + ", tecnologia=" + tecnologia
				+ ", nombre=" + nombre + ", victorias=" + victorias
				+ ", ataque=" + ataque + ", defensa=" + defensa + "]";
	}
	public Terran(String nombre, double victorias, double ataque,
			double defensa, double edificio, double tecnologia) {
		super(nombre, victorias, ataque, defensa);
		this.edificio = edificio;
		this.tecnologia = tecnologia;
	}
	//metodo por cada edificio construido 25% + la defensa (DEFENSA)
	public void defensa() {
		if(this.getEdificio()>0){
			this.setDefensa(this.getDefensa()+this.getDefensa()/100*(this.getEdificio()*25));
		}
	}
	//metodo por cada tecnologia descubierta +50% al ataque (ATAC)
	public void atac() {
		if(this.getTecnologia()>0){
			this.setAtaque(this.getAtaque()+this.getAtaque()/100*(this.getTecnologia()*50));
		}
	}	
}