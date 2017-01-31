package excepciones_notas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Notas {
	public static void main(String[] args) {
		ArrayList<Integer> notas=new ArrayList<Integer>();
		int nota=0, suma=0;
		do{
			try{
				nota=pedirNota();
				if(nota!=-1){
					notas.add(nota);
					suma+=nota;
				}
			}
			catch(NumberFormatException e){
				System.out.println("has introducido una letra");
			}
		}
		while(nota!=-1);
		System.out.println("la nota media és: "+(suma)/notas.size());
		for(int notilla:notas){
			System.out.println(notilla);
		}
	}
	private static int pedirNota() {
		int nota = 0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce nota:");
		try {
			nota=Integer.parseInt(br.readLine());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		/*catch (NumberFormatException e){
			System.out.println("has introducido una letra");
		}
		//este catch tiene que estar el último
		catch (Exception e){
			System.out.println("error general");
		}
		//es opcional, siempre se ejecutara vaya bien o vaya mal.
		finally{
			//en caso de conexión de red, se utiliza para cerrar conexión
		}*/
		return nota;
	}
}