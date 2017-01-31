package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex46 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int total=0;
			int[]array1=new int[10];
			int[]array2=new int[10];
			
			//recollim els nombres
			for(int i=0;i<10;i++){
				System.out.println("digues un nombre per "+i+" vegades");
				String str1=teclado.readLine();
				int num1=Integer.parseInt(str1);
				array1[i]=num1;
				
				System.out.println("digues un nombre per "+i+" vegades");
				String str2=teclado.readLine();
				int num2=Integer.parseInt(str2);
				array2[i]=num2;
				}

			//realitzem la suma entre els arrays
			for(int k=0;k<10;k++){
			total=array1[k]+array2[k];
			System.out.println("la suma dels dos arrays en la posició "+k+" és "+total);
			total=0;
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}