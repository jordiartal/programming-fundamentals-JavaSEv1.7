package sueltos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Portes {
	public static void main (String[] args) throws IOException{
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		int option=0,porta=0,encerts=0,vides=0,temps=0,partida=0,intents=0,level=0,t=0,y=0,z=0;
		long begin = 0, end=0;
		boolean guanya=false;
		boolean joc[][]=new boolean[3][3];
		String[][] jugadors = new String [5][6];
		String[][] results = new String [5][6];
		ArrayList<String>ordre=new ArrayList<String>(0);		
		while(option!=6){
			System.out.println();
			System.out.println(" ____________________________ ");
			System.out.println("|____________MENU____________|");
			System.out.println("|                            |");
			System.out.println("|[1] - Nivell Fàcil          |");
			System.out.println("|[2] - Nivell Mig            |");
			System.out.println("|[3] - Nivell Difícil        |");
			System.out.println("|[4] - Millors 5*num. intents|");
			System.out.println("|[5] - Millors 5*temps       |");
			System.out.println("|[6] - Sortir                |");
			System.out.println("|____________________________|");
			System.out.print("Escull la opció:");
			String Soption=teclado.readLine();
			option=Integer.parseInt(Soption);
			if(option<1 && option>6){
				System.out.println("Has pitjat una opció incorrecta, torna-hi");
			}
			//nivell facil
			if(option==1){
				inicia(joc);
				partida++;
				encerts=0;
				vides=5;
				intents=0;
				level=1;
				guanya=false;
				begin=System.currentTimeMillis();
				for(int x=0;x<3;x++){
					intents++;
					System.out.println();
					System.out.println("porta num"+x+": Escull la porta 0,1,2:");
					String Sporta=teclado.readLine();
					porta=Integer.parseInt(Sporta);
					if(porta>2){
						System.out.println();
						System.out.println("ERROR! introueix el nombre correcte: 0,1,2");
						x--;
					}
					if(porta<3 && porta>-1){
						if(joc[x][porta]==true){
							encerts++;
							System.out.println();
							System.out.println("l'has encertat, passes de nivell");
							if(x==2){
								guanya=true;
								System.out.println();
								System.out.println("...has guanyat!!! proba un altre nivell");	
							}
						}
						if(joc[x][porta]==false){
							vides--;
							x--;
							System.out.println();
							System.out.println("t'has equivocat, caus de nivell...et queden "+vides+" vides");
						}
						if(vides<=0){
							System.out.println();
							System.out.println("ja no et queden vides!!!...GAME OVER...");
							x=3;
						}
					}
				}
				end = System.currentTimeMillis();
				temps=((int) (end-begin))/1000;
				System.out.println();
				System.out.println("introdueix  el teu nom");
				String nom=teclado.readLine();		
				System.out.println();
				System.out.println("Resum de la partida");
				System.out.println("|nivell:"+level+"|partida:"+partida+"|nom:"+nom+"|intents:"+intents+"|encerts:"+encerts+"|temps:"+temps+"seg.");
				if(guanya==true && partida<6){
					jugadors[(partida-1)][0]=Integer.toString(level);
					jugadors[(partida-1)][1]=Integer.toString(partida);
					jugadors[(partida-1)][2]=nom;
					jugadors[(partida-1)][3]=Integer.toString(intents);
					jugadors[(partida-1)][4]=Integer.toString(encerts);
					jugadors[(partida-1)][5]=Integer.toString(temps);
				}
				if(partida>=6){
					System.out.println();
					System.out.println("No es poden grabar més partides");
				}
			}
			//nivell mig
			if(option==2){
				inicia(joc);
				partida++;
				encerts=0;
				vides=5;
				intents=0;
				level=2;
				guanya=false;
				begin=System.currentTimeMillis();
				for(int x=0;x<3;x++){
					intents++;
					System.out.println();
					System.out.println("porta num"+x+": Escull la porta 0,1,2:");
					String Sporta=teclado.readLine();
					porta=Integer.parseInt(Sporta);
					if(porta>2){
						System.out.println();
						System.out.println("ERROR! introueix el nombre correcte: 0,1,2");
						x--;
					}
					if(porta<3 && porta>-1){
						if(joc[x][porta]==true){
							encerts++;
							System.out.println();
							System.out.println("l'has encertat, passes de nivell");
							if(x==2){
								guanya=true;
								System.out.println();
								System.out.println("...has guanyat!!! proba un altre nivell");	
							}
						}
						if(joc[x][porta]==false){
							vides--;
							x--;
							inicia(joc);
							System.out.println();
							System.out.println("t'has equivocat, caus de nivell...et queden "+vides+" vides");
							System.out.println("i es resetejen TOTES les portes...");
						}
						if(vides<=0){
							System.out.println();
							System.out.println("ja no et queden vides!!!...GAME OVER...");
							x=3;
						}
					}
				}
				end = System.currentTimeMillis();
				temps=((int) (end-begin))/1000;
				System.out.println();
				System.out.println("introdueix  el teu nom");
				String nom=teclado.readLine();		
				System.out.println();
				System.out.println("Resum de la partida");
				System.out.println("|nivell:"+level+"|partida:"+partida+"|nom:"+nom+"|intents:"+intents+"|encerts:"+encerts+"|temps:"+temps+"seg.");
				if(guanya==true && partida<6){
					jugadors[(partida-1)][0]=Integer.toString(level);
					jugadors[(partida-1)][1]=Integer.toString(partida);
					jugadors[(partida-1)][2]=nom;
					jugadors[(partida-1)][3]=Integer.toString(intents);
					jugadors[(partida-1)][4]=Integer.toString(encerts);
					jugadors[(partida-1)][5]=Integer.toString(temps);
				}				
				if(partida>=6){
					System.out.println();
					System.out.println("No es poden grabar més partides");
				}
			}
			//nivell difícil
			if(option==3){
				inicia(joc);
				partida++;
				encerts=0;
				vides=5;
				intents=0;
				level=3;
				guanya=false;
				begin=System.currentTimeMillis();
				for(int x=0;x<3;x++){
					intents++;
					System.out.println();
					System.out.println("porta num"+x+": Escull la porta 0,1,2:");
					String Sporta=teclado.readLine();
					porta=Integer.parseInt(Sporta);
					if(porta>2){
						System.out.println();
						System.out.println("ERROR! introueix el nombre correcte: 0,1,2");
						x--;
					}
					if(porta<3 && porta>-1){
						if(joc[x][porta]==true){
							encerts++;
							System.out.println();
							System.out.println("l'has encertat, passes de nivell");
							if(x==2){
								guanya=true;
								System.out.println();
								System.out.println("...has guanyat!!! ja no pots pujar més de nivell");	
							}
						}
						if(joc[x][porta]==false){
							vides--;
							x=-1;
							inicia(joc);
							System.out.println();
							System.out.println("t'has equivocat, et queden "+vides+" vides");
							System.out.println("i es resetejen TOTES les portes...");
							System.out.println("i caus al nivell 0...");
						}
						if(vides<=0){
							System.out.println();
							System.out.println("ja no et queden vides!!!...GAME OVER...");
							x=3;
						}
					}
				}
				end = System.currentTimeMillis();
				temps=((int) (end-begin))/1000;
				System.out.println();
				System.out.println("introdueix  el teu nom");
				String nom=teclado.readLine();		
				System.out.println();
				System.out.println("Resum de la partida");
				System.out.println("|nivell:"+level+"|partida:"+partida+"|nom:"+nom+"|intents:"+intents+"|encerts:"+encerts+"|temps:"+temps+"seg.");
				if(guanya==true && partida<6){
					jugadors[(partida-1)][0]=Integer.toString(level);
					jugadors[(partida-1)][1]=Integer.toString(partida);
					jugadors[(partida-1)][2]=nom;
					jugadors[(partida-1)][3]=Integer.toString(intents);
					jugadors[(partida-1)][4]=Integer.toString(encerts);
					jugadors[(partida-1)][5]=Integer.toString(temps);
				}
				if(partida>=6){
					System.out.println();
					System.out.println("No es poden grabar més partides");
				}
			}
			//millors 5*num intents
			if(option==4){
				System.out.println();
				System.out.println("___Els 5 millors per intents___");
				for(int x=0;x<5;x++){
					for(y=0;y<6;y++){
						if(jugadors[x][y]==null){
							jugadors[x][y]="0";
						}
					}
					if(jugadors[x][3]!="0"){
						ordre.add(jugadors[x][3]);
					}
				}
				Collections.sort(ordre);
				for(int x=0;x<ordre.size();x++){					
					z=0;
					y=0;
					while(z!=Integer.MAX_VALUE){
						if(ordre.get(x).equals(jugadors[y][3])){
							results[x][0]=jugadors[y][0];
							results[x][1]=jugadors[y][1];
							results[x][2]=jugadors[y][2];
							results[x][3]=jugadors[y][3];
							results[x][4]=jugadors[y][4];
							results[x][5]=jugadors[y][5];
							jugadors[y][3]=jugadors[y][3]+" ";
							z=Integer.MAX_VALUE;
						}
						if(y<=5){
							y++;
						}
						if(y>5){
							z=Integer.MAX_VALUE;
						}
					}
				}
				for(int x=0;x<ordre.size();x++){
					System.out.println("|nivell:"+results[x][0]+"|partida:"+results[x][1]+"|nom:"+results[x][2]+"|intents:"+results[x][3]+"|encerts:"+results[x][4]+"|temps:"+results[x][5]+"seg.");
				}
				ordre.removeAll(ordre);
			}
			//millors 5*temps
			if(option==5){
				System.out.println();
				System.out.println("Els 5 millors per temps");
				for(int x=0;x<5;x++){
					for(y=0;y<6;y++){
						if(jugadors[x][y]==null){
							jugadors[x][y]="0";
						}
					}
					if(jugadors[x][5]!="0"){
						ordre.add(jugadors[x][5]);
					}
				}
				Collections.sort(ordre);
				for(int x=0;x<ordre.size();x++){					
					z=0;
					y=0;
					while(z!=Integer.MAX_VALUE){
						if(ordre.get(x).equals(jugadors[y][5])){
							results[x][0]=jugadors[y][0];
							results[x][1]=jugadors[y][1];
							results[x][2]=jugadors[y][2];
							results[x][3]=jugadors[y][3];
							results[x][4]=jugadors[y][4];
							results[x][5]=jugadors[y][5];
							jugadors[y][5]=jugadors[y][5]+" ";
							z=Integer.MAX_VALUE;
						}
						if(y<=5){
							y++;
						}
						if(y>5){
							z=Integer.MAX_VALUE;
						}
					}
				}
				for(int x=0;x<ordre.size();x++){
					System.out.println("|nivell:"+results[x][0]+"|partida:"+results[x][1]+"|nom:"+results[x][2]+"|intents:"+results[x][3]+"|encerts:"+results[x][4]+"|temps:"+results[x][5]+"seg.");
				}
				ordre.removeAll(ordre);
			}
			if(option==6){
				System.out.println();
				System.out.println("Se surt del programa");
			}
		}
	}
	static void inicia(boolean[][] inicial){
		for(int x=0;x<3;x++){
			for(int y=0;y<3;y++){
				inicial[x][y]=false;
			}	
		}
		for(int x=0;x<3;x++){
			int rand=(int) Math.floor(Math.random()*(3));
			inicial[x][rand]=true;
		}
		for(int x=0;x<3;x++){
			for(int y=0;y<3;y++){
				System.out.print(inicial[x][y]+" ");
			}
			System.out.println("");
		}
	}
}