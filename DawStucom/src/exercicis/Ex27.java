package exercicis;
import java.io.*;
public class Ex27 {
	public static void main (String[] args) {
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int num = 0;
			int rnd = 0;
			int min = 1000;
			int max = 0;
			int acum = 0;

			while (num!=999) {
				System.out.println("digues un numero");
				String str1=teclado.readLine();
				num=Integer.parseInt(str1);

				if (num != 999){

					if (num > max){
						max = num;
					}
					if (num < min){
						min = num;
					}
					acum = acum+num;
					rnd++;
				}
			}

			System.out.println("rondes "+rnd+" acumulat "+acum);
			System.out.println("el numero major es "+(max));
			System.out.println("el numero menor es "+(min));
			System.out.println("la mitjana es "+(acum/rnd));
		}
		catch (Exception e){
			System.out.println("hi ha un error");
		}
	}
}