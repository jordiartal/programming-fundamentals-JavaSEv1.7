package extras;
//Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado. 
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Extra08 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int kmh=0;
			int ms=0;
			
			//demanem les dades
			System.out.println("inserta la velocitat en km/h");
			String str=teclado.readLine();
			kmh=Integer.parseInt(str);

			//calculem les dades
			ms=kmh*10/36;

			//mostrem el resultat
			System.out.println("la velocitat son "+ms+" metres segon");
			
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}