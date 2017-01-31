package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex11 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int menu=0,dia=0,mes=0,any=0,dia1=0,mes1=0,any1=0,dia2=0,mes2=0,any2=0;
			int compa=0;
			GregorianCalendar data = new GregorianCalendar();
			dia=data.get(Calendar.DAY_OF_MONTH);
			mes=data.get(Calendar.MONTH)+1;
			any=data.get(Calendar.YEAR);
									
			while (menu!=6){
				System.out.println();
				System.out.println("Marca l'opció que necesitis:");
				System.out.println("1.Mostra la data actual");
				System.out.println("2.Mostra només el DIA actual");
				System.out.println("3.Mostra el MES actual");
				System.out.println("4.Mostra el ANY actual");
				System.out.println("5.Compara 2 dates");
				System.out.println("6.Sortida");
				System.out.println();
				
				String smenu=teclado.readLine();
				menu = Integer.parseInt(smenu);
				
				if(menu==1){
					System.out.println(dia+"/"+mes+"/"+any);
				}
				
				if(menu==2){
					System.out.println("avui es dia "+dia);
				}
				
				if(menu==3){
					System.out.println("el mes actual es el "+mes);
				}
				
				if(menu==4){
					System.out.println("l'any actual es el "+any);
				}
				
				if(menu==5){
					System.out.println("digues el dia de la primera data");
					String sdia1=teclado.readLine();
					dia1 = Integer.parseInt(sdia1);
					System.out.println("digues el mes de la primera data");
					String smes1=teclado.readLine();
					mes1 = Integer.parseInt(smes1);
					System.out.println("digues el any de la primera data");
					String sany1=teclado.readLine();
					any1 = Integer.parseInt(sany1);
					GregorianCalendar data1 = new GregorianCalendar(any1, mes1, dia1);
					
					System.out.println("digues el dia de la segona data");
					String sdia2=teclado.readLine();
					dia2 = Integer.parseInt(sdia2);
					System.out.println("digues el mes de la segona data");
					String smes2=teclado.readLine();
					mes2 = Integer.parseInt(smes2);
					System.out.println("digues el any de la segona data");
					String sany2=teclado.readLine();
					any2 = Integer.parseInt(sany2);
					GregorianCalendar data2 = new GregorianCalendar(any2, mes2, dia2);
					
					compa=data1.compareTo(data2);
					
					if (compa < 0){
						System.out.println("data1 es menor que data2");	
					}
					if (compa > 0){
						System.out.println("data2 es menor que data1");
					}
				}
				
				if(menu>6){
					System.out.println("l'opció es incorrecte, torna-hi");
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}

