package sueltos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bicicleta {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int pbici=0,pmono=0,option=4,tipu=0,quan=0,conta1=0,conta2=0,uni1=0,uni2=0,ing1=0,ing2=0;
			boolean control=false;
			ArrayList<Integer>vendes1=new ArrayList<Integer>();
			ArrayList<Integer>vendes2=new ArrayList<Integer>();
						
			//INTRODUCCIÓ PREUS
			
			System.out.println("INTRODUEIX EL PREU PER A LES BICIS:");
			while (control==false){
			String Spbici=teclado.readLine();
			pbici=Integer.parseInt(Spbici);
				if((pbici>199)&&(pbici<1001)){
					control=true;
				}
				if((pbici<200)||(pbici>1000)){
					System.out.println("el preu és incorrecte, torna-hi");
				}
			}
			
			control=false;
			System.out.println("INTRODUEIX EL PREU PER ALS MONOPATINS:");
			while (control==false){
				String Spmono=teclado.readLine();
				pmono=Integer.parseInt(Spmono);
					if((pmono>19)&&(pmono<151)){
						control=true;
					}
					if((pmono<20)||(pmono>150)){
						System.out.println("el preu és incorrecte, torna-hi");
					}
			}
			
			//MENU
			
			while(option!=0){
			System.out.println("***** EXTREME-STUCOM S.A. *****");
			System.out.println("-------------------------------");
			System.out.println("");
			System.out.println("ESCULL L'OPCIÓ:");
			System.out.println("[1] - REGISTRAR VENDES");
			System.out.println("[2] - ESTADISTIQUES");
			System.out.println("[3] - REINICIAR");
			System.out.println("[0] - SORTIR");
			
			String Soption=teclado.readLine();
			option=Integer.parseInt(Soption);
			//REGISTREM VENDES
			
				//INTRODUIR TIPUS DE VENDA
			
				if (option==1){
				control=false;
				while (control==false){
					System.out.println("INTRODUEIX CODI DE PRODUCTE[1]BICI[2]MONOPATÍ");
					System.out.println("SI INTRODUEIXES '-1' ES TORNA AL MENU");
					String Stipu=teclado.readLine();
					tipu=Integer.parseInt(Stipu);
					if((tipu<1)||(tipu>2)){
						System.out.println("DIGUES EL TIPUS DE PRODUCTE CORRECTE!!!");
					}
					if(tipu==-1){
						control=true;
					}
					if(tipu==1){
						System.out.println("INTRODUEIX LA CUANTITAT DE BICIS");
						String Squan=teclado.readLine();
						quan=Integer.parseInt(Squan);
						vendes1.add(conta1,quan);
						uni1=uni1+quan;
						ing1=ing1+(quan*pbici);
					conta1++;
					}
					if(tipu==2){
						System.out.println("INTRODUEIX LA CUANTITAT DE MONOPATINS");
						String Squan=teclado.readLine();
						quan=Integer.parseInt(Squan);
						vendes2.add(conta2,quan);
						uni2=uni2+quan;
						ing2=ing2+(quan*pmono);
					conta2++;
					}
				}
			}
			//ESTADISTIQUES
			
				if (option==2){
					System.out.println("	CLIENTES	UNIDADES	INGRESOS");
					System.out.println("BICIS		"+conta1+"	"+uni1+"	"+ing1);
					System.out.println("MONOP		"+conta2+"	"+uni2+"	"+ing2);			
				}
			
			//REINICIAR
			
				if (option==3){
					vendes1.clear();
					vendes2.clear();
					System.out.println("s'han buidat les vendes");
				}

			//SORTIDA
			
				if (option==0){
				System.out.println("PROGRAMA FINALITZAT");
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}