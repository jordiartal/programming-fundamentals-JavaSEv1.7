package repas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Rep01{
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int num = 1;
			
			//mitjançant un while amb if es genera el bucle
			while (num != 0){
				System.out.println("digues un numero, polsa 0 per a sortir");
				String str=teclado.readLine();
				num=Integer.parseInt(str);
				if (num < 0){
					System.out.println("el nombre es negatiu");
				}
				if (num > 0){
					System.out.println("el nombre es positiu");
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}