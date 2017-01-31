package classes;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class AlumnoApp{
public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			Alumno alumne1 = new Alumno();
			Alumno alumne2 = new Alumno("1234567","Probes",20,9.5);
			System.out.println("Digues el DNI");
			String dni=teclado.readLine();
			alumne1.setDni(dni);
			System.out.println("Digues el NOM");
			String nombre=teclado.readLine();
			alumne1.setNombre(nombre);
			System.out.println("Digues la EDAT");
			String edad=teclado.readLine();
			alumne1.setEdad(Integer.parseInt(edad));
			System.out.println("Digues la NOTA");
			String snota=teclado.readLine();
			alumne1.setNota(Double.parseDouble(snota));

			System.out.println("per a l'alumne 1");
			System.out.println("el dni: "+alumne1.getDni());
			System.out.println("el nom: "+alumne1.getNombre());
			System.out.println("el edat: "+alumne1.getEdad());
			System.out.println("el nota: "+alumne1.getNota());
			
			System.out.println();
			
			System.out.println("per a l'alumne 2");
			System.out.println("el dni: "+alumne2.getDni());
			System.out.println("el nom: "+alumne2.getNombre());
			System.out.println("el edat: "+alumne2.getEdad());
			System.out.println("el nota: "+alumne2.getNota());
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}