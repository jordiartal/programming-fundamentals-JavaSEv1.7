package herencia_starcraft;
public class Protos extends Escuadron {
	private double pilon;
	public double getPilon() {
		return pilon;
	}
	public void setPilon(double pilon) {
		this.pilon = pilon;
	}
	public Protos(String nombre, double victorias, double ataque,
			double defensa, double pilon) {
		super(nombre, victorias, ataque, defensa);
		this.pilon = pilon;
	}
	public String toString() {
		return "Protos [pilon=" + pilon + ", nombre=" + nombre + ", victorias="
				+ victorias + ", ataque=" + ataque + ", defensa=" + defensa
				+ "]";
	}
	//cada pilon +50% (DEFENSA)
	public void defensa() {
		if(this.getPilon()>0){
			this.setDefensa(this.getDefensa()+(this.getDefensa()/100*(this.getPilon()*50)));
		}		
	}
	//cada pilon +50% (ATAC)
	public void atac() {
		if(this.getPilon()>0){
			this.setAtaque(this.getAtaque()+(this.getAtaque()/100*(this.getPilon()*50)));
		}
	}
}