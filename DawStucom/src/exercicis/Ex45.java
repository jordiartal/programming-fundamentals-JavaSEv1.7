package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex45 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int j=0;
			int k=0;
			int conta=0;
			int digi=0;
			int[]posit=new int[10];
			
			//recollim els nombres
			for(int i=0;i<10;i++){
				System.out.println("digues un nombre per "+i+" vegades");
				String str1=teclado.readLine();
				int num=Integer.parseInt(str1);
				if (num != 0){
					posit[digi]=num;
					digi=digi+1;
				}			
			}

			//contar les variacions de simbol
			k=j+1;
			while(k<10){
									
				//els dos casos que es poden donar 
				if(posit[j]>0 && posit[k]<0){
					conta=conta+1;
				}
				if(posit[j]<0 && posit[k]>0){
					conta=conta+1;
				}
				j++;
				k++;
			}
			System.out.println("hi ha hagut "+conta+" canvis de signe");
			
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}