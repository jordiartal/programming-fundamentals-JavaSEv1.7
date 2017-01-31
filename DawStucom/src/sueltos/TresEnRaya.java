package sueltos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TresEnRaya {
	public static void main (String[] args) throws IOException{
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		String[][] joc= new String[3][3];
		int option=0,casella1=0, casella2=0, torn=0, acuguanya=0;
		boolean partida=false, ocupada=false, guanya=false;
		while(option!=3){
			System.out.println();
			System.out.println(" ____________________________ ");
			System.out.println("|_______Tres en Ratlla_______|");
			System.out.println("|                            |");
			System.out.println("|[1] - Persona vs. Persona   |");
			System.out.println("|[2] - Persona vs. Maquina   |");
			System.out.println("|[3] - Sortir		     |");
			System.out.println("|____________________________|");
			System.out.println("Escull la opció:");
			String Soption=teclado.readLine();
			option=Integer.parseInt(Soption);
			if(option==1){															//persona contra persona
				partida=false; ocupada=false; guanya=true; torn=0; acuguanya=0;		//Reseteja TOTES les variables
				for(int x=0;x<3;x++){												//inicia el tauler
					for(int y=0;y<3;y++){
						joc[x][y]="-";
					}
				}
				while(partida==false){ 												//algoritme el joc	----------------------------						
					for(int x=0;x<3;x++){											//mostra el tauler actualitzat
						for(int y=0;y<3;y++){
							System.out.print(joc[x][y]);
						}
						System.out.println();
					}
					torn++;	ocupada=false; guanya=false;							//reseteig variables temporals jugador X
					if(partida==true || torn>9){
						System.out.println("la partida s'ha acabat");
					}
					/*jugador X*/
					while(ocupada==false){
						System.out.println("jugador X et toca, digues la casella format num,num:");
						String tirada=teclado.readLine();
						casella1=Integer.parseInt(tirada.substring(0, 1));
						casella2=Integer.parseInt(tirada.substring(2, 3));
						if(joc[casella1][casella2]=="X" || joc[casella1][casella2]=="O"){
							System.out.println("La casella está ocupada, torna a tirar...");
						}
						if(joc[casella1][casella2]=="-"){
							System.out.println("ok, s'ha grabat en la posició "+tirada);
							joc[casella1][casella2]="X";
							ocupada=true;
						}
					}
					while(guanya==false){
						for(int x=0;x<3;x++){										//verifica horitzontals 
							acuguanya=0;
							for(int y=0;y<3;y++){
								if(joc[x][y]=="X"){
									acuguanya++;
								}
							}
							if(acuguanya>2){
								x=3;
								guanya=true;
								System.out.println("El jugador X ha guanyat");
								partida=true;
							}
						}
						for(int x=0;x<3;x++){										//verifica verticals 
							acuguanya=0;
							for(int y=0;y<3;y++){
								if(joc[y][x]=="X"){
									acuguanya++;
								}
							}
							if(acuguanya>2){
								x=3;
								guanya=true;
								System.out.println("El jugador X ha guanyat");
								partida=true;
							}
						}
						if(joc[0][0]=="X" && joc[1][1]=="X" && joc[2][2]=="X" ){	//diagonal 1	
							guanya=true;
							System.out.println("El jugador X ha guanyat");
							partida=true;
						}
						if(joc[0][2]=="X" && joc[1][1]=="X" && joc[2][0]=="X" ){	//diagonal 2
							guanya=true;
							System.out.println("El jugador X ha guanyat");
							partida=true;
						}
						else{
							System.out.println("s'ha acabat el torn del jugador X");
							guanya=true;
						}
					}
					torn++;	ocupada=false; guanya=false; 
					if(partida==true || torn>9){
						ocupada=true; guanya=true;
						System.out.println("la partida s'ha acabat");
					}
					for(int x=0;x<3;x++){											//mostra el tauler actualitzat
						for(int y=0;y<3;y++){
							System.out.print(joc[x][y]);
						}
						System.out.println();
					}
					//jugador O
					while(ocupada==false){
						System.out.println("jugador O et toca, digues la casella format num,num:");
						String tirada=teclado.readLine();
						casella1=Integer.parseInt(tirada.substring(0, 1));
						casella2=Integer.parseInt(tirada.substring(2, 3));
						if(joc[casella1][casella2]=="X" || joc[casella1][casella2]=="O"){
							System.out.println("La casella está ocupada, torna a tirar...");
						}
						if(joc[casella1][casella2]=="-"){
							System.out.println("ok, s'ha grabat en la posició "+tirada);
							joc[casella1][casella2]="O";
							ocupada=true;
						}
					}
					while(guanya==false){
						for(int x=0;x<3;x++){										//verifica horitzontals 
							acuguanya=0;
							for(int y=0;y<3;y++){
								if(joc[x][y]=="O"){
									acuguanya++;
								}
							}
							if(acuguanya>2){
								x=3;
								guanya=true;
								System.out.println("El jugador O ha guanyat");
								partida=true;
							}
						}
						for(int x=0;x<3;x++){										//verifica verticals 
							acuguanya=0;
							for(int y=0;y<3;y++){
								if(joc[y][x]=="O"){
									acuguanya++;
								}
							}
							if(acuguanya>2){
								x=3;
								guanya=true;
								System.out.println("El jugador O ha guanyat");
								partida=true;
							}
						}
						if(joc[0][0]=="O" && joc[1][1]=="O" && joc[2][2]=="O" ){	//diagonal 1	
							guanya=true;
							System.out.println("El jugador O ha guanyat");
							partida=true;
						}
						if(joc[0][2]=="O" && joc[1][1]=="O" && joc[2][0]=="O" ){	//diagonal 2
							guanya=true;
							System.out.println("El jugador O ha guanyat");
							partida=true;
						}
						else{
							System.out.println("s'ha acabat el torn del jugador O");
							guanya=true;
						}
					}
				}
			}
			if(option==2){															//persona contra maquina
				partida=false; ocupada=false; guanya=true; torn=0; acuguanya=0;		//reseteja TOTES les variables
				for(int x=0;x<3;x++){												//inicia el tauler
					for(int y=0;y<3;y++){
						joc[x][y]="-";
					}
				}
				while(partida==false){ 												//algoritme el joc	----------------------------						
					for(int x=0;x<3;x++){											//mostra el tauler actualitzat
						for(int y=0;y<3;y++){
							System.out.print(joc[x][y]);
						}
						System.out.println();
					}
					torn++;	ocupada=false; guanya=false;							//reseteig variables temporals jugador X
					if(partida==true || torn>9){
						System.out.println("la partida s'ha acabat");
					}
					/*jugador Humà*/
					while(ocupada==false){
						System.out.println("jugador Humà et toca, digues la casella format num,num:");
						String tirada=teclado.readLine();
						casella1=Integer.parseInt(tirada.substring(0, 1));
						casella2=Integer.parseInt(tirada.substring(2, 3));
						if(joc[casella1][casella2]=="X" || joc[casella1][casella2]=="O"){
							System.out.println("La casella está ocupada, torna a tirar...");
						}
						if(joc[casella1][casella2]=="-"){
							System.out.println("ok, s'ha grabat en la posició "+tirada);
							joc[casella1][casella2]="X";
							ocupada=true;
						}
					}
					while(guanya==false){
						for(int x=0;x<3;x++){										//verifica horitzontals 
							acuguanya=0;
							for(int y=0;y<3;y++){
								if(joc[x][y]=="X"){
									acuguanya++;
								}
							}
							if(acuguanya>2){
								x=3;
								guanya=true;
								System.out.println("El jugador X ha guanyat");
								partida=true;
							}
						}
						for(int x=0;x<3;x++){										//verifica verticals 
							acuguanya=0;
							for(int y=0;y<3;y++){
								if(joc[y][x]=="X"){
									acuguanya++;
								}
							}
							if(acuguanya>2){
								x=3;
								guanya=true;
								System.out.println("El jugador X ha guanyat");
								partida=true;
							}
						}
						if(joc[0][0]=="X" && joc[1][1]=="X" && joc[2][2]=="X" ){	//diagonal 1	
							guanya=true;
							System.out.println("El jugador X ha guanyat");
							partida=true;
						}
						if(joc[0][2]=="X" && joc[1][1]=="X" && joc[2][0]=="X" ){	//diagonal 2
							guanya=true;
							System.out.println("El jugador X ha guanyat");
							partida=true;
						}
						else{
							System.out.println("s'ha acabat el torn del jugador X");
							guanya=true;
						}
					}
					torn++;	ocupada=false; guanya=false; 							//reseteig variables temporals jugador O
					if(partida==true || torn>9){
						ocupada=true; guanya=true;
						System.out.println("la partida s'ha acabat");
					}
					for(int x=0;x<3;x++){											//mostra el tauler actualitzat
						for(int y=0;y<3;y++){
							System.out.print(joc[x][y]);
						}
						System.out.println();
					}
					//jugador Màquina
					while(ocupada==false){
						System.out.println("l'ordinador está jugant...");
						casella1=(int) Math.floor(Math.random()*(3));
						casella2=(int) Math.floor(Math.random()*(3));
						if(joc[casella1][casella2]=="X" || joc[casella1][casella2]=="O"){
							System.out.println("La casella está ocupada, torna a tirar...");
						}
						if(joc[casella1][casella2]=="-"){
							System.out.println("ok, s'ha grabat en la posició "+casella1+","+casella2);
							joc[casella1][casella2]="O";
							ocupada=true;
						}
					}
					while(guanya==false){
						for(int x=0;x<3;x++){										//verifica horitzontals 
							acuguanya=0;
							for(int y=0;y<3;y++){
								if(joc[x][y]=="O"){
									acuguanya++;
								}
							}
							if(acuguanya>2){
								x=3;
								guanya=true;
								System.out.println("La Màquina ha guanyat");
								partida=true;
							}
						}
						for(int x=0;x<3;x++){										//verifica verticals 
							acuguanya=0;
							for(int y=0;y<3;y++){
								if(joc[y][x]=="O"){
									acuguanya++;
								}
							}
							if(acuguanya>2){
								x=3;
								guanya=true;
								System.out.println("La Màquina  ha guanyat");
								partida=true;
							}
						}
						if(joc[0][0]=="O" && joc[1][1]=="O" && joc[2][2]=="O" ){	//diagonal 1	
							guanya=true;
							System.out.println("La Màquina  ha guanyat");
							partida=true;
						}
						if(joc[0][2]=="O" && joc[1][1]=="O" && joc[2][0]=="O" ){	//diagonal 2
							guanya=true;
							System.out.println("La Màquina  ha guanyat");
							partida=true;
						}
						else{
							System.out.println("s'ha acabat el torn del jugador O");
							guanya=true;
						}
					}
				}
			}
			if(option==3){
				System.out.println("s'ha sortit del programa");
			}
			if(option<1 || option>3){
				System.out.println("has pitjat una opcció incorrecta, torna-hi");
			}
		}
	}
}