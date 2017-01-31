package arrays;
import java.util.ArrayList;
public class Arr04 {
	public static void main (String[] args){
		try{
			ArrayList<Integer> proba1 = new ArrayList<Integer>();
			System.out.println("primer array");
			for (int x=0; x<11; x++){
				proba1.add(x);
				System.out.print(" "+proba1.get(x));
			}
			ArrayList <Integer> proba2 = new ArrayList<Integer>();
			System.out.println();
			System.out.println("segon array");
			for (int x=0; x<15; x++){
				proba2.add(x);
				System.out.print(" "+proba2.get(x));
			}
			ArrayList <String> proba3 = new ArrayList<String>();
			proba3.add("avui");
			proba3.add("dema");
			proba3.add("dia");
			proba3.add("nit");
			proba3.add("mati");
			proba3.add("migdia");
			proba3.add("tarda");
			proba3.add("vespre");
			System.out.println();
			System.out.println("tercer array");
			for (int x=0; x<8; x++){
				System.out.print(" "+proba3.get(x));
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}