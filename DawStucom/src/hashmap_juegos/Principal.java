package hashmap_juegos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class Principal {

	public static void main(String[] args) throws Exception {
		//hashmap es mas rapido para hacer consultas, guarda el indice y el objeto
		//no se puede poner int, double, etc, hay que poner la clave
		HashMap <Integer,Juego> misJuegos = new HashMap <Integer,Juego>(); 

		
		//així S'INSERTA la dada
		JuegoMesa j = new JuegoMesa (1111, "Monopoly", 49.99, 6, "tablero");
		VideoJuego k = new VideoJuego (2222, "Santaman", 100, false, "genero tonto");
		
		misJuegos.put(j.hashCode(),j);
		misJuegos.put(k.hashCode(),k);
		
		//ara agafem una mateixa hashcode y li canviem les dades, llavors ACTUALITZA la dada
		JuegoMesa j2 = new JuegoMesa (1111, "Monopoly", 49.99, 8, "tablero y cartas");
		misJuegos.put(j2.hashCode(),j2);
		
		System.out.println("tienes "+ misJuegos.size() + " juegos");
		
		//és un iterador, serveix per a recorrer els hashmaps de forma secuencial,
		//keyset devuelve una colección con todas las llaves.
		Iterator it = misJuegos.keySet().iterator(); 
		
		
		//així RECORRE EL HASHMAP
		//amb l'iterador no es pot fer FOR, es fa amb la funcio HASNEXT, iterador comença inicialitzar amb la posició 0, 
		//se li ha de posar la següent posició
		while(it.hasNext()){ 
			Integer key = (Integer) it.next();   //això fa que es coloqui a la següent posició, s'ha de fer amb .next()
			System.out.println("clave: "+ key+ " valor: "+ misJuegos.get(key));
		}
		
		//així RECORRE EL HASHMAP
		//entry: tipo de dato, estructura que permite almacenar dos datos en una sola variable
		//a e le guardamos 
		for(Entry<Integer,Juego> e:misJuegos.entrySet()){
			System.out.println("clave: "+e.getKey()+" valor: "+e.getValue());
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("digues el nom del joc:");
		String nom = br.readLine();
		//System.out.println(misJuegos.containsValue(nom));
		for(Entry<Integer,Juego> e:misJuegos.entrySet()){
			int key = e.getKey();
			
			if (misJuegos.get(key).getNombre().equals(nom)){
				System.out.println("el juego existe ");
			}
		}
	
	}

}
