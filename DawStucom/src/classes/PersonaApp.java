package classes;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PersonaApp{
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			//les dades preguntades
			Persona persona1 = new Persona();
			
			System.out.println("digues el nom");
			String nom=teclado.readLine();
			System.out.println("digues l'edat");
			String edat=teclado.readLine();
			System.out.println("digues el sexe, H o D");
			char sexe=(teclado.readLine()).charAt(0);
			System.out.println("digues el pes");
			String pes=teclado.readLine();
			System.out.println("digues la alçada");
			String alçada=teclado.readLine();
			
			persona1.setNom(nom);
			persona1.setEdat(Integer.parseInt(edat));
			persona1.setSexe(sexe);
			persona1.setPes(Double.parseDouble(pes));
			persona1.setAlçada(Double.parseDouble(alçada));			
			
			int imc1=persona1.calcularIMC();
			System.out.println();
			if(imc1==-1){
				System.out.println("està per sota del pes ideal");
			}
			else if(imc1==0) {
				System.out.println("està en el pes ideal");
			}
			else{
				System.out.println("està per sobre del pes ideal");
			}
			
			boolean maj1=persona1.esMayorDeEdad();
			System.out.println();
			System.out.println("la persona es major de edat?? "+maj1);
			
			System.out.println();
			System.out.println("dades de persona 1");
			System.out.println(persona1.toString());
			
			//per defecte
			Persona persona2=new Persona();
			System.out.println();
			System.out.println("dades de classe per defecte");
			System.out.println(persona2.toString());
		}
		catch(Exception e){
			System.out.println("error en el main");
		}
	}
}

