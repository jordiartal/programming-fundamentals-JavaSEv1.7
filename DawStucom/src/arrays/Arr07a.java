package arrays;
import java.util.ArrayList;

public class Arr07a {
	public static void main (String[] args){
		try{
		ArrayList <Integer> proba2 = new ArrayList<Integer>();
		int suma =0; 
		
		for (int x=0; x<15; x++){
			proba2.add(x);
			System.out.print(" "+proba2.get(x));
		}
		
		System.out.println("");
		for (int x=0; x<3; x++){
			suma=proba2.get(x)+suma;
		}
		
		System.out.println(suma);
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}