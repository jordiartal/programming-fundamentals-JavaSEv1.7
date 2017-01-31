package extras;
//Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Extra04 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int num=0;
			int i=0;
			boolean sus=false;
			
			//
			for(i=0;i<5;i++){
				System.out.println("inserta una nombre");
				String str1=teclado.readLine();
				num=Integer.parseInt(str1);
				if(num<5){
					sus=true;
				}
			}
			
			//mostrem el resultat
			if(sus==true){
				System.out.println("SI hi ha suspesos");	
			}
			if(sus==false){
				System.out.println("NO hi ha suspesos");
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}