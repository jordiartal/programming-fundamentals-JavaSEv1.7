package exercicis;
import java.io.*;
public class Ex28 {
	public static void main (String[] args) {
		try {
			int x = (int) (100*Math.random()+1);
			int num = 0;

			while (num != x){
				BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("digues un numero del 1 al "+x);
				String str=teclado.readLine();
				num=Integer.parseInt(str);

				if (num == x){
					System.out.println("felicitats l'has encertat!");
				}
				if (num > x){
					System.out.println("el nombre es més gran");
				}
				if (num < x){
					System.out.println("el nombre es més petit");
				}
			}
		}
		catch (Exception e){
			System.out.println("hi ha un error");
		}
	}
}