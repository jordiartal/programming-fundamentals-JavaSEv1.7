package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex42 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int[]notes=new int[10];
			int nota=0;
			int alta=-1;
			int baixa=15;
			int mitja=0;
			int acum=0;
			int pos=0;
			
			//s'introdueixen les dades de l'array
			for(int i=0;i<10;i++){
				System.out.println("digues una nota per "+i+" vegades");
				String str1=teclado.readLine();
				nota=Integer.parseInt(str1);
				notes[i]=nota;
				acum=acum+notes[i];
				pos++;
				if (nota>alta){
					alta=notes[i];
				}
				if (notes[i]<baixa){
					baixa=notes[i];
				}
			}
			
			//mostra les dades de l'array
			for(int i=0;i<10;i++){
				System.out.println(notes[i]);
			}
			
			//treiem el nombre mig,alt,baix
			
			mitja=acum/pos;
			
			System.out.println("el nombre mig es "+mitja);
			System.out.println("el nombre més alt es "+alta);
			System.out.println("el nombre més baix es "+baixa);
		
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}