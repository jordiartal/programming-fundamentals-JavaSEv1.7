package extras;
//Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Extra03 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int num=0;
			int i=0;
			boolean neg=false;
			
			//
			for(i=0;i<10;i++){
				System.out.println("inserta un nombre");
				String str1=teclado.readLine();
				num=Integer.parseInt(str1);
				if(num<0){
					neg=true;
				}
			}
			
			//mostrem el resultat
			if(neg==true){
				System.out.println("SI hi ha negatius");	
			}
			if(neg==false){
				System.out.println("NO hi ha negatius");
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}