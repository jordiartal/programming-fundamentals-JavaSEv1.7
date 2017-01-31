package extras;
//Realizar un programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Extra06 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int cen=0;
			int far=0;
					
			//Demanem les dades
			System.out.println("inserta una nombre");
			String str1=teclado.readLine();
			cen=Integer.parseInt(str1);
			
			//calculem les dades
			far=(cen*9/5)+32;
						
			//mostrem el resultat
			System.out.println("la temperatura és "+far+"º farenheit");
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}