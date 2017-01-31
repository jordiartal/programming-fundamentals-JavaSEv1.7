package arrays;
import java.util.ArrayList;

public class Arr01 {
	public static void main (String[] args){
		try{
		ArrayList<Integer> proba1 = new ArrayList<Integer>();
		
		for (int x=0; x<11; x++){
			proba1.add(x);
			System.out.println(" "+proba1.get(x));
		}
		
		
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}