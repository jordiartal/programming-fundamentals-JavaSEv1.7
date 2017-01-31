package herencia_starcraft;
public class Zerg extends Escuadron {
	double esbirro;
	double overlord;
	public double getEsbirro() {
		return esbirro;
	}
	public void setEsbirro(double esbirro) {
		this.esbirro = esbirro;		
	}
	public double getOverlord() {
		return overlord;
	}
	public void setOverlord(double overlord) {
		this.overlord = overlord;
	}
	public String toString() {
		return "Zerg [esbirro=" + esbirro + ", overlord=" + overlord
				+ ", nombre=" + nombre + ", victorias=" + victorias
				+ ", ataque=" + ataque + ", defensa=" + defensa + "]";
	}
	public Zerg(String nombre, double victorias, double ataque, double defensa,
			double esbirro, double overlord) {
		super(nombre, victorias, ataque, defensa);
		this.esbirro = esbirro;
		this.overlord = overlord;
	}
	//por cada esbirro +30% defensa (DEFENSA)
	public void defensa() {
		if(getEsbirro()>1){
			this.setDefensa(this.getDefensa()+(this.getDefensa()/100*this.getEsbirro()*30));
		}
	}
	//por cada overlord +40% ataque, por cada esbirro +15% ataque (ATAC) 
	public void atac() {
		if(this.getOverlord()>0){
			this.setDefensa(this.getDefensa()+(this.getDefensa()/100*(this.getOverlord()*40)));
		}
		if(this.getEsbirro()>0){
			this.setDefensa(this.getAtaque()+(this.getDefensa()/100*(this.getEsbirro()*15)));
		}
	}
}
