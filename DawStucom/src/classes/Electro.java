package classes;
public class Electro {

	//atributs
		private double preubase;
		private String color;
		private String consener;
		private double pes;
		
	//constructors
		
		//constructor per defecte
		public Electro(){
			this.setPreubase(100,5,"F");
			this.setColor("blanco");
			this.setConsener("F");
			this.setPes(5);
		}
		
		//cosntructor amb preu i pes
		public Electro(String color, String consener){
			this.setPreubase(300,50,consener);
			this.setColor(color);
			this.setConsener(consener);
			this.setPes(50);
		}
		
		//constructor amb tots els atributs
		public Electro(double preubase, String color, String consener, double pes){
			this.setPreubase(preubase,pes,consener);
			this.setColor(color);
			this.setConsener(consener);
			this.setPes(pes);
		}
		
	//setters
		public void setPreubase(double preubase, double pes, String consener){
			this.preubase=preuFinal(preubase, pes, consener);
		}
		public void setColor(String color){
			this.color=comprovaColors(color);
		}
		public void setConsener(String consener){
			this.consener=comprovaConsum(consener);
		}
		public void setPes(double pes){
			this.pes=pes;
		}
	
	//getters
		public double getPreubase(){
	        return this.preubase;
	    }
		public String getColor(){
	        return this.color;
	    }
		public String getConsener(){
	        return this.consener;
	    }
		public double getPes(){
	        return this.pes;
	    }
		
	//metodes
		
		//comprobar consum enegetic (char lletra)
		private String comprovaConsum (String consener){
			String lletra=null;
				if (consener.equals("A") ||
					consener.equals("B") ||
					consener.equals("C") ||
					consener.equals("D") ||
					consener.equals("E") ||
					consener.equals("F")){
					lletra=consener;
				}
				else{
					lletra="F";
				}
			return this.consener=lletra;
		}
		
		//comprobar color (string color)
		private String comprovaColors (String color){
			String tonalitat=null;
			if (color.equals("blanco") ||
					color.equals("negro") ||
					color.equals("rojo") ||
					color.equals("azul") ||
					color.equals("gris") ||
					color.equals("BLANCO")||
					color.equals("ROJO")||
					color.equals("NEGRO")||
					color.equals("AZUL")||
					color.equals("GRIS")){
					tonalitat=color;
				}
				else{
					tonalitat="BLANCO";
				}
			return this.color=tonalitat;
		}
		
		//preu final, segons consum energetic y preu
		private double preuFinal (double preubase, double pes, String consener){
			double pfinal=0;
				if(consener.equals("A")){
					pfinal=100;
				}
				if(consener.equals("B")){
					pfinal=80;
				}
				if(consener.equals("C")){
					pfinal=60;
				}
				if(consener.equals("D")){
					pfinal=50;
				}
				if(consener.equals("E")){
					pfinal=30;
				}
				if(consener.equals("F")){
					pfinal=10;
				}
				if(pes > -1 && pes < 20){
					pfinal=pfinal+10;
				}
				if(pes > 19 && pes < 50){
					pfinal=pfinal+50;
				}
				if(pes > 50 && pes < 80){
					pfinal=pfinal+80;
				}
				if(pes > 79){
					pfinal=pfinal+100;
				}
				else{
				}
			pfinal=pfinal+preubase;
			return this.preubase=pfinal;
		}
}