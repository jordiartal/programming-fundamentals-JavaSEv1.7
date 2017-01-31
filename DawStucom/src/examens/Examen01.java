package examens;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Examen01 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
						
			//es declaren variables
			int llarg=1;
			int acum=1;
			int count=1;
			int temp=1;
			int last=1;
			int tipus=1;
			String codi;
			int surt=1;

			//es fa un bucle per a introduir les dades, se surt del bucle amb el 0
			
			while(surt!=0){
				System.out.println("digues un codi");
				codi=teclado.readLine();
				surt=Integer.parseInt(codi);
				
				//s'evalua la llargada del string amb una variable, y es determina el tipus de dada amb la variable tipus
				llarg=(codi.length());
				
				//s'extreu la ultima posició que després ens servirà per a treure el calcul
				last=Integer.parseInt(codi.substring(llarg,1));
				
				if (llarg<8){
					tipus=8;
				}
				if (llarg>8 && llarg<13){
					tipus=13;
				}
				else{
					
				}
				
				//es crea un altre bucle per a evaluar posicions PARELLS y fer la multiplicació, aquesta dada s'acumula a una variable.
				count=0;
				while(count<llarg){
					temp=Integer.parseInt(codi.substring(count,1));
					acum=temp*1;
					count=count+2;
				}

				//es crea un altre bucle per a evaluar posicions IMPARELLS y fer la multiplicació, aquesta dada s'acumula a una variable.
				count=1;
				while(count<llarg){
					temp=Integer.parseInt(codi.substring(count,1));
					acum=temp*3;
					count=count+2;
				}

				//es mostra el resultat
				if ((acum+last)%10==0){
					System.out.println("SI.EAN-"+tipus);
				}
				if ((acum+last)%10!=0){
					System.out.println("NO.EAN-"+tipus);
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}