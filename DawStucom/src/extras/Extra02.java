package extras;
//Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Extra02 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int numsou=0;
			int i=0;
			int max=0;
						
			//Preguntem el numero de sous
			System.out.println("inserta el numero de sous");
			String str=teclado.readLine();
			numsou=Integer.parseInt(str);
			
			//declarem l'array de sous amb la llargada de numnot
			int[]sous=new int[numsou];
			
			//introduim els sous "numnot" vegades
			for(i=0;i<sous.length;i++){
				System.out.println("inserta el sou "+"("+i+")");
				String str1=teclado.readLine();
				sous[i]=Integer.parseInt(str1);
				if(sous[i]>max){
					max=sous[i];
				}
			}
			
			//mostrem el resultat
			System.out.println("el sou màxim és "+max);
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}