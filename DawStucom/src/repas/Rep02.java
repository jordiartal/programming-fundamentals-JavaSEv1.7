package repas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Rep02{
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
						
			System.out.println("digues un primer numero");
			String str1=teclado.readLine();
			int num1=Integer.parseInt(str1);
			
			System.out.println("digues un segon numero");
			String str2=teclado.readLine();
			int num2=Integer.parseInt(str2);
			
			//mitjançant un ifelse genero el la condició que ajudarà a fer-ho posible
			if (num1%num2==0){
				System.out.println("els nombre "+num2+" SI és multiple de "+num1);
			}
			else {
				System.out.println("els nombre "+num2+" NO és multiple de "+num1);
			}
		}	
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}