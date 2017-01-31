package examens;
//Escriure un programa en Java que llegeixi per teclat una frase o conjunt de paraules. 
//Cadascuna de les lletres haur� d�estar emmagatzemada en una posici� de l�array. 
//El programa ser� un cercador: Haur� de cercar una paraula que introduir� l�usuari per teclat, 
//i indicar per pantalla si s�ha trobat aquella paraula o no.
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
			
			//mostrem men� i quedem a l'espera
			
			while (menu != 4){
				System.out.println("");
				System.out.println("=========================");
				System.out.println("1.Aparcar Cotxe.");
				System.out.println("2.Retirar Cotxe.");
				System.out.println("3.Planning del Parking.");
				System.out.println("4.Finalitzar l'aplicaci�.");
				System.out.println("=========================");
				System.out.println("");

				//insertem el nombre de menu
				String smenu=teclado.readLine();
				menu=Integer.parseInt(smenu);

				if (menu<1 | menu>4){
					System.out.println("has pitjat una opci� de menu incorrecte, torna a comen�ar");
				}

				//executem l'opci� 1, es demana el tamany del vehicle PoG, s'ocupa una pla�a
				//cada cotxe nom�s ocupa una pla�a, sempre s'ocupa la pla�a de menor nombre,
				//si el cotxe es petit y les P est�n ocupades s'ocupa un gran,
				//si el cotxe es G y no hi ha places no s'ocupa cap pla�a.

				if (menu==1){
					System.out.println("Tamany del cotxe, G o P");
					stam=teclado.readLine();
					
					if (stam.equals("P")){
						//es busca la primera pla�a lliure i s'ocupa
						//sino hi ha cap lliure es cerca en els G y s'ocupa
						//si esta tot ple es mostra misastge que est� ple
						//missatge amb la pla�a ocupada
						for(i=0;i<14;i++){
							if(petit[i]==false){
								pos=i;
								i=15;
							}
							petit[pos]=true;
							System.out.println("la pla�a ocupada �s la P"+(pos+1));
						}

						if(i==13){
							for(j=0;j<10;j++){
								if(j==9){
								System.out.println("no queden pla�es de les G");
								}
								if(gran[j]==false){
									pos=j;
									j=11;
								}
							}
							gran[pos]=true;
						System.out.println("no queden pla�es de les P, et quedes la G"+(pos+1));
						}
						dif=true;
						
					}

					
				

				if (stam.equals("G")){
					//es busca la primera pla�a lliure i s'ocupa
					//si esta tot ple es mostra misastge que est� ple
					//missatge amb la pla�a ocupada
					for(i=0;i<10;i++){
						if(i==9){
							System.out.println("no queden pla�es de les G");
						}
						if(gran[i]==false){
							pos=i;
							i=11;
						}
						
					}
					gran[pos]=true;
					System.out.println("la pla�a ocupada �s la G"+(pos+1));
					dif=true;
				}
				if (dif=false) {
					System.out.println("has pitjat un tipus de tamany incorrecte, torna a comen�ar");
				}
			}


				//executem l'opci� 2, retirar cotxe, es demana el tipus de pla�a y nombre de pla�a. es deixa lliure.
				if (menu==2){
				System.out.println("Tamany del cotxe, G o P");
				stam=teclado.readLine();
				System.out.println("numero de la pla�a");
				String splac=teclado.readLine();
				iplac=Integer.parseInt(splac);
				//segons sigui G o P s'ha de fer un o altre opci�, llavors es buida la posicio del array que toca,
				}

				//executem l'opci� 3, planning del parking. bucle sistemout amb els 2 arrays
				if(menu==3){
					System.out.println("la distribuci� de les places de parking �s la seg�ent:");
					for(i=0;i<14;i++){
						if(petit[i]==true){
							situ="ocupada";
						}
						if(petit[i]==false){
							situ="lliure";
						}
						System.out.println("la pla�a P"+(i+1)+" est� "+situ);	
					}
					for(i=0;i<10;i++){
						if(gran[i]==true){
							situ="ocupada";
						}
						if(gran[i]==false){
							situ="lliure";
						}
						System.out.println("la pla�a G"+(i+1)+" est� "+situ);
					}
				}
				
				//executem l'opci� 4, finalitzar programa. Simplement es pitja el bot� 4.
				if(menu==4){
					System.out.println("l'aplicaci� ha finalitzat");
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}