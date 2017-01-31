package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex34 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("digues una paraula");
			String text1=teclado.readLine();

			System.out.println("digues una altre paraula");
			String text2	=teclado.readLine();
			//per a comparar dos textos, sino son diferents (!frase1.equals(frase2))
			if (text1.equals(text2)){
				System.out.println("són iguals");
			}

			else {
				System.out.println("no són iguals");
			}

		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}