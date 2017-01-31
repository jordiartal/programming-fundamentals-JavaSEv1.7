package abstract_empleados;
import java.io.*;
import java.util.*;
public class empleadosApp {
	//declarem les variables
	//----------------------------------------------------------------------------------------//
	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	static int menu, tipus, bucle, sou_base, edat;
	static String nom, dada, estu;
	//un do-while+switch que carrega les opcions de menu
	//----------------------------------------------------------------------------------------//		
	public static void main(String[] args) throws Exception{
		ArrayList <empleados> treballador= new ArrayList <empleados>();
		do{
			menu = menu();
			switch(menu){
			case 1:
				nouTreballador(treballador);
				break;
			case 2:
				visuTreballador(treballador);
				break;
			case 3:
				bestAdmin(treballador);
				break;
			case 4:
				bestMaqui(treballador);
				break;
			case 0:
				break;
			default:
				System.out.println("Opció incorrecta");
			}
		}
		while(menu!=0);
	}
	//amb l'interface Comparable
	//----------------------------------------------------------------------------------------//
	private static void bestMaqui(ArrayList<empleados> treballador) {
		ArrayList <maquinista> maquinista = new ArrayList<maquinista>();
		for(int i=0;i<treballador.size();i++){
			if(treballador.get(i) instanceof maquinista){
				maquinista.add((maquinista) treballador.get(i));
			}
		}
		Collections.sort(maquinista);
		for(int i=0;i<maquinista.size();i++){
			System.out.print("nom:"+(maquinista.get(i).nombre)+",");
			System.out.println("anys:"+(maquinista.get(i).maq_anyos));
			System.out.println("-----------------------------------");
		}
	}
	//amb l'interface Comparable
	//----------------------------------------------------------------------------------------//
	private static void bestAdmin(ArrayList<empleados> treballador) {
		ArrayList <administrativo> administraordre = new ArrayList<administrativo>();
		for(int i=0;i<treballador.size();i++){
			if(treballador.get(i) instanceof administrativo){
				administraordre.add((administrativo) treballador.get(i));
			}
		}
		Collections.sort(administraordre);
		for(int i=0;i<administraordre.size();i++){
			System.out.print("nom:"+(administraordre.get(i).nombre)+",");
			System.out.println("estudis:"+(administraordre.get(i).estudios.size()));
			System.out.println("-----------------------------------");
		}
	}
	//es visualitza el registre de l'array corresponent amb visualizarTodosDatos()
	//----------------------------------------------------------------------------------------//
	private static void visuTreballador(ArrayList<empleados> treballador) throws Exception {
		System.out.println("digues quin treballador vols veure, [0-"+(treballador.size()-1)+"]");
		int choice=Integer.parseInt(br.readLine());
		System.out.println(treballador.get(choice).visualizarTodosDatos());
		System.out.println("-----------------------------------");
	}
	//s'inserta un nou objecte a l'arraylist
	//----------------------------------------------------------------------------------------//
	private static void nouTreballador(ArrayList<empleados> treballador) throws Exception {
		System.out.println("quin tipus de treballador és:");
		System.out.println("[1] - Administratiu");
		System.out.println("[2] - Maquinista");
		tipus=Integer.parseInt(br.readLine());
		switch (tipus){
		case 1:
			System.out.println("Digues el ID del pc asignat:");
			int pc_asig = Integer.parseInt(br.readLine());
			ArrayList <String> estudios = new ArrayList<String>();
				bucle=1;
				System.out.println("Digues el nom:");
				nom = (br.readLine());
				System.out.println("Digues el sou base:");
				sou_base = Integer.parseInt(br.readLine());
				System.out.println("Digues l'edat:");
				edat = Integer.parseInt(br.readLine());
			while(bucle != 0) {
				System.out.println("Digues els estudis [S] per a sortir:");
				dada=br.readLine();
				if(dada.equals("S")){
					System.out.println("se surt");
					bucle=0;
				}
				else{
					estu = dada;
					estudios.add(estu);	
				}
				
			}
			treballador.add(new administrativo(nom, sou_base, edat, estudios,pc_asig));
			System.out.println("-----------------------------------");
			break;
			case 2:
				System.out.println("Digues el nom:");
				nom = (br.readLine());
				System.out.println("Digues el sou base:");
				sou_base = Integer.parseInt(br.readLine());
				System.out.println("Digues l'edat:");
				edat = Integer.parseInt(br.readLine());
				System.out.println("Digues el ID de la maquina asignada:");
				int maq_id = Integer.parseInt(br.readLine());
				System.out.println("Digues els anys d'experiencia amb la maquina asignada:");
				int maq_anyos = Integer.parseInt(br.readLine());
				treballador.add(new maquinista(nom, sou_base,edat,maq_anyos,maq_id));
				System.out.println("-----------------------------------");
			break;
		}
	}
	//printa les opcions i demana opcio cada cop que carrega el menu
	//----------------------------------------------------------------------------------------//
	private static int menu() throws Exception {
		System.out.println("1. Afegir treballador");
		System.out.println("2. Visualitzar treballador");
		System.out.println("3. Administratiu ord. x més estudis");
		System.out.println("4. Maquinista ord. x més experiència");
		System.out.println("0. Sortir");
		menu=Integer.parseInt(br.readLine());
		return menu;
	}
}