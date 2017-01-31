package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex41 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int[]notes=new int[10];
			int nota=0;
			
			for(int i=0;i<10;i++){
				System.out.println("digues una nota per "+i+" vegades");
				String str1=teclado.readLine();
				nota=Integer.parseInt(str1);
				notes[i]=nota;
			}
			for(int i=0;i<10;i++){
				System.out.println(notes[i]);
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}