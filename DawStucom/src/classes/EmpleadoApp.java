package classes;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class EmpleadoApp{
	public static void main (String [] args){
		try{

			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			Empleado empleado1 = new Empleado();

			System.out.println("digues el dni");
			String dni=teclado.readLine();
			System.out.println("digues el nom");
			String nombre=teclado.readLine();
			System.out.println("digues els cognoms");
			String apellidos=teclado.readLine();
			System.out.println("digues l'adreça");
			String domicilio=teclado.readLine();
			System.out.println("digues data de contracte");
			String fcontrat=teclado.readLine();
			System.out.println("digues sou");
			double sueldo=Double.parseDouble(teclado.readLine());
			
			empleado1.setDni(dni);
			empleado1.setNombre(nombre);
			empleado1.setApellidos(apellidos);
			empleado1.setDomicilio(domicilio);
			empleado1.setFcontrat(fcontrat);
			empleado1.setSueldo(sueldo);
			
			System.out.println(empleado1.getAtributos());
		}
		catch(Exception e){
			System.out.println("error en el main");
		}
	}
}