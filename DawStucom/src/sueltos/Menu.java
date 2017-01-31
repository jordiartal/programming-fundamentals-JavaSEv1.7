package sueltos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Menu {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//extraiem les dades inicials (nom, cognom, any, nota1 mitja)
			System.out.println("digues el teu nom");
			String nom1=teclado.readLine();

			System.out.println("digues els teus cognoms");
			String cogn1=teclado.readLine();

			System.out.println("digues el teu any de naixement");
			String any1=teclado.readLine();
			int intany1=Integer.parseInt(any1);

			System.out.println("Digues la teva nota mitja del cicle");
			String nota1str=teclado.readLine();
			float nota1=Float.parseFloat(nota1str);

			//tenim les variables: nom1,nom2,nom3,cogn1,cogn2,cogn3,nota1,nota2,nota3, per a treballar 
			//i menu per a les opcions del menu
			int menu = 0;
			String nom2 = " ";
			String nom3 = " ";
			String cogn2 = " ";
			String cogn3 = " ";
			float nota2 = 0;
			float nota3 = 0;
			float mitja = 0;

			while (menu != 7){

				System.out.println("");
				System.out.println("=======================================================================================");
				System.out.println("1.Mostra Nom i cognom complets.");
				System.out.println("2.Mostra Edat i si ets major d'edat.");
				System.out.println("3.Mostra la nota mitjana del cicle i quina classificaci� �s.");
				System.out.println("4.Demana la nota de dos companys m�s del cicle, i mostra quina �s la nota mitja de tots tres, quina �s la nota m�s alta i quina �s la nota m�s baixa.");
				System.out.println("5.Mostra la seg�ent informaci�: Nombre de car�cters que t� el nom, mostrar la inicial del nom, i mostrar la inicial del cognom.");
				System.out.println("6.Demanar el nom i el cognom de dos companys del cicle (per separat), i informar si hi ha alg�n nom igual, i ordenar alfab�ticament, primer els noms, i despr�s els cognoms.");
				System.out.println("7.Sortir del programa.");
				System.out.println("=======================================================================================");
				System.out.println("");

				String mstr=teclado.readLine();
				menu=Integer.parseInt(mstr);

				if(menu==1){	
					System.out.println("El teu nom �s "+nom1+" "+cogn1);
				}
				if(menu==2){
					int edat=2013-intany1;
					System.out.println("La teva edat �s "+edat+" anys");
					if(edat>=18){
						System.out.println("i ets major d'edat");
					}
					if(edat<18){
						System.out.println("i ets menor d'edat");
					}
				}
				if(menu==3){
					if(nota1<5){
						System.out.println("tens un susp�s, doncs la teva nota �s "+nota1);
					}
					if(nota1>=5 && nota1<6){
						System.out.println("tens un suficient, doncs la teva nota �s "+nota1);
					}
					if(nota1>=6 && nota1<7){
						System.out.println("tens un b�, doncs la teva nota �s "+nota1);
					}
					if(nota1>=7 && nota1<9){
						System.out.println("tens un nota1ble, doncs la teva nota �s "+nota1);
					}
					if(nota1>=9 && nota1<=10){
						System.out.println("tens un excelent, doncs la teva nota �s "+nota1);
					}
				}
				if(menu==4){
					System.out.println("Digues la nota mitja del cicle del company 1");
					String nota2str=teclado.readLine();
					nota2=Float.parseFloat(nota2str);

					System.out.println("Digues la nota mitja del cicle del company 2");
					String nota3str=teclado.readLine();
					nota3=Float.parseFloat(nota3str);

					mitja=(nota1+nota2+nota3)/3;

					//la nota mes alta
					//System.out.println("notasssss" + nota1 + " " +  nota2 + " " + nota3);

					if (nota1>nota2 && nota1>nota3){
						System.out.println("la nota de "+nom1+" �s la m�s alta, t� un "+nota1);
					}
					if (nota2>nota1 && nota2>nota3){
						System.out.println("la nota de "+nom2+" �s la m�s alta, t� un "+nota2);
					}
					if (nota3>nota2 && nota3>nota1){
						System.out.println("la nota de "+nom3+" �s la m�s alta, t� un "+nota3);
					}

					//la nota mes baixa

					if (nota1<nota2 && nota1<nota3){
						System.out.println("la nota de "+nom1+" �s la m�s baixa, t� un "+nota1);
					}
					if (nota2<nota1 && nota2<nota3){
						System.out.println("la nota de "+nom2+" �s la m�s baixa, t� un "+nota2);
					}
					if (nota3<nota2 && nota3<nota1){
						System.out.println("la nota de "+nom3+" �s la m�s baixa, t� un "+nota3);
					}
					//else {
					//	System.out.println("hi ha dues notes iguals");
					//}
					System.out.println("i la nota mitja de tots tres �s "+mitja);
					System.out.println("");
				}
				if(menu==5){
					System.out.println("el teu nom t� "+(nom1.length())+" car�cters");
					System.out.println("la primera inicial del teu nom �s "+(nom1.substring(0,1)) );
					System.out.println("la primera inicial del teu cognom �s "+(cogn1.substring(0,1)) );
				}
				if(menu==6){

					System.out.println("Digues el nom del company 1");
					nom2=teclado.readLine();
					System.out.println("Digues el cognom del company 1");
					cogn2=teclado.readLine();

					System.out.println("Digues el nom del company 2");
					nom3=teclado.readLine();
					System.out.println("Digues el cognom del company 2");
					cogn3=teclado.readLine();

					//noms iguals
					if ((nom1.equals(nom2)) || (nom1.equals(nom3)) || (nom2.equals(nom3))){
						System.out.println("hi ha dos noms iguals");
					}

					//alfabeticament noms
					int comp1 = nom1.compareTo(nom2);
					int comp2 = nom1.compareTo(nom3);
					int comp3 = nom2.compareTo(nom3);

					if(comp1>0 && comp2>0 && comp3>0){
						System.out.println(nom3+","+nom2+","+nom1);
					}
					if(comp1<0 && comp2>0 && comp3>0){
						System.out.println(nom3+","+nom1+","+nom2);
					}
					if(comp1<0 && comp2<0 && comp3>0){
						System.out.println(nom1+","+nom3+","+nom2);
					}
					if(comp1<0 && comp2<0 && comp3<0){
						System.out.println(nom1+","+nom2+","+nom3);
					}
					

					//cognoms iguals
					if ((cogn1.equals(cogn2)) || (cogn1.equals(cogn3)) || (cogn2.equals(cogn3))){
						System.out.println("hi ha dos cognoms iguals");
					}

					//alfabeticament els cognoms
					int comp4 = cogn1.compareTo(cogn2);
					int comp5 = cogn1.compareTo(cogn3);
					int comp6 = cogn2.compareTo(cogn3);

					if(comp4>0 && comp5>0 && comp6>0){
						System.out.println(cogn3+","+cogn2+","+cogn1);
					}
					if(comp4<0 && comp5>0 && comp6>0){
						System.out.println(cogn3+","+cogn1+","+cogn2);
					}
					if(comp4<0 && comp5<0 && comp6>0){
						System.out.println(cogn1+","+cogn3+","+cogn2);
					}
					if(comp4<0 && comp5<0 && comp6<0){
						System.out.println(cogn1+","+cogn2+","+cogn3);
					}
				}

				if(menu>7){
					System.out.println("Has pijat una opci� incorrecta");
				}
				
			}
		}

			catch(Exception e){
				System.out.println("hi ha un error");
			}
		}
	}