package hashmap_agenda;
import java.util.HashMap;
import java.util.Iterator;

public class Principal {

	public Principal() {
	}

	public static void main(String[] args) {
		HashMap <Integer,Contacto> misContactos = new HashMap <Integer,Contacto>();
		
		Contacto c1  = new Contacto("dani","12345678","calle");
		Contacto c2  = new Contacto("Sergi","98798798","avenida");
		Contacto c3  = new Contacto("Llucia","0000000","Samboy");
		
		misContactos.put(c1.hashCode(),c1);
		misContactos.put(c2.hashCode(),c2);
		misContactos.put(c3.hashCode(),c3);
		
		Iterator it = misContactos.keySet().iterator(); 
		 while(it.hasNext()){ 
		 String key = (String) it.next(); 
		System.out.println("Clave: " + key + " -> Valor: " + misContactos.get(key));} 
	}
}