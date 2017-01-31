package exercicis;
//Escriure un programa en Java que llegeixi per teclat una frase o conjunt de paraules. 
//Cadascuna de les lletres haurà d’estar emmagatzemada en una posició de l’array. 
//El programa serà un cercador: Haurà de cercar una paraula que introduirà l’usuari per teclat, 
//i indicar per pantalla si s’ha trobat aquella paraula o no.
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ex50 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			//declarem variables
			int i=0;
			int j=0;
			int k=0;
			int llarg=0;
			int llarg2=0;			
			int pos=0;
			boolean trobat=false;
			char[]dicci; 
			char[]cerca;

			//insertem les dades
			System.out.println("inserta les dades");
			String str=teclado.readLine();
			dicci=str.toCharArray();

			//ara preguntem que vol cercar
			System.out.println("que vols cercar?");
			String str2=teclado.readLine();
			cerca=str2.toCharArray();

			//ara ho busquem, extraiem la llargada de "cerca" y de dicci
			//fem un cerca de la primera posició de cerca en dicci, si ho trobem, s'ha d'extreure des d'aquella posició+length
			//i grabar en un array nou, es compara amb el equals, si no es correcte, segueix el bucle, 
			//si es correcte s'emmagatzema en una variable a utilitzar en l'apartat de resultats

			llarg=cerca.length;
			llarg2=dicci.length;
			char[]busca=new char [llarg];
			
			//a la primera coincidència surt del bucle,
			
			for(j=0;j<llarg2;j++){
				if(cerca[i]==dicci[j]){
					pos=j;
					for(k=0;k<llarg;k++){
						busca[k]=dicci[pos];
						pos++;		
					}
					if(Arrays.equals(cerca,busca)==true){
						j=llarg2;
						trobat=true;
					}
				}
			}
				
			if(trobat==true){
				System.out.println("s'ha trobat una coincidencia");
			}
			if(trobat==false){
				System.out.println("no hi ha cap coincidència");
			}

		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}