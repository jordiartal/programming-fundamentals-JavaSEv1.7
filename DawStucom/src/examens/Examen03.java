package examens;
//Escriure un programa en Java que llegeixi per teclat una frase o conjunt de paraules. 
//Cadascuna de les lletres haurà d’estar emmagatzemada en una posició de l’array. 
//El programa serà un cercador: Haurà de cercar una paraula que introduirà l’usuari per teclat, 
//i indicar per pantalla si s’ha trobat aquella paraula o no.
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Examen03 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int menu=0;
			String stam="";
			int iplac=0;
			boolean dif=false;
			int pos=0;
			int i=0;
			int j=0;
			String situ="";
			boolean[]gran=new boolean[10]; 
			boolean[]petit=new boolean[14];
			
			//mostrem menú i quedem a l'espera
			
			while (menu != 4){
				System.out.println("");
				System.out.println("=========================");
				System.out.println("1.Aparcar Cotxe.");
				System.out.println("2.Retirar Cotxe.");
				System.out.println("3.Planning del Parking.");
				System.out.println("4.Finalitzar l'aplicació.");
				System.out.println("=========================");
				System.out.println("");

				//insertem el nombre de menu
				String smenu=teclado.readLine();
				menu=Integer.parseInt(smenu);

				if (menu<1 | menu>4){
					System.out.println("has pitjat una opció de menu incorrecte, torna a començar");
				}

				//executem l'opció 1, es demana el tamany del vehicle PoG, s'ocupa una plaça
				//cada cotxe només ocupa una plaça, sempre s'ocupa la plaça de menor nombre,
				//si el cotxe es petit y les P están ocupades s'ocupa un gran,
				//si el cotxe es G y no hi ha places no s'ocupa cap plaça.

				if (menu==1){
					System.out.println("Tamany del cotxe, G o P");
					stam=teclado.readLine();
					
					if (stam.equals("P")){
						//es busca la primera plaça lliure i s'ocupa
						//sino hi ha cap lliure es cerca en els G y s'ocupa
						//si esta tot ple es mostra misastge que está ple
						//missatge amb la plaça ocupada
						for(i=0;i<14;i++){
							if(petit[i]==false){
								pos=i;
								i=15;
							}
							petit[pos]=true;
							System.out.println("la plaça ocupada és la P"+(pos+1));
						}

						if(i==13){
							for(j=0;j<10;j++){
								if(j==9){
								System.out.println("no queden plaçes de les G");
								}
								if(gran[j]==false){
									pos=j;
									j=11;
								}
							}
							gran[pos]=true;
						System.out.println("no queden plaçes de les P, et quedes la G"+(pos+1));
						}
						dif=true;
						
					}

					
				

				if (stam.equals("G")){
					//es busca la primera plaça lliure i s'ocupa
					//si esta tot ple es mostra misastge que está ple
					//missatge amb la plaça ocupada
					for(i=0;i<10;i++){
						if(i==9){
							System.out.println("no queden plaçes de les G");
						}
						if(gran[i]==false){
							pos=i;
							i=11;
						}
						
					}
					gran[pos]=true;
					System.out.println("la plaça ocupada és la G"+(pos+1));
					dif=true;
				}
				if (dif=false) {
					System.out.println("has pitjat un tipus de tamany incorrecte, torna a començar");
				}
			}


				//executem l'opció 2, retirar cotxe, es demana el tipus de plaça y nombre de plaça. es deixa lliure.
				if (menu==2){
				System.out.println("Tamany del cotxe, G o P");
				stam=teclado.readLine();
				System.out.println("numero de la plaça");
				String splac=teclado.readLine();
				iplac=Integer.parseInt(splac);
				//segons sigui G o P s'ha de fer un o altre opció, llavors es buida la posicio del array que toca,
				}

				//executem l'opció 3, planning del parking. bucle sistemout amb els 2 arrays
				if(menu==3){
					System.out.println("la distribució de les places de parking és la següent:");
					for(i=0;i<14;i++){
						if(petit[i]==true){
							situ="ocupada";
						}
						if(petit[i]==false){
							situ="lliure";
						}
						System.out.println("la plaça P"+(i+1)+" está "+situ);	
					}
					for(i=0;i<10;i++){
						if(gran[i]==true){
							situ="ocupada";
						}
						if(gran[i]==false){
							situ="lliure";
						}
						System.out.println("la plaça G"+(i+1)+" está "+situ);
					}
				}
				
				//executem l'opció 4, finalitzar programa. Simplement es pitja el botó 4.
				if(menu==4){
					System.out.println("l'aplicació ha finalitzat");
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}