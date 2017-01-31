package extras;
//Realizar un programa que obtenga el cambio óptimo (mínimo número de monedas posibles) 
//de un cantidad entera positiva en monedas de 50, 20, 10, 5, 2 y 1 céntimo de Euro.

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Extra10 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int mon=0;
			int c50=0;
			int c20=0;
			int c10=0;
			int c5=0;
			int c2=0;
			int c1=0;
			
			//demanem les dades
			System.out.println("inserta la cuantitat");
			String str=teclado.readLine();
			mon=Integer.parseInt(str);
			
			//calculem les dades, es divideix el nom entre 50, la divisió es guarda amb c50, y el resto es dividex entre 20
			//i així successivament...
			c50=mon/50;
			c20=(mon%50)/20;
			c10=(mon%20)/10;
			c5=(mon%10)/5;
			c2=(mon%5)/2;
			c1=mon-(c50*50+c20*20+c10*10+c5*5+c2*2);
			
			//mostrem el resultat
			System.out.println(c50+" bitllets de 50 cent");
			System.out.println(c20+" bitllets de 20 cent");
			System.out.println(c10+" bitllets de 10 cent");
			System.out.println(c5+" bitllets de 5 cent");
			System.out.println(c2+" monedes de 2 cent");
			System.out.println(c1+" monedes de 1 cent");
			
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}