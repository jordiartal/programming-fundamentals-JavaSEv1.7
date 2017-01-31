package classes;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SeriesApp{
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			
			//amb el constructor 1 - per defecte
			Series series1 = new Series();
			
			System.out.println("titol: "+series1.getTitol());
			System.out.println("cuantitat de temporades: "+series1.getCuantitat());
			for(int i=0;i<series1.getCuantitat();i++){
				System.out.println("episodis temporada "+(i+1)+": "+series1.getTemporades()[i]);  //així s'obté la dada de l'array de la classe 
			}
			System.out.println("genere: "+series1.getGenere());
			System.out.println("creador: "+series1.getCreador());
			System.out.println("entregat: "+series1.getEntregat());
			
			//amb el constructor 2 - amb titol, creador
			Series series2 = new Series();
			
			System.out.println("digues el titol");
			String titol=teclado.readLine();
			series2.setTitol(titol);
			
			System.out.println("digues el creador");
			String creador=teclado.readLine();
			series2.setCreador(creador);
			
			System.out.println("titol: "+series2.getTitol());
			System.out.println("cuantitat de temporades: "+series2.getCuantitat());
			for(int i=0;i<series2.getCuantitat();i++){
				System.out.println("episodis temporada "+(i+1)+": "+series2.getTemporades()[i]);  //així s'obté la dada de l'array de la classe 
			}
			System.out.println("genere: "+series2.getGenere());
			System.out.println("creador: "+series2.getCreador());
			System.out.println("entregat: "+series2.getEntregat());
			
			//amb el constructor 3 - (titol,creador,cuantitat,temporades,genere,)
			Series series3 = new Series();
			
			System.out.println("digues el titol");
			String titol3=teclado.readLine();
			series3.setTitol(titol3);
			
			System.out.println("digues el creador");
			String creador3=teclado.readLine();
			series3.setCreador(creador3);
			
			System.out.println("digues el genere");
			String genere3=teclado.readLine();
			series3.setGenere(genere3);
			
			System.out.println("digues la cuantitat de temporades");
			int cuantitat3=Integer.parseInt(teclado.readLine());
			series3.setCuantitat(cuantitat3);
			int []temporades3 = new int[cuantitat3];
			
			for (int i=0;i < series3.getCuantitat();i++){
				System.out.println("digues la cuantitat de episodis de la temporada "+(i+1));
				temporades3[i]=Integer.parseInt(teclado.readLine());
			}
			series3.setTemporades(temporades3);
			
			System.out.println("titol: "+series3.getTitol());
			System.out.println("cuantitat de temporades: "+series3.getCuantitat());
			for(int i=0;i<series3.getCuantitat();i++){
				System.out.println("episodis temporada "+(i+1)+": "+series3.getTemporades()[i]);  //així s'obté la dada de l'array de la classe 
			}
			System.out.println("genere: "+series3.getGenere());
			System.out.println("creador: "+series3.getCreador());
			System.out.println("entregat: "+series3.getEntregat());
		}
		catch(Exception e){
			System.out.println("error en el main" + e);
		}
	}
}