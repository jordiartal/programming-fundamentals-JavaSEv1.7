package interface_lloguer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
public class Practica03_App {
	//crear la hashmap i variables --------------------------------------------------------
	//-------------------------------------------------------------------------------------
	static int menu=0, teclat=0;
	static String marca, modelo, matricula;
	static double dies, plaza, pma, teclat2;
	static boolean trobat=false;
	static HashMap <String,Vehiculo> Garatge = new HashMap <String,Vehiculo>();
	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	//--------------crear menu -->>>> EXECUTA LES FUNCIONS DE L'APLICACIÓ------------------
	//-------------------------------------------------------------------------------------
	public static void main(String[] args) throws Exception{
		do{
			menu = menu();
			menu=Integer.parseInt(br.readLine());
			switch(menu){ 
			case 1:
				afegirVehicle();
				break;
			case 2:
				obtenirPressupost();
				break;
			case 3:
				mostrarVehiculo();
				break;
			case 4:
				eliminarVehiculo();
				break;
			case 0:
				System.out.println("has SORTIT del programa");
				break;
			default:
				System.out.println("Opció incorrecta");
			}
		}
		while(menu!=0);
	}
	//--------------MENU FÍSIC -->>>> MOSTRA LES FUNCIONS DE L'APLICACIÓ------------------
	//------------------------------------------------------------------------------------
	private static int menu() {
			System.out.println("Practica 3");
			System.out.println("[1]Afegir Vehicle");
			System.out.println("[2]Obtenir Pressupost");
			System.out.println("[3]Mostrar Vehicle");
			System.out.println("[4]Eliminar Vehicle");
			System.out.println("[0]Sortir");
		return 0;
	}
	//eliminar vehiculo------>>>> ESBORRA EL KEY DEL HASHMAP QUE ENS INDICA------------------
	//---------------------------------------------------------------------------------------
	private static void eliminarVehiculo() throws Exception {
		System.out.println("Quin vehicle vols ELIMINAR?, escriu la MATRICULA:");
		matricula=br.readLine();
		if(Garatge.containsKey(matricula)){
			trobat=true;
			Garatge.remove(matricula);
			System.out.println("S'ha ELIMINAT el VEHICLE");
		}
		if(trobat==false){
			System.out.println("No existeix CAP VEHICLE amb aquesta MATRICULA");
		}
		trobat=false;
	}
	//mostrar vehiculo------>>>> ES FILTRA PER TIPUS DE VEHICLE I DESPRÉS PER----------------
	//CRITERI DE  CERCA ---------------------------------------------------------------------
	private static void mostrarVehiculo() throws Exception {
		System.out.println("quin tipus de vehicle vols MOSTRAR?");
		System.out.println("[1]Cotxe,[2]Camio,[3]Furgoneta,[4]Microbus");
		teclat=Integer.parseInt(br.readLine());
		if(teclat==1 || teclat==4){		
			System.out.println("Has escollit [1]Cotxe o [4]Microbus");
			System.out.println("digues el numero mínim de PLACES:");
			teclat2=Double.parseDouble(br.readLine());
		}
		if(teclat==2 || teclat==3){
			System.out.println("Has escollit [2]Camio o [3]Furgoneta");
			System.out.println("digues el numero mínim de PMA:");
			teclat2=Double.parseDouble(br.readLine());
		}
	//es fa un SWITCH per a cada tipus de vehicle, a dins es fa un ITERATOR amb 
	//un COMPARABLE sobre la condició de cerca.
	//---------------------------------------------------------------------------------------
		Iterator<String> it = Garatge.keySet().iterator();
		switch (teclat){
		case 1:
			while(it.hasNext()){
				String key=it.next();
				if (Garatge.get(key)instanceof Cotxe){
					Cotxe C = (Cotxe) Garatge.get(key);
					if(C.getPlaza()>=teclat2){
						trobat=true;
						System.out.println("matricula: "+key+", valors: "+C.toString());
					}		
				}
			}
			if(trobat==false){
				System.out.println("no hi ha cap coincidència");
			}
			break;
		case 2:
			while(it.hasNext()){
				String key=it.next();
				if (Garatge.get(key)instanceof Camio){
					Camio Ca = (Camio) Garatge.get(key);
					if(Ca.getPma() >= teclat2){
						trobat=true;
						System.out.println("matricula: "+key+", valors: "+Ca.toString());
					}		
				}
			}
			if(trobat==false){
				System.out.println("no hi ha cap coincidència");
			}
			break;
		case 3:
			while(it.hasNext()){
				String key=it.next();
				if (Garatge.get(key)instanceof Furgoneta){
					Furgoneta F = (Furgoneta) Garatge.get(key);
					if(F.getPma()>=teclat2){
						trobat=true;
						System.out.println("matricula: "+key+", valors: "+F.toString());
					}		
				}
			}
			if(trobat==false){
				System.out.println("no hi ha cap coincidència");
			}
			break;
		case 4:
			while(it.hasNext()){
				String key=it.next();
				if (Garatge.get(key)instanceof Microbus){
					Microbus M = (Microbus) Garatge.get(key);
					if(M.getPlaza()>=teclat2){
						trobat=true;
						System.out.println("matricula: "+key+", valors: "+M.toString());
					}		
				}
			}
			if(trobat==false){
				System.out.println("no hi ha cap coincidència");
			}
			break;
		}
		trobat=false;
	}
	//obtenir presupost ------>>>> GENERA EL PRESSUPOST CLASSE ABSTARCTA LLOGUER ----------------
	//-------------------------------------------------------------------------------------------
	private static void obtenirPressupost() throws Exception {
		System.out.println("DIGUES ELS DIES:");
		dies = Double.parseDouble(br.readLine());
		System.out.println("DIGUES LA MATRICULA:");
		matricula = br.readLine();
	// s'extreu l'objecte amb iterator, mitjançant un instance of es veu quina clase 
	// d'objecte es i després es fa el procediment calcula_pressupost amb l'objecte
	//-------------------------------------------------------------------------------------------
		Iterator<String> it = Garatge.keySet().iterator();
		while(it.hasNext()){
			String key =  (String) it.next();
			if(key.equals(matricula)){
				trobat=true;
				if (Garatge.get(matricula)instanceof Cotxe){
					Cotxe C = (Cotxe) Garatge.get(matricula);
					C.calcula_pressupost(dies);
				}
				if (Garatge.get(matricula)instanceof Furgoneta){
					Furgoneta F = (Furgoneta) Garatge.get(matricula);
					F.calcula_pressupost(dies);
				}
				if (Garatge.get(matricula)instanceof Camio){
					Camio Ca = (Camio) Garatge.get(matricula);
					Ca.calcula_pressupost(dies);
				}
				if (Garatge.get(matricula)instanceof Microbus){
					Microbus M = (Microbus) Garatge.get(matricula);
					M.calcula_pressupost(dies);
				}
			}
		}
		if(trobat==false){
			System.out.println("NO s'ha trobat CAP COINCIDÈNCIA");
		}
		trobat=false;
	}
	//afegir vehicle------>>>> GENERA L'OBJECTE I L'INSERTA AL HASH-MAP AMB UNA KEY 
	//-----------------------------------------------------------------------------------------
	private static void afegirVehicle() throws Exception {
		System.out.println("quin tipus de vehicle vols introduir?");
		System.out.println("[1]Cotxe,[2]Camio,[3]Furgoneta,[4]Microbus");
		teclat=Integer.parseInt(br.readLine());
		switch (teclat){
		case 1:
			System.out.println("----COTXE----");
			System.out.println("matricula:");
			matricula=(br.readLine());
			System.out.println("marca:");
			marca=(br.readLine());
			System.out.println("model:");
			modelo=(br.readLine());
			System.out.println("places:");
			plaza=Double.parseDouble(br.readLine());
			Garatge.put(matricula,(new Cotxe(matricula, marca, modelo, plaza)));
			break;
		case 2:
			System.out.println("----CAMIO----");
			System.out.println("matricula:");
			matricula=(br.readLine());
			System.out.println("marca:");
			marca=(br.readLine());
			System.out.println("model:");
			modelo=(br.readLine());
			System.out.println("pma:");
			pma=Double.parseDouble(br.readLine());
			Garatge.put(matricula,(new Camio(matricula, marca, modelo, pma)));
			break;
		case 3:
			System.out.println("----FURGONETA----");
			System.out.println("matricula:");
			matricula=(br.readLine());
			System.out.println("marca:");
			marca=(br.readLine());
			System.out.println("model:");
			modelo=(br.readLine());
			System.out.println("pma:");
			pma=Double.parseDouble(br.readLine());
			Garatge.put(matricula,(new Furgoneta(matricula, marca, modelo, pma)));
			break;
		case 4:
			System.out.println("----MICROBUS----");
			System.out.println("matricula:");
			matricula=(br.readLine());
			System.out.println("marca:");
			marca=(br.readLine());
			System.out.println("model:");
			modelo=(br.readLine());
			System.out.println("places:");
			plaza=Double.parseDouble(br.readLine());
			Garatge.put(matricula,(new Microbus(matricula, marca, modelo, plaza)));
			break;
		}
	}	
}