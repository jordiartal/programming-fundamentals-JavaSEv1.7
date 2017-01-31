package arrays;
import java.util.ArrayList;

public class Arr10 {
	public static void main (String[] args){
		try{
		ArrayList<Integer> proba1 = new ArrayList<Integer>();
		
		for (int x=0; x<11; x++){
			proba1.add(x);
			System.out.print(" "+proba1.get(x));
		}

		System.out.println();
		System.out.println("Ara s'esborra l'array");
		proba1.clear();
				
		for (int x=0; x<proba1.size(); x++){
			System.out.println(" "+proba1.get(x));
		}
		
		System.out.println("l'array ara té "+proba1.size()+" elements");
		
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}