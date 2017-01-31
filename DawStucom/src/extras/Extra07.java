package extras;
//Programa que lee por teclado el valor del radio de una circunferencia y calcula y 
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Extra07 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			float rad=0;
			float cir=0;
			float sup=0;
			//demanem les dades
			System.out.println("inserta el radi");
			String str=teclado.readLine();
			rad=Integer.parseInt(str);

			//calculem les dades
			cir=(float)(rad*2*3.1416);
			sup=(float)(Math.pow(rad,2)*3.1416);

			//mostrem el resultat
			System.out.println("la longitud de la circumferencia es "+cir);
			System.out.println("l'area de la circumferencia es "+sup+" centrimetres cuadrats");

		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}