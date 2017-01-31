package sueltos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tenfe {
	public static void main (String[] args){
		try{
			int option=3,numaq=0,edat=0,km=0,vidamax=0,kmax=0,vidam=0,kmij=0,counter=0,modi=0;
			boolean control=false;
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			ArrayList<Integer>anys=new ArrayList<Integer>();
			ArrayList<Integer>kms=new ArrayList<Integer>();
			
			//PREGUNTA CUANTAS MAQUINAS TIENE
			System.out.println("QUANTES MAQUINES TENS");
			String Snumaq=teclado.readLine();
			numaq=Integer.parseInt(Snumaq);
						
			//PARA CADA MAQUINA PREGUNTA AÑOS DE VIDA Y KILOMETROS RECORRIDOS
			for(int i=0;i<numaq;i++){
				System.out.println("per a la maquina "+i+" digues els anys");
				String Sedat=teclado.readLine();
				edat=Integer.parseInt(Sedat);
				anys.add(i,edat);
				System.out.println("per a la maquina "+i+" digues els KM");
				String Skm=teclado.readLine();
				km=Integer.parseInt(Skm);
				kms.add(i,km);
			}
			
			//MENU PRINCIPAL 0-PARA SALIR
			while(option!=99){
				System.out.println("*****MENU PRINCIPAL*****");
				System.out.println("========================");
				System.out.println("[1] - NOVA MAQUINA");
				System.out.println("[2] - RESULTATS");
				System.out.println("[0] - SORTIR");
				System.out.print("Escull la opció:");
				String Soption=teclado.readLine();
				option=Integer.parseInt(Soption);				
				
					//OPTION 1:NUEVA MAQUINA NO SE PUEDEN INTRODUCIR MAQUINAS DE MAS DE 60000KM NI MAYORES DE 20AÑOS
					if (option==1){
						//l'edat
						control=false;
						while (control==false){
							System.out.println("DIGUES L'EDAT");
							String Sedat=teclado.readLine();
							edat=Integer.parseInt(Sedat);
								if ((edat > 20)||(edat<0)) {
									System.out.println("L'EDAT ES INCORRECTA");
								}
								if ((edat < 20) && (edat>0)) {
									anys.add(edat);
								control=true;
								}
						}
						//els kilometres
						control=false;
						while(control==false){
							System.out.println("DIGUES ELS KMS");
							String Skm=teclado.readLine();
							km=Integer.parseInt(Skm);
								if ((km > 60000)||(km < 0)){
									System.out.println("ELS KMS SON INCORRECTES");
								}
								if ((km < 60000 ) && ( km > 0)) {
									kms.add(km);
								control=true;
								}
						}
					}
				
					//OPTION 2:SE MUESTRA VIDA MEDIA MAXIMA Y KILOMETROS MAXIMOS COMO OBJETIVO, SERÁN 0 EN INICIO.
					if (option==2){
						System.out.println("*****OBJECTIUS*****");
						System.out.println("===================");
						System.out.println("VIDA MITJA: "+vidamax);
						System.out.println("KMS MITJA: "+kmax);
					
						//PULSANDO 1 SE PUEDEN MODIFICAR
						System.out.println("====================================");
						System.out.println("PITJA 1 PER A MODIFICAR");
						System.out.println("QUALSEVOL ALTRE NUMERO PER A SEGUIR");
						String Smodi=teclado.readLine();
						modi=Integer.parseInt(Smodi);
						control=false;
							
							while (control==false){
								if (modi != 1){
									System.out.println("SEGUIM AMB LES ESTADISTIQUES");
									control=true;
								}
								if (modi == 1){
									System.out.println("INTRODUEIX OBJECTIU VIDA MITJA");
									String Svidamax=teclado.readLine();
									vidamax=Integer.parseInt(Svidamax);
									System.out.println("INTRODUEIX OBJECTIU KMS MITJOS");
									String Skmax=teclado.readLine();
									kmax=Integer.parseInt(Skmax);
									control=true;
								}
							}
																		
							//AHORA SE MUESTRAN LAS ESTADISTICAS 
							//(VIDA MEDIA ACTUAL>>>DIFERENCIA, KM MEDIA>>>DIFERENCIA)
							
							for (int i=0;i<anys.size();i++){
								counter=counter+anys.get(i);
							}
							vidam=(counter/anys.size());
							
							counter=0;
							
							
							
							System.out.println("*****   RESULTATS   *****");
							System.out.println("=========================");
							System.out.println("VIDA MITJA ACTUAL: "+vidam);
							System.out.println("VIDA MITJA DIFER.: "+(vidam-vidamax));
							
							for (int i=0;i<kms.size();i++){
								counter=counter+kms.get(i);
							}
							kmij=(counter/kms.size());
							
							System.out.println("KMS  MITJA ACTUAL: "+kmij);
							System.out.println("KMS  MITJA DIFER.: "+(kmij-kmax));
					}
				
					//OPCION 0 SALIR PREGUNTA: ESTAS SEGURO QUE QUIERES SALIR? 1SI 2VUELVE AL MENU
					if (option == 0){
						System.out.println("ESTAS SEGUR QUE VOLS SORTIR? [1-SI/2-NO]");
						String Scounter=teclado.readLine();
						counter=Integer.parseInt(Scounter);
						
						if (counter==1){
							option=99;
							System.out.println("S'HA SORTIT DEL PROGRAMA");
						}
						if (counter==2){
							System.out.println("TORNEM AL MENU PRINCIPAL");
						}
					}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}
