package exercicis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex36 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("digues una frase");
			String text=teclado.readLine();
			//per a comptar el numero de caracters de una cadena 
			System.out.println("la frase té..."+(text.length())+" caracters");
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}