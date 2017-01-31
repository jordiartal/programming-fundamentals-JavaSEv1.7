package exercicis;
//Escriure un programa en Java que llegeixi per teclat 30 caràcters seguits que emmagatzemareu en un array i després els posi en un array. 
//El programa haurà de comptar el nombre de vocals que té l’array, indicant el nombre de lletres de cada tipus (nombre de as, nombre de es...).

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex49 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			char[] carac;
			String str;
			int vocal=0;
			int a=0;
			int e=0;
			int is=0;
			int o=0;
			int u=0;
			int i=0;
						
			//recollim els nombres
			System.out.println("inserta les dades");
			str=teclado.readLine();

			//pasem el string a array
			carac=str.toCharArray();
					
			//comptar les vocals
			for(i=0;i<carac.length;i++){
				if(carac[i]=='a'){ 
					vocal++;
					a++;
					}
				if(carac[i]=='e'){ 
					vocal++;
					e++;
					}
				if(carac[i]=='i'){ 
					vocal++;
					is++;
					}
				if(carac[i]=='o'){ 
					vocal++;
					o++;
					}
				if(carac[i]=='u'){ 
					vocal++;
					u++;
					}
			}
			System.out.println("hi ha "+vocal+" vocals ," +"a's:"+a+"," +"e's:"+e+"," +"i's:"+is+"," +"o's:"+o+"," +"u's:"+u);
			
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}