package herencia_series;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SerieApp {
	public static void main (String [] args){
		BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
		try{

			Serie s1 = new Serie();
			System.out.println(" Cuantas temps quieres que haya?" );
			s1.setTemp(Integer.parseInt (teclado.readLine()));
			
			int[] totalTemp = new int[s1.getTemp()];
			
			for(int i=0;i<s1.getTemp();i++){
				System.out.println(" Cuantos cap tiene la temp "+(i+1)+" ?" );
				totalTemp[i]=Integer.parseInt (teclado.readLine());
			}
			
			s1.setTemporadas(totalTemp);
			for(int i=0;i<s1.getTemp();i++){
				System.out.println("Temporada "+(i+1)+":"+totalTemp[i]+" Capitulos");
				
			}

		}
		catch (Exception e){
			System.out.println("error" +e);
		}
	}	
}
