package arrays;
import java.util.ArrayList;

public class Arr05a {
	public static void main (String[] args){
		try{
		ArrayList<Integer> proba1 = new ArrayList<Integer>();
		
		for (int x=0; x<11; x++){
			proba1.add(x);
			System.out.print(" "+proba1.get(x));
		}
		
		proba1.remove(0);
		System.out.println();
		
	
		for (int x=0; x<proba1.size(); x++){
			
			System.out.print(" "+proba1.get(x));
		}
		
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}