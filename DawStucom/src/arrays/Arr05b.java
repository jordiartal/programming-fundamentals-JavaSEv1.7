package arrays;
import java.util.ArrayList;

public class Arr05b {
	public static void main (String[] args){
		try{
		ArrayList<String> proba1 = new ArrayList<String>();
		
		for (int x=0; x<11; x++){
			proba1.add("x");
			System.out.print(" "+proba1.get(x));
		}
		
		proba1.remove(0);
		System.out.println();
		
		for (int x=0; x<proba1.size(); x++){
			
			System.out.print(" "+proba1.get(x));
		}
		
		System.out.println();
		proba1.add(0,"ok");
	
		for (int x=0; x<proba1.size(); x++){
			
			System.out.print(" "+proba1.get(x));
		}
		
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}