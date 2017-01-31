package arrays;
import java.util.ArrayList;
public class Arr06 {
	public static void main (String[] args){
		try{
			ArrayList<Integer> proba1 = new ArrayList<Integer>();
			System.out.println("array 1");
			for (int x=0; x<11; x++){
				proba1.add(x);
				System.out.print(" "+proba1.get(x));
			}
			ArrayList <Integer> proba2 = new ArrayList<Integer>();
			System.out.println();
			System.out.println("array 2");
			for (int x=0; x<15; x++){
				proba2.add(x);
				System.out.print(" "+proba2.get(x));
			}
			System.out.println();
			System.out.println("array 3");
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
				System.out.print(" "+proba3.get(x));
			}
			System.out.println();
			System.out.println("la mida dels tres arrays en una sentència:");
			System.out.print(proba1.size()+" "+proba2.size()+" "+proba3.size());
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}