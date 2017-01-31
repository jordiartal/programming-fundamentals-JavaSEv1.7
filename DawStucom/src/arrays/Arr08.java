package arrays;
import java.util.ArrayList;
public class Arr08 {
	public static void main (String[] args){
		try{
		boolean cerca= false; 
			ArrayList <String> proba3 = new ArrayList<String>();
		
		proba3.add("avui");
		proba3.add("dema");
		proba3.add("dia");
		proba3.add("nit");
		proba3.add("mati");
		proba3.add("migdia");
		proba3.add("tarda");
		proba3.add("vespre");
		
		for (int x=0; x<8; x++){
			
			System.out.println(" "+proba3.get(x));
		}
		
		cerca=proba3.contains("hola");
		if (cerca==true){
			System.out.println("l'array conté la paraula "+"hola");
		}
		
		if (cerca==false){
			System.out.println("l'array NO conté la paraula "+"hola");
		}
		
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}