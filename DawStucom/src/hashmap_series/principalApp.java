package hashmap_series;
import java.util.*;
import java.util.Map.Entry;
public class principalApp{
	public static void main(String[] args){
		Serie s1 = new Serie("juego de tronos","fantasia",2011);
		Serie s2 = new Serie("breaking bad","drama",2008);
		Serie s3 = new Serie("bill cosby","comedia",1975);
		Serie s4 = new Serie("fraggle rock","terror",1987);
		//HashMap <String,Serie> misSeries = new HashMap <String,Serie> ();
		//Hash Map ----------------------------------------------- es crea el hashmap
		/*
		misSeries.put(s1.getTitulo(), s1);
		misSeries.put(s2.getTitulo(), s2);
		misSeries.put(s3.getTitulo(), s3);
		misSeries.put(s4.getTitulo(), s4);
		for(java.util.Map.Entry<String, Serie> e: misSeries.entrySet()){
			System.out.println(e.getValue().toString());
		}
		//ordenar keys del hashmap
		Set<String> keys = misSeries.keySet();
		//la lista es como el map, que tiene varias implementaciones
		List <String> listaKeys=new ArrayList<String>();
		Collections.sort(listaKeys);
		for(String s: listaKeys){
			System.out.println(s);
		}
		//ordenar valores del hashmap
		Collection valores = misSeries.values();
		List<Serie> ListaValores = new ArrayList<Serie>(valores);
		Collections.sort(ListaValores);
		for(Serie s: ListaValores){
			System.out.println(s);
		}*/
		//creamos el TREE-MAP que es un hashmap pero ordenado--------------------------------------------------
		//-----------------------------------------------------------------------------------------------------
		TreeMap <Serie,String> misSeries2 = new TreeMap<Serie,String>();
		misSeries2.put(s1, "no vista");
		misSeries2.put(s2, "no vista");
		misSeries2.put(s3, "no vista");
		misSeries2.put(s4, "no vista");
		for(Entry<Serie, String> e: misSeries2.entrySet()){
			System.out.println(e.getValue().toString());
		}
	}
}