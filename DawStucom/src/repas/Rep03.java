package repas;
//Pedir dos fechas y mostrar el número de días que hay de diferencia entre ellas. --->>>>>>>>>> PREGUNTAR

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Rep03{
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
						
			System.out.println("digues una data");
			String str1=teclado.readLine();
			int num1=Integer.parseInt(str1);
			
			System.out.println("digues una altre data");
			String str2=teclado.readLine();
			int num2=Integer.parseInt(str2);
			
			
		}	
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}