package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex47 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int[]array1=new int[10];
			int[]array2=new int[10];
			int i=0;
			int j=0;
			int posicion=Integer.MAX_VALUE;
			int min=Integer.MAX_VALUE;

			//recollim els nombres
			for(i=0;i<10;i++){
				System.out.println("digues un numero");
				String str=teclado.readLine();
				int num=Integer.parseInt(str);
				array1[i]=num;
			}

			//es pasa a fer la distinció dels 2 arrays. Es declaren una "i" i una "j",
			//s'han de fer 2 arrays pk vana  dues velocitats,
			
			for (j=0;j<array2.length;j++){
				for (i=0;i<array1.length;i++){
					if(array1[i]<min){
						min=array1[i];
						posicion=i;
					}
				}
				array2[j]=min;
				array1[posicion]=Integer.MAX_VALUE;
				min=Integer.MAX_VALUE;
			}

			//mostrem el resultat
			for(i=0;i<array2.length;i++){
				System.out.print(array2[i]+",");
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}