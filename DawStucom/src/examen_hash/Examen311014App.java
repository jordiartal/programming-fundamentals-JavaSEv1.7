package examen_hash;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Examen311014App {
	static String nombre,atacant,victima; static int menu=0,teclat=0;
	static double puntuacion,castanasVendidas, pinasVendidas, mordiscos;
	static double chavalinesMordidos, castanerosMordidos, caramelos, castanas, pinas;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static HashMap<String, Jugador> halloween = new HashMap<String, Jugador>();
	
	public static void main(String[] args) throws Exception  {
		
		do{
			menu=menu();
			menu=Integer.parseInt(br.readLine());
			switch(menu){
				case 1:
					anadirJugador();
					break;
				case 2:
					verDatosJugador();
					break;
				case 3:
					anotarAccion();
					break;
				case 0:
					sortir();
					break;
				default:
					System.out.println("OPCIO INCORRECTA, TORNAR-HI");
			}
		}
		while(menu!=0);
	}

	

	private static int menu() {
		System.out.println("---HALLOWEEN---");
		System.out.println("[1]-[AÑADIR JUGADOR]");
		System.out.println("[2]-[VER DATOS JUGADOR]");
		System.out.println("[3]-[ANOTAR ACCION]");
		System.out.println("[0]-[SALIR]");
		return 0;
	}
	
	private static void anadirJugador() throws Exception {
		System.out.println("QUE HAS D'INTRODUÏR?");
		System.out.println("[1]-CASTAÑERO");
		System.out.println("[2]-ZOMBI");
		System.out.println("[3]-CHAVALIN");
		teclat=Integer.parseInt(br.readLine());
		switch(teclat){
			case 1:
				System.out.println("NOM:");
				nombre=br.readLine();
				System.out.println("CASTAÑES VENUDES:");
				castanasVendidas=Double.parseDouble(br.readLine());
				System.out.println("PIÑAS VENDIDAS:");
				pinasVendidas=Double.parseDouble(br.readLine());
				Castanero castaneiro=new Castanero(nombre, castanasVendidas, pinasVendidas);
				castaneiro.setPuntuacion(castaneiro.CalcularPuntuacion());
				halloween.put(nombre, castaneiro);
				System.out.println(castaneiro);
			break;
			case 2:
				System.out.println("NOM:");
				nombre=br.readLine();
				System.out.println("CHAVALINES MORDIDOS:");
				chavalinesMordidos=Double.parseDouble(br.readLine());
				System.out.println("CASTAÑEROS MORDIDOS:");
				castanerosMordidos=Double.parseDouble(br.readLine());
				Zombi zombiu=new Zombi(nombre, chavalinesMordidos, castanerosMordidos);
				zombiu.setPuntuacion(zombiu.CalcularPuntuacion());
				halloween.put(nombre, zombiu);
				System.out.println(zombiu);
			break;
			case 3:
				System.out.println("NOM:");
				nombre=br.readLine();
				if(nombre.equals("little nicholas")){
					caramelos=10; castanas=5;pinas=1;
				}
				else{
					System.out.println("CARAMELS:");
					caramelos=Double.parseDouble(br.readLine());
					System.out.println("PIÑAS:");
					pinas=Double.parseDouble(br.readLine());
					System.out.println("CASTAÑAS:");
					castanas=Double.parseDouble(br.readLine());
				}
				Chavalin chavalinu=new Chavalin(nombre, caramelos, castanas, pinas);
				chavalinu.setPuntuacion(chavalinu.CalcularPuntuacion());
				halloween.put(nombre, chavalinu);
				System.out.println(chavalinu);
			break;
			default:
				System.out.println("NUMERO INCORRECTE");
		}
	}

	private static void verDatosJugador() throws Exception {
		System.out.println("DIGUES EL NOM:");
		nombre=br.readLine();
		if(halloween.containsKey(nombre)){
			System.out.println(halloween.get(nombre));
		}
		else{
			System.out.println("NO EXISTEIX AQUEST REGISTRE");
		}
	}

	private static void anotarAccion() throws Exception {
		System.out.println("QUE HAS D'INTRODUÏR?");
		System.out.println("[1]-ANOTAR MORDISCO");
		System.out.println("[2]-ANOTAR VENTA");
		System.out.println("[3]-ANOTAR CARAMELOS");
		teclat=Integer.parseInt(br.readLine());
		switch(teclat){
		case 1:
			System.out.println("DIGUES EL NOM ZOMBI:");
			atacant=br.readLine();
			if(halloween.containsKey(atacant)){
				System.out.println("DIGUES EL NOM DE LA VICTIMA:");
				victima=br.readLine();
				if(halloween.containsKey(victima)){
					if(halloween.get(victima)instanceof Castanero){
						((Zombi)halloween.get(atacant)).setCastanerosMordidos(((Zombi)halloween.get(atacant)).getCastanerosMordidos()+1);
						((Castanero)halloween.get(victima)).setMordiscos(((Castanero)halloween.get(victima)).getMordiscos()+1);
						((Castanero)halloween.get(victima)).setPuntuacion(((Castanero)halloween.get(victima)).CalcularPuntuacion());
						((Zombi)halloween.get(atacant)).setPuntuacion( ((Zombi)halloween.get(atacant)).CalcularPuntuacion() );
						System.out.println(halloween.get(atacant));
						System.out.println(halloween.get(victima));
					}
					if(halloween.get(victima)instanceof Chavalin){
						((Zombi)halloween.get(atacant)).setCastanerosMordidos(((Zombi)halloween.get(atacant)).getChavalinesMordidos()+1);
						((Chavalin)halloween.get(victima)).setMordiscos(((Chavalin)halloween.get(victima)).getMordiscos()+1);
						((Chavalin)halloween.get(victima)).setPuntuacion(((Chavalin)halloween.get(victima)).CalcularPuntuacion());
						((Zombi)halloween.get(atacant)).setPuntuacion( ((Zombi)halloween.get(atacant)).CalcularPuntuacion() );
						System.out.println(halloween.get(atacant));
						System.out.println(halloween.get(victima));
					}
				}
				else{
					System.out.println("NO EXISTEIX AQUEST REGISTRE");
					return;
				}
			}
			else{
				System.out.println("NO EXISTEIX AQUEST REGISTRE");
				return;
			}
			break;
		case 2:
			System.out.println("DIGUES EL NOM DEL CASTANYER:");
			atacant=br.readLine();
			if(halloween.containsKey(atacant)){
				System.out.println("DIGUES EL NOM DE CHAVALIN:");
				victima=br.readLine();
				if(halloween.containsKey(victima)){
					if(halloween.get(victima)instanceof Chavalin){
						((Chavalin)halloween.get(victima)).setCastanas(((Chavalin)halloween.get(victima)).getCastanas()+1);
						((Castanero)halloween.get(atacant)).setCastanasVendidas(((Castanero)halloween.get(atacant)).getCastanasVendidas()+1);
						
						((Castanero)halloween.get(atacant)).setPuntuacion(((Castanero)halloween.get(atacant)).CalcularPuntuacion());
						((Chavalin)halloween.get(victima)).setPuntuacion( ((Chavalin)halloween.get(victima)).CalcularPuntuacion() );;
						
						System.out.println(halloween.get(atacant));
						System.out.println(halloween.get(victima));
					}
				}
				else{
					System.out.println("NO EXISTEIX AQUEST REGISTRE");
					return;
				}
			}
			else{
				System.out.println("NO EXISTEIX AQUEST REGISTRE");
				return;
			}
			break;
		case 3:
			System.out.println("DIGUES EL NOM DEL CHAVALIN:");
			atacant=br.readLine();
			if(halloween.containsKey(atacant)){				
				if(halloween.get(atacant)instanceof Chavalin){
					((Chavalin)halloween.get(atacant)).setCaramelos(((Chavalin)halloween.get(atacant)).getCaramelos()+1);	
					
					((Chavalin)halloween.get(atacant)).setPuntuacion(((Chavalin)halloween.get(atacant)).CalcularPuntuacion());;
						
					System.out.println(halloween.get(atacant));	
				}	
			}
			else{
				System.out.println("NO EXISTEIX AQUEST REGISTRE O REGISTRE INCORRECTE");
				return;
			}
			break;
		default:
			System.out.println("OPCIO INCORRECTA");
		}	
	}
	private static void sortir() {
		Set <String> keys = halloween.keySet();
		ArrayList <String>listakeys = new ArrayList<String>();
		listakeys.addAll(keys);
		Collections.sort(listakeys);
		for(String s: listakeys){
			System.out.println(halloween.get(s));
		}	
	}
}
