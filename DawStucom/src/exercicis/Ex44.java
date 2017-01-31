package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex44 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int i=0;
			int j=0;
			int longitud=0;
			
			
			//recollim la paraula per teclat 
			System.out.println("digues un nom");
			String paraula=teclado.readLine();
							
			//extreure les posicions amb la funci� to-char-array y longitud de l'array 
			char[] texte = paraula.toCharArray();
			longitud=paraula.length();
			j=longitud-1;
			
			//es mira si �s un pal�ndrom
			while((texte[i]==texte[j]) && (i<j)){
				i++;
				j--;
			}
			if(i>=j){
				System.out.println("�s un palindrom");
			}
			else{
				System.out.println("no �s un palindrom");
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}