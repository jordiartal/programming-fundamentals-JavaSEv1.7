package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex35 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("digues una frase");
			String text1=teclado.readLine();

			System.out.println("digues una altre frase");
			String text2	=teclado.readLine();
			//concatenar dos cadenes mitjançant concat
			
			String acum = text1.concat(" "+text2);
			System.out.println(acum);
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}