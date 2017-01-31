package classes;
public class ElectroApp{
	public static void main (String[] args){
		try{
			//constructor per defecte
			Electro electro1 = new Electro();
			System.out.println(electro1.getPreubase()+" "+electro1.getColor()+" "+electro1.getConsener()+" "+electro1.getPes()); 
			
			//constructor amb preu i pes		
			Electro electro2 = new Electro("NEGRO","D");
			System.out.println(electro2.getPreubase()+" "+electro2.getColor()+" "+electro2.getConsener()+" "+electro2.getPes());
			
			//constructor sense res
			Electro electro3 = new Electro(10.2,"azul","A",25.5);
			System.out.println(electro3.getPreubase()+" "+electro3.getColor()+" "+electro3.getConsener()+" "+electro3.getPes());
		}
		catch(Exception e){
			System.out.println("error al main" + e);
		}
	}
}