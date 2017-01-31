package sueltos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class longitud {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int option=0,dorsal=0,pos=0;
			double max=-1;
			ArrayList<Integer> dorsals= new ArrayList<Integer>();
			ArrayList<String> noms= new ArrayList<String>();
			ArrayList<Double> m2011= new ArrayList<Double>();
			ArrayList<Double> m2012= new ArrayList<Double>();
			ArrayList<Double> m2013= new ArrayList<Double>();
			ArrayList<String> esta= new ArrayList<String>();
			while(option!=4){
				System.out.println();
				System.out.println("1.Inscriure un participant");
				System.out.println("2.Mostrar llistat per dorsal");
				System.out.println("3.Mostrar llistat per marques 2013");
				System.out.println("4.Finalitzar programa");
				System.out.println("escull la opció:");
				String Soption=teclado.readLine();
				option=Integer.parseInt(Soption);
				if(option<1 && option>3){
					System.out.println();
					System.out.println("Has pitjat un numero incorrecte, torna-hi");
				}
				if(option==1){
					/*codi per a inscriure el participant,
					dorsal,nom, marca 2011,2012 i 2013*/
					dorsal++;
					dorsals.add(dorsal);
					System.out.println("digues el teu nom");
					String nom=teclado.readLine();
					noms.add(nom);
					System.out.println("millor marca 2011");
					double n2011=Double.parseDouble(teclado.readLine());
					m2011.add(n2011);
					System.out.println("millor marca 2012");
					double n2012=Double.parseDouble(teclado.readLine());
					m2012.add(n2012);
					System.out.println("millor marca 2013");
					double n2013=Double.parseDouble(teclado.readLine());
					m2013.add(n2013);
					System.out.println("s'han introduït les dades");
				}
				if(option==2){
					//codi per mostrar el llistat de dades
					for(int x=0;x<dorsals.size();x++){
						System.out.println("dorsal: "+dorsals.get(x)+" | nom: "+noms.get(x)+" | 2011: "+m2011.get(x)+" | 2012: "+m2012.get(x)+" | 2013: "+m2013.get(x));
					}
				}
				if(option==3){
					//codi per mostrar el llistat de marques
					for(int x=0;x<m2013.size();x++){
						for(int y=0;y<m2013.size();y++){
							if(m2013.get(y)>max && m2013.get(y)!=0){
								max=m2013.get(y);
								pos=y;
							}
						}
						esta.add("dorsal:"+dorsals.get(pos)+" | nom: "+noms.get(pos)+" | 2013: "+m2013.get(pos)+" |");
						m2013.set(pos, 0.0);
						max=0;
					}
					for(int x=0;x<esta.size();x++){
						System.out.println(esta.get(x));	
					}
				}
				if(option==4){
					System.out.println("Has sortit del programa");
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}