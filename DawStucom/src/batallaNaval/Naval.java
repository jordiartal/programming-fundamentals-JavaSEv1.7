package batallaNaval;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Naval {
	private static int x = 0;
	private static int y = 0;
	private static int orient = 0;
	private static String tipus = "";
	private static String[][] tauler = new String [10][10];
	private static String[][] posicions = new String [12][12];
	public static void main (String[] args) throws IOException{
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		int menu=0;
		inicia(tauler,posicions);
		while(menu!=4){
			System.out.println();
			System.out.println(" ____________________________ ");
			System.out.println("|_______Batalla Naval________|");
			System.out.println("|                            |");
			System.out.println("|[1] - Fes Trampa!!!         |");
			System.out.println("|[2] - Re-inicia tauler      |");
			System.out.println("|[3] - Jugar                 |");
			System.out.println("|[4] - Sortir                |");
			System.out.println("|____________________________|");
			System.out.println("Escull la opció:");
			String Smenu=teclado.readLine();
			menu=Integer.parseInt(Smenu);
			if(menu<0 || menu>4){								//comproba que s'introdueix el num de menu correctament
				System.out.println("Escull una opció correcta");	
			}
			if(menu==1){										//mostra array de posicions
				trampa();
			}
			if(menu==2){
				inicia(tauler,posicions);
				System.out.println("s'ha reiniciat");
			}
			if(menu==3){										//es juga la partida
				System.out.println("Es comença la partida");
				partida();
			}
			if(menu==4){
				System.out.println("Se surt del programa");
			}
			
		}
	}
	static void inicia(String[][]tauler,String[][]posicions){  	//inicia 2 arrays 1 tauler de joc+ocult posicions 
		int vaixell=5; boolean grabat=false, validat=false, random=false;
		System.out.println("iniciant posicions...");
		System.out.println("");
		for(int x=0;x<10;x++){							//s'omple array del tauler amb "*"
			for(int y=0; y<10;y++){						
				tauler[x][y]="*";	
			}
		}
		for(int x=0;x<12;x++){							//s'omple array de posicions amb "~" y "@"
			for(int y=0; y<12;y++){						
				if((x==0 ||x==11) || (y==11 || y==0)){
					posicions[x][y]="@";
				}
				else{
				posicions[x][y]="~";
				}
			}
		}
													
		while(vaixell>1){										//bucle de crear el vaixell de 5 a 2 posicions
			if(vaixell==5){tipus="5";}
			if(vaixell==4){tipus="4";}
			if(vaixell==3){tipus="3";}
			if(vaixell==2){tipus="2";}
			grabat=false; 
			while(grabat!=true){								//genera everifica+graba
				validat=false; random=false; int acum=0;
				while(random!=true && validat!=true){			//1er filtre validacio del·random·de posicio + 2on filtre validacio·validat·que no hi hagi altres vaixells aprop
					x=((int) Math.floor(Math.random()*10))+1;
					y=((int) Math.floor(Math.random()*10))+1;
					orient=(int) Math.floor(Math.random()*2); //variable orientacio= 1 horitzontal, 0 vertical
					
					if((orient==0 && (x+vaixell)<11)||(orient==1 && (y+vaixell)<11)){	
						random=true; 				//situació en que es valida
					}						
					
					if(orient==0 && random==true){	//verifica els vaixells vertical
						acum=0;							
						for(int j=(x-1);j<(x+vaixell+1);j++){
							for(int i=(y-1);i<(y+2);i++){
								if(posicions[j][i]=="@" || posicions[j][i]=="~"){		//situació en que es valida
									acum++;
								}
							}
						}
						
						if(acum==((vaixell+2)*3)){
							validat=true;
							System.out.println("validacio 2 vertical ok "+vaixell);	
						}
						System.out.println("validacio acum vertical"+acum+" "+vaixell);
					}
					
					if(orient==1 && random==true){	//verifica els vaixells horitzontal
						acum=0;
						for(int i=(y-1);i<(y+vaixell+1);i++){
							for(int j=(x-1);j<(x+2);j++){
								if(posicions[j][i]=="@" || posicions[j][i]=="~"){		//situació en que es valida
									acum=acum+1;
								}
							}
						}
						
						if(acum==((vaixell+2)*3)){
							validat=true;
							System.out.println("validacio 2 horitzontal ok "+vaixell);
						}
						System.out.println("validacio acum horit. "+acum+" "+vaixell);
					}
				}
				if(validat==true){								//si les 2 validacions ok, llavors graba
					for(int i=0; i<vaixell; i++){
						posicions[x][y]=tipus;						
						if(orient==0){							//per als horitzontals
							x++;
						}
						if(orient==1){							//per als verticals
							y++;
						}
					}
					grabat=true;
					System.out.println("grabacio ok "+vaixell);
				}
			}
			vaixell--;
		}
	}
	static void partida() throws IOException{
		boolean partida=false , tirada=false, posic=false; 
		int torns=1, punts=0, casella1a=0, casella2a=0;
		
		while(partida==false){							//bucle per als torns del joc
			System.out.print("    [0]  [1]  [2]  [3]  [4]  [5]  [6]  [7]  [8]  [9]");
			System.out.println();
			System.out.println();
			int cuadre=0;
			for(int i=0;i<10;i++){							//es mostra el tauler de joc
				
				System.out.print("["+cuadre+"]");
				for(int j=0; j<10;j++){						
					System.out.print("  "+tauler[i][j]+"  ");	
				}
				System.out.println();
				System.out.println();
				cuadre++;
			}
			posic=false; tirada=false;
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("torn "+torns+", punts: "+punts+". Digues la casella format num,num:");
			String jugada=teclado.readLine();
	
			int casella1=(Integer.parseInt(jugada.substring(0, 1)));
			int casella2=(Integer.parseInt(jugada.substring(2, 3)));
			casella1a=casella1+1; casella2a=casella2+1;		
			
			if(casella1<0 || casella1>9 ||	casella2<0 || casella2>9){ //comproba tirada incorrecte
				System.out.println("casella incorrecte, torna a tirar");
			}
			
			if(casella1>-1 || casella1<10 || casella2>-1 || casella2<10){ //verifica tirada correcte
				posic=true;
			}
			
			if(tauler[casella2][casella1]=="*" && posic==true){		//si la tirada ja s'ha fet, es repeteix
				System.out.println("casella correcte, a veure que hi ha... en "+jugada);
				tirada=true;
			}
						
			if(tirada==true){	//si es correcte entra en les altre verificacions
		
				if(posicions[casella2a][casella1a]=="5" || posicions[casella2a][casella1a]=="4" || posicions[casella2a][casella1a]=="3" || posicions[casella2a][casella1a]=="2"){
					tauler[casella2][casella1]="B";										//la casella está ocupada per un vaixell, "A" + es puntua i s'vança un torn
					System.out.println("TOCAT!!!");
					punts++;
					torns++;
				}
				if(posicions[casella2a][casella1a]=="~"){								//la casella está buida,"B" + s'avança un torn 
					tauler[casella2][casella1]="A";	
					System.out.println("AIGUA!!!");
					torns++;
				}

			}
			if(torns==50 || punts==14){						//si se supera el torn 50 s'caba la partida o si es fan + de 14 punts
				System.out.println("S'ha acabat la partida");
				System.out.println("has fet "+punts+" punts, durant "+torns+" torns.");
				partida=true;
			}
		}
	}
	static void trampa(){
		for(int x=0;x<12;x++){							//per a les x's
			for(int y=0; y<12;y++){						//per a les y's
				System.out.print("  "+posicions[x][y]+"  ");	
			}
			System.out.println();
			System.out.println();
		}
	}
}