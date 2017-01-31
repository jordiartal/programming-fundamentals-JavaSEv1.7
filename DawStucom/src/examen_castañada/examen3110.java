package examen_castañada;
import java.io.*;
import java.util.*;

public class examen3110 {
	
	
	static BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	static int op_menu; static String nombre;
	static ArrayList <Jugador> Partida = new ArrayList <Jugador>();
	public static void main(String[] args) throws Exception {	
		menu();
	}

	private static void menu() throws Exception {
		while(op_menu != 4){	
			System.out.println("TRUCO O TRATO O_o  !!!");
			System.out.println("[1]Añadir Jugador");
			System.out.println("[2]Ver datos jugador");
			System.out.println("[3]Anotar accion");
			System.out.println("[4]Finalizar Juego");
			op_menu=Integer.parseInt(teclado.readLine());
			
				switch (op_menu){
				case 1:
					afegirJugador();
					break;
				case 2:
					veureDades();
					break;
				case 3:
					anotaAccio();
					break;
				case 4:
					finalitzaJoc();
					break;
				}
			
		}
	}

	private static void finalitzaJoc() {

		System.out.println("Adeuuu ");
	}

	//per completar...
	private static void anotaAccio() throws Exception {
		System.out.println("que vols fer?");
		System.out.println("[1]Anotar mordisco");
		System.out.println("[2]Anotar venta");//en anotar venta que tipo de producto ha vendido	
		System.out.println("[3]Anotar caramelos");
		op_menu=Integer.parseInt(teclado.readLine());
			if(op_menu < 1 || op_menu > 3){
				switch (op_menu){
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
			}
		}
	}
	
	//per completar....
	private static void veureDades() throws Exception {
		System.out.println("digues el nom");
		nombre=teclado.readLine();
		for(int i=0;i<Partida.size();i++){
			if (nombre.equals((Partida)))
					Partida.get(i).toString();
		}
		
	}

	private static void afegirJugador() throws Exception {
		System.out.println("digues el tipus de jugador:");
		System.out.println("[1]castañero,[2]zombi,[3]chavalin");
		int tipus=Integer.parseInt(teclado.readLine());
		switch(tipus){
		case 1:
			System.out.println("dades per al CASTAÑERO");
			System.out.println("digues el nom");
			nombre = (teclado.readLine());
			Partida.add(new Castanero(nombre));
			break;
		case 2:
			System.out.println("dades per al ZOMBIE");
			System.out.println("digues el nom");
			nombre = (teclado.readLine());
			Partida.add(new Zombi(nombre));
			break;
		case 3:
			System.out.println("dades per al CHAVALIN");
			System.out.println("digues el nom");
			nombre = (teclado.readLine());
			Partida.add(new Chavalin(nombre));
			break;
		}
	}
	


}
