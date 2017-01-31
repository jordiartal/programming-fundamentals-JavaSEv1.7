package extras;
//Programa Java que calcule el área de un triángulo en función de las 
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Extra09 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int a=0;
			int b=0;
			int c=0;
			int p=0;
			int area=0;
			
			//demanem les dades
			System.out.println("inserta la a");
			String str1=teclado.readLine();
			a=Integer.parseInt(str1);
			
			System.out.println("inserta la b");
			b=Integer.parseInt(str1);
			
			System.out.println("inserta la c");
			c=Integer.parseInt(str1);

			//calculem les dades
			p=(a+b+c)/2;
			area = (int) Math.sqrt((p*(p-a)*(p-b)*(p-c)));

			//mostrem el resultat
			System.out.println("l'area es "+area+"cm2");
			
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}