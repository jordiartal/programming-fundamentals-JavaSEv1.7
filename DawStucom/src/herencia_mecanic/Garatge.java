package herencia_mecanic;
import java.io.*;
import java.util.*;

public class Garatge {
	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	public static int pos=0;
	public static void main(String[] args) throws Exception {
		ArrayList <Treball> registre = new ArrayList <Treball>();
		int menu;
		do{
			menu = menu();
			switch(menu){
			case 1:
				nouRegistre(registre);
				break;
			case 2:
				mostraRegistre(registre);
				break;
			case 3:
				actuRegistre(registre);
				break;
			case 0:
				break;
			default:
				System.out.println("Opció incorrecta");
			}
		}
		while(menu!=0);
	}

	private static void nouRegistre(ArrayList <Treball> registre) throws Exception {
		System.out.println("quin tipus de treball és");
		System.out.println("[1] - Mecanica");
		System.out.println("[2] - Chapa");
		System.out.println("[3] - Revisió");
		int tipus=Integer.parseInt(br.readLine());
		switch (tipus){
		case 1:
			registre.add(new Mecanica());  
			break;
		case 2:
			registre.add(new Chapa());
			break;
		case 3:
			registre.add(new Revisio());
			break;
		}
	}
	
	private static void mostraRegistre(ArrayList <Treball> registre) throws Exception  {
		System.out.println("digues el ID, tens [0-"+(registre.size()-1)+"]");
		pos = Integer.parseInt(br.readLine());
		if((pos <= registre.size()-1) && (pos >= 0)){
			System.out.println(registre.get(pos));
		}
		else{
			System.out.println("Numero de incorrecte");
		}
	}
	
	private static void actuRegistre(ArrayList <Treball> registre) throws Exception  {
		System.out.println("digues el ID, tens [0-"+(registre.size()-1)+"]");
		pos = Integer.parseInt(br.readLine());
		String finalitzat;
		Treball t = registre.get(pos);
		if(t.acaba==false &&((pos <= registre.size()-1) && (pos >= 0))){
			if(t instanceof Mecanica){
				System.out.println("dona una descripció:");
				((Mecanica) t).setDescripcio(br.readLine());
				System.out.println("cuantes hores:");
				((Mecanica) t).setHores(Integer.parseInt(br.readLine()));
				System.out.println("quant t'ha costat el material:");
				((Mecanica) t).setPreu_material((Double.parseDouble(br.readLine()))*1.1);
				((Mecanica) t).setPreu_final(((Mecanica) t).getPreu_material()+(((Mecanica) t).getHores()*30));
				System.out.println("esta finalitzat?[S-N]");
				finalitzat=br.readLine();
					if(finalitzat.equals("S")){
						((Mecanica)t).setAcaba(true);
					}
					else{
						System.out.println("no s'ha finalitzat");
					}
					registre.set(pos,t);
			}
			else if(t instanceof Chapa){
				System.out.println("dona una descripció:");
				((Chapa) t).setDescripcio(br.readLine());
				System.out.println("cuantes hores:");
				((Chapa) t).setHores(Integer.parseInt(br.readLine()));
				System.out.println("quant t'ha costat el material:");
				((Chapa) t).setPreu_material((Double.parseDouble(br.readLine()))*1.3);
				((Chapa) t).setPreu_final(((Chapa) t).getPreu_material()+(((Chapa) t).getHores()*30));
				finalitzat=br.readLine();
				System.out.println("esta finalitzat?[S-N]");
				finalitzat=br.readLine();
					if(finalitzat.equals("S")){
						((Chapa)t).setAcaba(true);
					}
					else{
						System.out.println("no s'ha finalitzat");
					}
				registre.set(pos,t);
			}
			else if(t instanceof Revisio){
				System.out.println("dona una descripció:");
				((Revisio) t).setDescripcio(br.readLine());
				System.out.println("cuantes hores:");
				((Revisio) t).setHores(Integer.parseInt(br.readLine()));			
				((Revisio) t).setPreu_final((((Revisio)t).getHores()*30)+20);
				System.out.println("esta finalitzat?[S-N]");
				finalitzat=br.readLine();
					if(finalitzat.equals("S")){
						((Revisio)t).setAcaba(true);
					}
					else{
						System.out.println("no s'ha finalitzat");
					}
				registre.set(pos,t);
			}	
		}
		else{
			System.out.println("El treball ja está acabat o es un identificador incorrecte");
		}
	}
	
	private static int menu() throws Exception {
		int opcion;
		System.out.println("[1] - Registra nova Rep/Rev");
		System.out.println("[2] - Mostrar Rep/Rev");
		System.out.println("[3] - Actualitzar dades");
		System.out.println("[0] - Sortir");
		System.out.println("Elige opcion:");
		opcion=Integer.parseInt(br.readLine());
		return opcion;
	}
}