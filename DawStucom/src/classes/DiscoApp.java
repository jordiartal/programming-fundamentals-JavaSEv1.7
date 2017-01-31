package classes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DiscoApp{
	static BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main (String[] args) throws Exception {
		ArrayList<Disco> coleccion = new ArrayList<Disco>();
		int opcion;
		do{
			opcion=menu();
			switch(opcion){
				case 1:
					nuevoDisco(coleccion);
					break;
				case 2:
					modificarDisco();
					break;
				case 3:
					borrarDisco();
					break;
				case 4:
					mostrarDisco(coleccion);
					break;
				default:
					System.out.println("opcio incorrecte");
			}
		}while(opcion!=5);
	}

	private static void borrarDisco() {
		
		
	}

	private static void modificarDisco() throws Exception {
		//listarDiscos(coleccion);
		System.out.println("Selecciona disco:");
		int opcion =   Integer.parseInt(teclado.readLine());
	}

	private static void mostrarDisco(ArrayList<Disco> coleccion) throws Exception {
		int opcion;
		do{
			listarDiscos(coleccion);
			System.out.println("Selecciona disco:");
			opcion =   Integer.parseInt(teclado.readLine());
			if(opcion > coleccion.size() || opcion <= 0){
				System.out.println("codigo incorrecto");
			}
		}while(opcion >= coleccion.size() || opcion <= 0);
		
		Disco d = coleccion.get(opcion-1);
		System.out.println("Titulo "+ d.getTitol());
		System.out.println("grupos "+ d.getGrupos());
		System.out.println("num_temes "+ d.getNum_temes());
		System.out.println("duracio "+ d.getDuracio());
	}

	
	private static void nuevoDisco(ArrayList<Disco> coleccion) throws Exception {
		System.out.println("introduce el titulo del disco");
		String titulo = teclado.readLine();
		
		System.out.println("escribe nombre de grupo");
		String grupo = teclado.readLine();
		
		System.out.println("escribe numero de temes");
		int temas = Integer.parseInt(teclado.readLine());
		
		System.out.println("duracion");
		double duracion = Double.parseDouble(teclado.readLine());
		
		Disco d = new Disco(titulo, grupo, temas, duracion);
		
		coleccion.add(d);
	}

	private static void listarDiscos(ArrayList<Disco> coleccion){
		int i=1;
		for (Disco d: coleccion){
			System.out.println(i +" "+ d.getTitol());
			i++;
		}
	}
	
	private static int menu() throws Exception {
		
		System.out.println("menu principal");
		System.out.println("1. Añadir disco a colección");
		System.out.println("2. Modificar disco");
		System.out.println("3. Eliminar disco");
		System.out.println("4. Mostrar disco");
		System.out.println("5. Salir");
		System.out.println("Escull l'opció:");
		
		int opcion = Integer.parseInt(teclado.readLine());
		return opcion;
	
	}
	
}