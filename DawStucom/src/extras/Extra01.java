package extras;
//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Extra01 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int[]notes=new int[6];
			int i=0;
			int sus=0;
			int con=0;
			int apr=0;
			
			//insertem les dades
			for(i=0;i<6;i++){
			System.out.println("inserta la nota");
			String str=teclado.readLine();
			notes[i]=Integer.parseInt(str);
			}
			
			//fem l'anàlisi de les dades
			for(i=0;i<6;i++){
				if(notes[i]<4){
					sus++;
				}
				if(notes[i]>4){
					apr++;
				}
				if(notes[i]==4){
					con++;
				}
			}
			
			//mostrem els resultats
			System.out.println("hi ha "+sus+" suspesos");
			System.out.println("hi ha "+con+" condicionats");
			System.out.println("hi ha "+apr+" aprovats");
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}