package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex30 {
	public static void main (String[] args) {
		try {
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("digues un nombre");
			String str=teclado.readLine();
			int num=Integer.parseInt(str);
			int div=num-1;

			while (num%div!=0 && div!=0) {
				div--;
			}
			if(div==1){
				System.out.println("el nombre ES primer;");
			}
			if(div!=1){
				System.out.println("el nombre NO es primer");
			}
		}
		catch (Exception e){
			System.out.println("hi ha un error");
		}
	}
}