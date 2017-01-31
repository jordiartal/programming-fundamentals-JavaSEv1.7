package classes;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PasswordApp{
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("cuantitat de passwords que vols emmagatzemar:");
			String qpass=teclado.readLine();
			Password [] password1=new Password [Integer.parseInt(qpass)];
			boolean [] fuerte=new boolean [Integer.parseInt(qpass)];
			
			int longi;	
			int i=0;
			
			while(i < Integer.parseInt(qpass)){
				Password p = new Password();
				System.out.println("defineix la longitud dels passwords:");
				longi=Integer.parseInt(teclado.readLine());
				p.setLongitud(longi);
				fuerte[i]=p.esFuerte(p.getContrasenya());
				password1[i]=p;
				i++;
			}	
			i=0;
			while(i < Integer.parseInt(qpass)){
				System.out.println(password1[i].getContrasenya()+" "+fuerte[i]);
				i++;
			}				
		}
		catch(Exception e){
			System.out.println("error en el main");
		}
	}
}