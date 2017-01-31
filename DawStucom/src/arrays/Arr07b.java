package arrays;
import java.util.ArrayList;

public class Arr07b {
	public static void main (String[] args){
		try{
		ArrayList <Integer> proba2 = new ArrayList<Integer>();
		
		
		System.out.print("posicions");
		System.out.print(" 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14");
		System.out.println("");
		
		System.out.print("dades    ");
		for (int x=0; x<15; x++){
			proba2.add(x);
			System.out.print(" "+proba2.get(x));
		}
		
		System.out.println("");
		System.out.print("pos nova----------------");
		
		
		
		System.out.println("");
		proba2.add(2000);
		
		System.out.println("l'element nou está en la posició "+proba2.indexOf(2000));
		System.out.print("dades    ");
		for (int x=0; x<proba2.size(); x++){
			System.out.print(" "+proba2.get(x));
		}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}