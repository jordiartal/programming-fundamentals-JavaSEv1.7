package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex38 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("digues una frase en la que hi hagi a");
			String text=teclado.readLine();

			//cambiar a minuscules
			System.out.println(text.toLowerCase());

		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}