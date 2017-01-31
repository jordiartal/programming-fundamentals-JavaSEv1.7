package exercicis;
import java.io.BufferedReader;
import java.util.Arrays;
import java.io.InputStreamReader;
public class Ex47b {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			
			int[]array1=new int[10];
			int[]array2=new int[10];

			//recollim els nombres
			for(int i=0;i<10;i++){
				System.out.println("digues un nombre per "+i+" vegades");
				String str1=teclado.readLine();
				int num1=Integer.parseInt(str1);
				array1[i]=num1;
			}

			//endreçem l'array amb l'ordre "sort" i inserció de dades en el array2 com demana l'enunciat
			Arrays.sort(array1);
			
			for(int j=0;j<10;j++){
				array2[j]=array1[j];				
			}
			
			for(int k=0;k<10;k++){
			System.out.println(array2[k]);
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}