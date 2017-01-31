package classes;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class zombieApp {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<zombie> miEjercito = new ArrayList<zombie>(); 
		String nombre;
		int [] cerebros;		
		
		for(int i=0;i<2;i++){
			cerebros= new int [3];
			System.out.println("introdueix nom del zombi");
			nombre=br.readLine();
		
			for(int j=0; j<cerebros.length;j++) {
				System.out.println("introduce cerebros comidos de clase "+j);
				cerebros[j]=Integer.parseInt(br.readLine());
			}
			zombie z = new zombie (nombre, cerebros);
			miEjercito.add(z);
		}
		for(zombie z: miEjercito){
			System.out.println(z.toString());
		}
		miEjercito.get(0).setVida(10);
		System.out.println(miEjercito.get(1).getVida());
	}
}
