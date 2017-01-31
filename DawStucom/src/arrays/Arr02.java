package arrays;
import java.util.ArrayList;

public class Arr02 {
	public static void main (String[] args){
		try{
		ArrayList <Integer> proba2 = new ArrayList<Integer>();
		
		for (int x=0; x<15; x++){
			proba2.add(x);
			System.out.println(" "+proba2.get(x));
		}
		
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}