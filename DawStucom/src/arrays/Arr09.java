package arrays;
import java.util.ArrayList;
public class Arr09 {
	public static void main (String[] args){
		try{
		ArrayList <Integer> proba2 = new ArrayList<Integer>();
		boolean cerca = false;
		int index=0;
		for (int x=0; x<15; x++){
			proba2.add(x);
			System.out.print(" "+proba2.get(x));
		}
		System.out.println();
		cerca=proba2.contains(5);
		index=proba2.indexOf(5);
		if (cerca==true){
			System.out.println("l'array conté el num.5, está en la posició "+index);
		}
		if (cerca==false){
			System.out.println("l'array NO conté el num.5");
		}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}