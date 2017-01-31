package extras;
//Programa Java que calcule el área de un triángulo en función de las 
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Extra11 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int num=0;
			int i=1;
						
			//calculem les dades
			while(i!=0){
				System.out.println("inserta el nombre, amb 0 surts");
				String str1=teclado.readLine();
				num=Integer.parseInt(str1);	
				if(num>0){
					System.out.println("el nombre es > 0");
				i++;
				}
				if(num<0){
					System.out.println("el nombre es < 0");
				i++;
				}
				if(num==0){
					i=0;
				}
			}
			
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}