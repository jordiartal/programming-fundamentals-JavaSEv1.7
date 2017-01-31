package exercicis;
//Es demanen un dia, un mes i un any, 
//i el programa mostri per pantalla quin és el dia següent

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex40 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//es defineixen les variables i les preguntes a fer a l'usuari

			int noudia = 0;
			int noumes = 0;
			int nouany = 0;
			int dia = 0;
			int mes = 0;
			int any = 0;
			int mal = 0;
						
			while (dia>31 || dia==0 || dia<0){
			System.out.println("digues un dia");
			String str1=teclado.readLine();
			dia=Integer.parseInt(str1);
			}

			while(mes>12 || mes==0 || mes<0){
			System.out.println("digues un mes");
			String str2=teclado.readLine();
			mes=Integer.parseInt(str2);
			}

			System.out.println("digues un any");
			String str3=teclado.readLine();
			any=Integer.parseInt(str3);
		
			//si el dia introduït es el últim de mes s'ha de posar el 1er dia del mes seguent.
			if(dia == 30){
				switch(mes){
				case 4:
				case 6:
				case 9:
				case 11:
					noudia=1;
					noumes=mes+1;
					nouany=any;
				}
			}
			
			if(dia == 31){
				switch(mes){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					noudia=1;
					noumes=mes+1;
					nouany=any;
				}
			}
			
			//per als anys bisiestos dies 28
			if (dia==28 && mes==2){
				if ((any % 4 == 0) && !(any % 100 == 0) || (any % 400 == 0)){
					noudia = dia+1;
					noumes = mes;
					nouany = any;
				}
				else{
					noudia = 1;
					noumes = 3;
					nouany = any;
				}
			}

			//per als anys bisiestos dies 29
			if (dia==29 && mes==2){
				if ((any % 4 == 0) && !(any % 100 == 0) || (any % 400 == 0)){
					noudia = 1;
					noumes = 3;
					nouany = any;
				}
				else{
					mal = 1;
				}
			}
			
			//si el dia es el 31 de desembre, s'ha de posar el 1 de gener de l'any següent.
			if (dia ==31 && mes == 12){
				noudia = 1;
				noumes = 1;
				nouany = any+1;
			}
			
			//per als dies menors del 28 de qualsevol mes
			if (dia<28) {
				noudia = dia+1;
				noumes = mes;
				nouany = any;
			}

			//aquí es mostra el resultat			
			if(mal==1){
				System.out.println("no existeix el dia 29 de febrer del "+any);
			}
			if (noudia==0 || noumes==0 || nouany==0){
				System.out.println("has introduït un dia que no existeix");
			}
			else{
			System.out.println("el dia següent al que has dit es "+noudia+" del "+noumes+" de "+nouany);
			}

		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}