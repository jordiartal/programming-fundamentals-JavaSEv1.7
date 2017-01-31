package repas;
//Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.

import java.io.*;
public class Rep05{
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			//per als positius
			double acupos=0;
			int rndpos=0;
			
			//per als negatius
			int rndneg=0;
			double acuneg=0;
			
			//per als cero
			int rnd0=0;
			
			int rnd=1;
			double num=0;

			while (rnd < 11){
				
				System.out.println("digues un numero");
				String str=teclado.readLine();
				num=Float.parseFloat(str);
				
				//per als positius
				if (num > 0){
					acupos=acupos+num;
					rndpos=rndpos+1;
					rnd=rnd+1;
				}
				//per als negatius
				if (num < 0){
					acuneg=acupos+num;
					rndneg=rndneg+1;
					rnd=rnd+1;
				}
				//per als 0
				if (num == 0){
					rnd0=rnd0+1;
					rnd=rnd+1;
				}
			}
			
			System.out.println("la mitja de nombres positius es "+acupos+" "+rndpos);
			System.out.println("la mitja de nombres negatius es "+acuneg+" "+rndneg);
			System.out.println("la cuantitat de ceros es "+rnd0);
		}	
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}