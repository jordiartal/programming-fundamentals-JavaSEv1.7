package arrays;
import java.util.ArrayList;

public class Arr03 {
	public static void main (String[] args){
		try{
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
		
		
		
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}