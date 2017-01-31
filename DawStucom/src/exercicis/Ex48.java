package exercicis;
//Escriure un programa en Java que llegeixi per teclat 30 caràcters i els emmagatzemi en un array. 
//Cal que els 30 caràcters es recullin en una variable de tipus String, i convertiu l’String en un array de caràcters. 
//El programa haurà de comptar el nombre de vocals que té l’array.

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex48 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			char[] carac;
			String str;
			int vocal=0;
			int i=0;
						
			//recollim els nombres
			System.out.println("inserta les dades");
			str=teclado.readLine();

			//pasem el string a array
			carac=str.toCharArray();
					
			//comptar les vocals
			for(i=0;i<carac.length;i++){
				if(carac[i]=='a' || carac[i]=='e' || carac[i]=='i' || carac[i]=='o' || carac[i]=='u'){
					vocal++;
				}
			}
			System.out.println("hi ha "+vocal+" vocals a les dades que has insertat");
			
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}