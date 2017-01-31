package examen_piloto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class PilotoApp {
	static String nombre, equipo, resposta ;
	static int menu=1, teclat=1; 
	static double dorsal, puntos;
	static HashMap<String, Piloto> motoGP = new HashMap<String, Piloto>();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		while(teclat!=0){
			System.out.println("INSERTA EL NOM");
			nombre=br.readLine();
			System.out.println("INSERTA EL EQUIP");
			equipo=br.readLine();
			System.out.println("INSERTA EL DORSAL");
			dorsal=Double.parseDouble(br.readLine());
			Piloto motero = new Piloto(nombre, equipo, dorsal);
			motoGP.put(nombre, motero); 
			System.out.println("VOLS OMPLIR UN ALTRE PARTICIPANT? SI-[1] NO-[0]");
			teclat=Integer.parseInt(br.readLine());
		}
		while (menu!=0){
		menu=menuApp();
		menu=Integer.parseInt(br.readLine());
			switch(menu){
			case 1:
				Carrera();
				break;
			case 2:
				VerDatosPiloto();
				break;
			case 3:
				Classificacion();
				break;
			case 0:
				System.out.println("HAS SORTIT DEL PROGRAMA");
				break;
			default:
				System.out.println("OPCIO INCORRECTE");
			}
		}
	}
	
	private static void Carrera() throws Exception {
		System.out.println("HAS D'INTRODUIR 3 DELS SEGÜENTS:");
		System.out.println(motoGP);
		System.out.println("DIGUES EL PRIMER GUANYADOR:");
		motoGP.get(br.readLine()).setPuntos(motoGP.get(nombre).getPuntos()+25); 
		System.out.println("DIGUES EL SEGON GUANYADOR:");
		motoGP.get(br.readLine()).setPuntos(motoGP.get(nombre).getPuntos()+16);
		System.out.println("DIGUES EL NOM GUANYADOR:");
		motoGP.get(br.readLine()).setPuntos(motoGP.get(nombre).getPuntos()+10);
	}
	
	private static void VerDatosPiloto() throws Exception {
		System.out.println("DIGUES EL NOM DEL PILOT");
		nombre=br.readLine();
		if(motoGP.containsKey(nombre)){
			System.out.println(motoGP.get(nombre));
		}
		else{
			System.out.println("AQUEST REGISTRE NO EXISTEIX");
		}
	}
	
	private static void Classificacion() {		
		System.out.println(motoGP);
	}
	
	public static int menuApp(){
		System.out.println("---MOTOGP---");
		System.out.println("[1]CARRERA");
		System.out.println("[2]VER DATOS PILOTO");
		System.out.println("[3]CLASIFICACION");
		System.out.println("[0]SORTIR");
		return 0;
	}
}