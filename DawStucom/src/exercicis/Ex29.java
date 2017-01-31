package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex29 {
	public static void main (String[] args) {
		try {
			int x = (int) (100*Math.random()+1);
			int num = 0;
			int conta = 0;
			while (num != x && conta != 10){
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
				conta++;
			}
			if (num == x){
				System.out.println("has guanyat en "+conta+" rondes");
			}
			if (num != x){
				System.out.println("el resultat del joc es que has perdut i la solucio es "+x+" en "+conta+" rondes");
			}
		}
		catch (Exception e){
			System.out.println("hi ha un error");
		}
	}
}