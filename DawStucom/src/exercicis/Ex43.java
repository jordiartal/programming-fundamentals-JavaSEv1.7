package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex43 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int[]numeros=new int[15];
			int num=0;
			int acum=0;
			

			//s'introdueixen les dades de l'array
			for(int i=0;i<15;i++){
				System.out.println("digues un nombre per "+i+" vegades");
				String str1=teclado.readLine();
				num=Integer.parseInt(str1);
				numeros[i]=num;
				acum=acum+numeros[i];
				
			}

			//treiem el acumulat
			System.out.println("el acumulat total es "+acum);

		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}