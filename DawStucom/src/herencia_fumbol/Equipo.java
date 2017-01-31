package herencia_fumbol;
import java.io.*;
import java.util.*;

public class Equipo {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception{
		ArrayList<Futbolista> equipo = new ArrayList<Futbolista>();
		creaAlineacion(equipo);
		int opcion;
		Futbolista f;
		do{
			opcion = menu();
			switch(opcion){
				case 1:
					f = jugadorDorsal(equipo);
					if(f != null){
						f.setGoles(f.getGoles()+1);
					}
					else{
						System.out.println("No existe un jugador con ese dorsal");
					}
					break;
				case 2:
					f = jugadorDorsal(equipo);
					if(f != null){
						if(f instanceof Defensa){
							((Defensa)f).setPases(((Defensa)f).getPases()+1);
						}
						else if(f instanceof Delantero){
							((Delantero)f).setPases(((Delantero)f).getPases()+1);
						}
						else{
							System.out.println("Este jugador no pasa el balon");
						}
					}
					else{
						System.out.println("No existe un jugador con ese dorsal");
					}
					break;
				case 3:
					f = jugadorDorsal(equipo);
					if(f != null){
						if(f instanceof Defensa){
							((Defensa)f).setRecuperaciones(((Defensa)f).getRecuperaciones()+1);
						}
						else if(f instanceof Delantero){
							((Delantero)f).setRecuperaciones(((Delantero)f).getRecuperaciones()+1);
						}
						else{
							System.out.println("Este jugador no pasa el balon");
						}
					}
					else{
						System.out.println("No existe un jugador con ese dorsal");
					}
					break;
				case 4:
					resultadoEquipo(equipo);
					break;
				case 5:
					mejorJugador(equipo);
					break;
			}
		}while(opcion!=0);
	}

	private static void mejorJugador(ArrayList<Futbolista> equipo) {
		Collections.sort(equipo);
		System.out.println(equipo.get(equipo.size()-1));
	}

	private static void resultadoEquipo(ArrayList<Futbolista> equipo) {
		int valoracionEquipo = 0;
		for(Futbolista f: equipo){
			if(f instanceof Portero){
				valoracionEquipo += ((Portero)f).getValoracion();
			}
			else if(f instanceof Defensa){
				valoracionEquipo +=  ((Defensa)f).getValoracion();
			}
			else{
				valoracionEquipo += ((Delantero)f).getValoracion();
			}
		}
		System.out.println("El resultado del equipo es " + valoracionEquipo);
	}

	private static Futbolista jugadorDorsal(ArrayList<Futbolista> equipo) throws Exception{
		System.out.println("Introduce dorsal:");
		int dorsal = Integer.parseInt(br.readLine());
		for(Futbolista f: equipo){
			if(dorsal==f.getDorsal()){
				return f;
			}
		}
		return null;
	}

	private static int menu() throws Exception{
		System.out.println("[1] - Anotar gol");
		System.out.println("[2] - Anotar pase");
		System.out.println("[3] - Anotar recuperacion");
		System.out.println("[4] - Resultado equipo");
		System.out.println("[5] - Mejor jugador");
		System.out.println("[0] - Salir");
		int opcion = Integer.parseInt(br.readLine());
		return opcion;
	}

	private static void creaAlineacion(ArrayList<Futbolista> equipo) throws Exception{
		for(int i=0;i<4;i++){
			int demarcacion;
			do{
				System.out.println("[1] - Portero");
				System.out.println("[2] - Defensa");
				System.out.println("[3] - Delantero");
				System.out.println("Elige demarcacion:");
				demarcacion = Integer.parseInt(br.readLine());
			}while(demarcacion<1 || demarcacion>3);
			String nombre;
			int dorsal;
			System.out.println("Introduce nombre del jugador:");
			nombre = br.readLine();
			boolean existe;
			do{
				System.out.println("Introduce dorsal del jugador:");
				dorsal = Integer.parseInt(br.readLine());
				existe = comprobarDorsal(dorsal, equipo);
				if(existe){
					System.out.println("Este dorsal ya esta asignado");
				}
			}while(existe);
			switch(demarcacion){
				case 1:
					equipo.add(new Portero(nombre, dorsal, 0, 0));
					break;
				case 2:
					equipo.add(new Defensa(nombre, dorsal, 0, 0, 0));
					break;
				case 3:
					equipo.add(new Delantero(nombre, dorsal, 0, 0, 0));
					break;
			}
		}
	}

	private static boolean comprobarDorsal(int dorsal, ArrayList<Futbolista> equipo) {
		for(Futbolista f: equipo){
			if(f.getDorsal() == dorsal){
				return true;
			}
		}
		return false;
	}
}
