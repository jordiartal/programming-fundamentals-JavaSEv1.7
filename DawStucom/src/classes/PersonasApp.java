package classes;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class PersonasApp{
	public static void main (String [] args){
		try{

			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			Personas personas1 = new Personas();

			System.out.println("digues el dni");
			String dni=teclado.readLine();
			System.out.println("digues el nombre");
			String nombre=teclado.readLine();
			System.out.println("digues els apellidos");
			String apellidos=teclado.readLine();
			System.out.println("digues el domicilio");
			String domicilio=teclado.readLine();
						
			personas1.setDni(dni);
			personas1.setNombre(nombre);
			personas1.setApellidos(apellidos);
			personas1.setDomicilio(domicilio);
			
			System.out.println(personas1.getAtribut());
		}
		catch(Exception e){
			System.out.println("error en el main");
		}
	}
}