package sueltos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Agenda {
	public static void main (String[] args){
		try{
			//CREAR ARRAY DE 10 REGISTROS bidimensional, uno para nombres, otro para numero telefono,
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			String[][]agenda=new String[10][2];
			for (int i=0;i<10;i++){
				agenda[i][0]="0";
				agenda[i][1]="0";
			}
			int option=0,posicio=0;
			String nom="",tel="";
			boolean comp=false,grabatel=false;
			
			while (option !=6){
			//MENU INICIAL
			System.out.println("");
			System.out.println("========================");
			System.out.println("******MENU Agenda*******");
			System.out.println("========================");
			System.out.println("[1] - AFEGIR REGISTRE");
			System.out.println("[2] - EDITAR REGISTRE");
			System.out.println("[3] - ESBORRAR REGISTRE");
			System.out.println("[4] - CERCAR REGISTRE");
			System.out.println("[5] - MOSTRAR AGENDA");
			System.out.println("[6] - SORTIR");
			System.out.println("ESCULL UNA OPCIÓ:");
			String Soption=teclado.readLine();
			option=Integer.parseInt(Soption);
			
				//OPCION 1: AÑADIR REGISTRO (NºREGISTRO,NOMBRE+APELLIDOS,NUM TELEFONO)
				if (option == 1) {
					
					
					//S'ESCRIU EL NOM
					System.out.println("Escriu el NOM:");
					nom=teclado.readLine();
								
					System.out.println("Escriu el TELEFON:");
					tel=teclado.readLine();
					
					//COMPROBAR QUE EL NUMERO DE TELEFONO NO ESTA REPETIDO
					for(int i=0;i<10;i++){
						comp=agenda[i][1].equals(tel);	
						if (comp == true){
							System.out.println("Aquest telefon ja existeix");
							i=11;
							grabatel=false;
						}
						if (comp == false){
							grabatel=true;
							posicio=i;
						}
					}
					
					
					//COMPROBAR EL PRIMER REGISTO LIBRE (CON CEROS) Y AÑADIR LOS DATOS ALLÍ
					
					if(grabatel==true){
					agenda[posicio][0]=nom;
					agenda[posicio][1]=tel;
					}
					grabatel=false;
					comp=false;
					posicio=0;
				}

				//OPCION2: EDITAR REGISTRO
				if (option == 2){
					
					while (comp==false){
						//SE PIDE QUE REGISTRO QUIERE MODIFICAR
						System.out.println("quin registre vols modificar?:");
						String Sposicio=teclado.readLine();
						posicio=Integer.parseInt(Sposicio);
						
						//SE COMPRUEBA QUE EL REGISTRO EXISTA, SI NO EXISTE AL MENU PRINCIPAL, SI EXISTE SE INTRODUCE DE NUEVO
						if (agenda[posicio][0]=="0"){
							System.out.println("EL REGISTRE NO EXISTEIX, ES TORNA AL MENU PRINCIPAL");
							
						}
						if (agenda[posicio][0]!="0"){
							
							//SE MUESTRA EL RESULTADO DE LA INSERCIÓN POR PANTALLA,
							System.out.println("Escriu el NOM:");
							nom=teclado.readLine();		
							System.out.println("Escriu el TELEFON:");
							tel=teclado.readLine();
							agenda[posicio][0]=nom;
							agenda[posicio][1]=tel;
							System.out.println("registre modificat");
							System.out.print("registre num: "+posicio);
							System.out.print(" nom: "+agenda[posicio][0]);
							System.out.print(" telefon: "+agenda[posicio][1]);
						}	
						comp=true;
					}
				}
				
				//OPCION 3: BORRAR REGISTRO, SE INTRODUCE EL VALOR CERO EN LOS CAMPOS,
				if (option == 3){
					System.out.println("quin registre vols esborrar?:");
					String Sposicio=teclado.readLine();
					posicio=Integer.parseInt(Sposicio);
					System.out.println("s'esborra el registre: "+posicio);
					agenda[posicio][0]="0";
					agenda[posicio][1]="0";
					
				}
				
				//OPCION 4: BUSCAR POR NUMERO DE REGISTRO, SE BUSCA POR EL INDICE,
				if (option == 4){
					System.out.println("quina posició vols mostrar?:");
					String Sposicio=teclado.readLine();
					posicio=Integer.parseInt(Sposicio);
					System.out.print("registre num: "+posicio);
					System.out.print(" nom: "+agenda[posicio][0]);
					System.out.print(" telefon: "+agenda[posicio][1]);
				}

				//OPCION 5: MOSTRAR AGENDA
				if (option == 5){
					for (int i=0;i<10;i++){
						System.out.println(i+" nom:"+agenda[i][0]+"telefon: "+agenda[i][1]);											
					}
				}
				
				//OPCION 6: SALIR, FINALIZACION DEL PROGRAMA CON UN MENSAJE
				if (option == 6){
					System.out.println("se surt del programa");
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}
