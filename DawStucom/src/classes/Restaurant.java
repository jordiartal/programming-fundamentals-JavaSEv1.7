package classes;

public class Restaurant {

//exercise 1
	
	//atributs
		private String name;
		private double calories;
		private int eta;
		private double pperson;
		private double winebot;
		
	//constructors
		public Restaurant(String name, double calories, int eta, double pperson, double winebot){
		this.setName(name);
		this.setCalories(calories);
		this.setEta(eta);
		this.setPperson(pperson);
		this.setWinebot(winebot);
		}
		
	//setters
		public void setName(String name){
			this.name=name;
		}
		public void setCalories(double calories){
			this.calories=calories;
		}
		public void setEta(int eta){
			this.eta=eta;
		}
		public void setPperson(double pperson){
			this.pperson=pperson;
		}
		public void setWinebot(double winebot){
			this.winebot=winebot;
		}
	
	//getters
		public String getName(){
	        return this.name;
	    }
		public double getCalories(){
	        return this.calories;
	    }
		public int getEta(){
	        return this.eta;
	    }
		public double getPperson(){
	        return this.pperson;
	    }
		public double getWinebot(){
	        return this.winebot;
	    }
		
	//metodes
		
		//exercise 2
		public String getAtributes(Restaurant [] Restaurant){
			String data = "Menu "+getName()+" contains "+getCalories()+" calories, comes with "+getWinebot()+" bottles and cost "+getPperson()+" € per person"; 
			return data;
		}
}
