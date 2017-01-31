package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex12 {
	public static void main (String[] args){
		try{
			//simula un caixer automatic, el caixer disposa de monedes 1,5,25,50,100,500$
			//inicialment el caixer te 100 monedes de cada tipus
			//dona el canvi just, no pot donar més diners dels que té
			//te un menú amb 3 opcions: demanar diners, veure l'estat, sortir
			
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));			
			int total=0,menu=0,extreu=0,parcial1,parcial2,parcial3,parcial4,parcial5,parcial6,conta=0;
			int caixer[][]=new int [2][6];
			caixer[1][0]=1;
			caixer[1][1]=5;
			caixer[1][2]=25;
			caixer[1][3]=50;
			caixer[1][4]=100;
			caixer[1][5]=500;

			
			for(int y=0;y<6;y++){
				caixer[0][y]=100;
			}
			total=(1+5+25+50+100+500)*100;
			System.out.println("HI HA "+total+"€ EN EL CAIXER AL COMENÇAR");
			
			while (menu!=3){
				System.out.println();
				System.out.println("====CAIXER AUTOMATIC====");
				System.out.println("1.TREURE DINERS");
				System.out.println("2.VEURE L'ESTAT");
				System.out.println("3.SORTIR");
				System.out.println("========================");
				System.out.println();
				
				String smenu=teclado.readLine();
				menu = Integer.parseInt(smenu);
				
				if (menu==1){
					System.out.println("DIGUES LA CUANTITAT A EXTREURE");
					String sextreu=teclado.readLine();
					extreu = Integer.parseInt(sextreu);
					
					//es compara la xifra amb el que queda
					if ((total-extreu)<0){
						System.out.println("NO QUEDEN DINERS AL CAIXER");
					}
					if ((total-extreu)>0){
						System.out.println("ES PROCEDEIX A DONAR L'IMPORT");
						
						parcial1=(extreu/500);
						if((caixer[0][5]-parcial1)>0){
							caixer[0][5]=caixer[0][5]-parcial1;
							conta=extreu-parcial1*500;
							System.out.println(parcial1+" :bitllets 500 "+conta+" :queda per donar "+caixer[0][5]+" billets que queden");
						}

						parcial2=(conta/100);
						if((caixer[0][4]-parcial2)>0){
							caixer[0][4]=caixer[0][4]-parcial2;
							conta=extreu-(parcial1*500)-(parcial2*100);
							System.out.println(parcial1+" :bitllets 500 "+conta+" :queda per donar "+caixer[0][4]+" billets que queden");	
						}
						
						parcial3=(conta/50);
						if((caixer[0][3]-parcial3)>0){
							
							caixer[0][3]=caixer[0][3]-parcial3;
							conta=extreu-(parcial1*500)-(parcial2*100)-(parcial3*50);
							System.out.println(parcial1+" :bitllets 500 "+conta+" :queda per donar "+caixer[0][3]+" billets que queden");								
						}

						parcial4=(conta/25);
						if((caixer[0][2]-parcial4)>0){
							
							caixer[0][2]=caixer[0][2]-parcial4;
							conta=extreu-(parcial1*500)-(parcial2*100)-(parcial3*50)-(parcial4*25);
							System.out.println(parcial1+" :bitllets 500 "+conta+" :queda per donar "+caixer[0][2]+" billets que queden");
						}

						parcial5=(conta/5);
						if((caixer[0][1]-parcial5)>0){
							
							caixer[0][1]=caixer[0][1]-parcial5;
							conta=extreu-(parcial1*500)-(parcial2*100)-(parcial3*50)-(parcial4*25)-(parcial5*5);
							System.out.println(parcial1+" :bitllets 500 "+conta+" :queda per donar "+caixer[0][1]+" billets que queden");
						}

						parcial6=(conta);
						if((caixer[0][0]-parcial6)>0){
							
							caixer[0][0]=caixer[0][0]-parcial6;
							conta=extreu-(parcial1*500)-(parcial2*100)-(parcial3*50)-(parcial4*25)-(parcial5*5)-(parcial6*1);
							System.out.println(parcial1+" :bitllets 500 "+conta+" :queda per donar "+caixer[0][0]+" billets que queden");
						}
					}
				}
				if (menu==2){
					System.out.println("hi ha "+(caixer[0][0])+" monedes de 1");
					System.out.println("hi ha "+(caixer[0][1])+" monedes de 5");
					System.out.println("hi ha "+(caixer[0][2])+" monedes de 25");
					System.out.println("hi ha "+(caixer[0][3])+" monedes de 50");
					System.out.println("hi ha "+(caixer[0][4])+" monedes de 100");
					System.out.println("hi ha "+(caixer[0][5])+" monedes de 500");
					System.out.println("QUEDEN "+((caixer[0][0]*1)+(caixer[0][1]*5)+(caixer[0][2]*25)+(caixer[0][3]*50)+(caixer[0][4]*100)+(caixer[0][5]*500))+"€");	
				}
				if (menu==3){
					System.out.println("ES FINALITZA EL PROGRAMA");
				}
			}//tanca menu while
		}//tanca try-catch	
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}