package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex37 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("digues una frase en la que hi hagi a");
			String text=teclado.readLine();
			//cambiar un caracter o cadena per una altre
			text=text.replace("a","e");
			System.out.println(text);

		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}