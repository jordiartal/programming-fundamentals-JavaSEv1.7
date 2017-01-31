package extras;
//Pedir 5 números e indicar si alguno es múltiplo de 3.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Extra05 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int num=0;
			int i=0;
			boolean mul=false;
			
			//
			for(i=0;i<5;i++){
				System.out.println("inserta una nombre");
				String str1=teclado.readLine();
				num=Integer.parseInt(str1);
				if(num%3==0){
					mul=true;
				}
			}
			
			//mostrem el resultat
			if(mul==true){
				System.out.println("SI hi ha multiples");	
			}
			if(mul==false){
				System.out.println("NO hi ha multiples");
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}