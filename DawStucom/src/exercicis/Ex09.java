package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex09 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int menu=0;
						
			while (menu!=3){
				System.out.println();
				System.out.println("Marca l'opció que necesitis:");
				System.out.println("1.Mostrar el nombre enter més gran que pot implementar Java");
				System.out.println("2.Mostrar el nombre enter més petit que pot implementar Java");
				System.out.println("3.Sortida");
				System.out.println();
				String smenu=teclado.readLine();
				menu = Integer.parseInt(smenu);
				if(menu==1){
					System.out.println(Integer.MAX_VALUE);
					System.out.println();
				}
				if(menu==2){
					System.out.println(Integer.MIN_VALUE);
					System.out.println();
				}
				if(menu>3){
					System.out.println("la opció es incorrecte, torna-hi");
					System.out.println();
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}
