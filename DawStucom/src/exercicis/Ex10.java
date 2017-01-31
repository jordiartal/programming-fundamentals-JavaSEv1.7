package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex10 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int menu=0;
			System.out.println("digues una frase");
			String sfrase=teclado.readLine();
			int longi= sfrase.length();
			char[] frase=new char [longi];
			frase=sfrase.toCharArray();
						
			while (menu!=3){
				System.out.println();
				System.out.println("Marca l'opció que necesitis:");
				System.out.println("1.Mostrar array ordenat");
				System.out.println("2.Mostrar array tal cual");
				System.out.println("3.Sortida");
				
				String smenu=teclado.readLine();
				menu = Integer.parseInt(smenu);
				
				if(menu==1){
					Arrays.sort(frase);
					for(int i=0;i<longi;i++){
					System.out.println(frase[i]);
					}
					frase=sfrase.toCharArray();
				}
				
				if(menu==2){
					for(int i=0;i<longi;i++){
					System.out.print(frase[i]);
					}
					
				}
				if(menu>3){
					System.out.println("la opció es incorrecte, torna-hi");
					
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}

