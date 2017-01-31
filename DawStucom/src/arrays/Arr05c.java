package arrays;
import java.util.ArrayList;

public class Arr05c {
	public static void main (String[] args){
		try{
		ArrayList<String> proba1 = new ArrayList<String>();
		
		for (int x=0; x<11; x++){
			proba1.add(Integer.toString(x));
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
		
		System.out.println();
		System.out.println("la posició tercera és:");
		System.out.println(proba1.get(3));
		
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}