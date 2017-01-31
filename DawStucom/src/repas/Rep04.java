package repas;
//Pedir números hasta que se introduzca uno negativo, y calcular la media.

import java.io.*;
public class Rep04{
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int acum=0;
			int rnd=0;
			int num=0;

			while (num >= 0){
				
				System.out.println("digues un numero");
				String str=teclado.readLine();
				num=Integer.parseInt(str);
				
				acum=acum+num;
				rnd=rnd+1;
			}
			
			System.out.println("la mitja de nombres introduïts es "+((acum-num)/(rnd-1)));
		}	
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}