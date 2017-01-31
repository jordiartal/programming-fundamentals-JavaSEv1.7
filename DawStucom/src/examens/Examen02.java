package examens;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Examen02 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("1.Añadir registro");
			System.out.println("2.Editar registro");
			System.out.println("3.Borrar registro");
			System.out.println("4.Buscar por numero de registro");
			System.out.println("5.Mostrar Agenda");
			System.out.println("6.Salir");
			
			//segons la opcio triada s'executa una opció de l'switch
			//switch

			//opcio 1 s'afegeix un registre y es verifica que no hi és
			//opcio 2 
			//opcio 3
			//opcio 4
			//opcio 5
			//opcio 6 sortir 
			
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}