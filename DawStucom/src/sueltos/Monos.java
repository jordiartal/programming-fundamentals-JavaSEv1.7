package sueltos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Monos {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int option=4;
			int files=0,tipo=0,edat=0,pes=0,x=0,y=0;
			int i=1;
			int cvell=0,gvell=0,cjove=900,gjove=900,cemig=0,gemig=0,cpmig=0,gpmig=0;
			
			//crea array
			int[][]monos=new int[50][3];
			
			while (option!=0){
				
				//menu principal
				System.out.println("");
				System.out.println("========================");
				System.out.println("*****MENU PRINCIPAL*****");
				System.out.println("========================");
				System.out.println("[1] - REGISTRAR INGRESOS");
				System.out.println("[2] - ESTADISTIQUES");
				System.out.println("[3] - INICIALITZAR");
				System.out.println("[0] - SORTIR");
				System.out.println("ESCULL UNA OPCIÓ:");
				String Soption=teclado.readLine();
				option=Integer.parseInt(Soption);
				
				if(option>3){
					System.out.println("Introdueix una tecla válida");
					System.out.println("del 0 al 3");
					System.out.println("========================");
				}
							
				if(option==1){				
					
					//demanem cantitat registres					
					System.out.println("QUANTS REGISTRES VOLS INTRODUIR?");
					String Sfiles=teclado.readLine();
					files=Integer.parseInt(Sfiles);
					
					//introducció de registres, en bucle while per cada registre,							
						while(x<files){
							//tipus
							i=1;
							while(i!=0){
								System.out.println("TIPUS DE SIMI: 1(CHIMPANCE) - 2(GORILA)");
								String Stipo=teclado.readLine();
								tipo=Integer.parseInt(Stipo);
								if(tipo!=1 && tipo!=2){
									System.out.println("es incorrecte, pitja 1 o 2");
								}
								if(tipo==1 || tipo ==2){
									monos[x][0]=tipo;
									i=0;
								}
							}
							//edat
							i=1;
							while(i!=0){
								System.out.println("INTRODUEIX EDAT");
								String Sedat=teclado.readLine();
								edat=Integer.parseInt(Sedat);
								
								if((tipo==1 && edat<0) && (tipo==1 && edat>50)){
									System.out.println("l'edat erronia, entre 0 y 50");
								}
								if((tipo==2 && edat<0) && (tipo==2 && edat>40)){
									System.out.println("l'edat erronia, entre 0 y 40");
								}
								if((tipo==1 && edat>0) && (tipo==1 && edat<51)){
									System.out.println("l'edat correcte, s'anota");
									monos[x][1]=edat;
									i=0;
								}
								if((tipo==2 && edat>0) && (tipo==2 && edat<40)){
									System.out.println("l'edat correcte, s'anota");
									monos[x][1]=edat;
									i=0;
								}
								
							}
							//pes
							System.out.println("INTRODUEIX PES");
							String Spes=teclado.readLine();
							pes=Integer.parseInt(Spes);
							monos[x][2]=pes;
						x++;
					}
				
				}
							
				if(option==2){
					//estadistiques chimpance
					System.out.println("");
					System.out.println("========================");					
					
					//VELL
					i=1;
					while(i!=0){
						for(x=0;x<files;x++){
							if(monos[x][0]==1){
								if(monos[x][1] > cvell){
								cvell=monos[x][1];
								}
							}
						}
					i=0;
					}
					System.out.println("CHIMPANCE MÉS VELL "+cvell+" anys");
					i=1;
					
					//JOVE
					while(i!=0){
						for(x=0;x<files;x++){
							if (monos[x][0]==1){
								if (monos[x][1] < cjove){
								cjove=monos[x][1];
								}
							}
						}
					i=0;
					}
					System.out.println("CHIMPANCE MÉS JOVE "+cjove+" anys");
					i=1;
					
					//EDAT MITJA
					while(i!=0){
						for(x=0;x<files;x++){
							if (monos[x][0]==1){
								for(x=0;x<files;x++){
									cemig=monos[x][1]+cemig;
								}
							}
						i=0;
						}
					}
					cemig=cemig/files;
					System.out.println("EDAT MITJA CHIMPANCES és "+cemig+" Anys");
					
					//PES MIG
					i=1;
					while(i!=0){
						for(x=0;x<files;x++){
							if (monos[x][0]==1){
								for(x=0;x<files;x++){
									cpmig=monos[x][2]+cpmig;
								}
							}
						i=0;
						}
					}
					cpmig=cpmig/files;
					System.out.println("PES MIG CHIMPANCES és "+cpmig+" Kg.");				
					System.out.println("========================");
					
					//estadistiques GORIL·LA
					System.out.println("");
					System.out.println("========================");					
					
					//VELL
					i=1;
					while(i!=0){
						for(x=0;x<files;x++){
							if(monos[x][0]==2){
								if(monos[x][1] > gvell){
								gvell=monos[x][1];
								}
							}
						}
					i=0;
					}
					System.out.println("goril·la MÉS VELL "+gvell+" anys");
					i=1;
					
					//JOVE
					while(i!=0){
						for(x=0;x<files;x++){
							if (monos[x][0]==2){
								if (monos[x][1] < gjove){
								gjove=monos[x][1];
								}
							}
						}
					i=0;
					}
					System.out.println("goril·la MÉS JOVE "+cjove+" anys");
					i=1;
					
					//EDAT MITJA
					while(i!=0){
						for(x=0;x<files;x++){
							if (monos[x][0]==2){
								for(x=0;x<files;x++){
									gemig=monos[x][1]+gemig;
								}
							}
						i=0;
						}
					}
					gemig=gemig/files;
					System.out.println("EDAT MITJA goril·la és "+gemig+" Anys");
					
					//PES MIG
					i=1;
					while(i!=0){
						for(x=0;x<files;x++){
							if (monos[x][0]==2){
								for(x=0;x<files;x++){
									gpmig=monos[x][2]+gpmig;
								}
							}
						i=0;
						}
					}
					gpmig=gpmig/files;
					System.out.println("PES MIG goril·la és "+gpmig+" Kg.");
					
					System.out.println("========================");
										
				}
				if(option==3){
					//resetejar valors a 0
					while(y<3){
						for (x=0;x<files;x++){
							monos[x][y]=0;
						}
					y++;
					}
				}			
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}