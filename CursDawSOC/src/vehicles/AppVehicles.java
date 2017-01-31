package vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppVehicles {

	/**
	 * Aquesta classe cont� la app d'execuci�
	 */

	static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	static Vehicle2 cotxe1 = new Vehicle2("Mercedes", "Classe A", 2016, "BCN", 123456, "A", 5);
	static Matricula matricula1 = new Matricula("BCN", 123467, "A");

	public static void main(String[] args) throws IOException {
		
		
		//procediment de demanr i mostrar l'abast del vehicle desde classe Vehicle
		//exercici 1A
		System.out.println("PART 1 ---------------------------");
		System.out.println("Quants litres t� ara el teu vehicle?");
		String feed = lector.readLine();
		float resposta = cotxe1.calcularKms(feed, cotxe1.getConsum());
		System.out.println("el teu cotxe pot rec�rrer: "+resposta+" Kms");
		System.out.println("el teu cotxe t� les seg�ents caracter�stiques: "+cotxe1.toString());
		
		//procediment de mostrar la matricula desde classe matricula
		//exercici 1B
		System.out.println("La matricula del teu vehicle �s: "+matricula1.toString());
		
		
		//El mateix procediment pero nom�s utilitzant la classe vehicle 
		//exercici 2
		System.out.println("PART 2 ---------------------------");
		Vehicle cotxe2 = new Vehicle("Renault", "Megane", 2016, "MAD", 987654, "Z", 6);
		System.out.println("Quants litres t� ara el teu vehicle?");
		feed = lector.readLine();
		resposta = cotxe2.calcularKms(feed, cotxe2.getConsum());
		System.out.println("el teu cotxe pot rec�rrer: "+resposta+" Kms");
		System.out.println("a m�s la matricula del teu cotxe �s: "+ cotxe2.mat.toString());
		
		//El mateix procediment pero nom�s utilitzant la classe vehicle 
		//exercici 3
		System.out.println("PART 3 ---------------------------");
		
		System.out.println("marca:");
		String marca = lector.readLine();
		System.out.println("model:");
		String model = lector.readLine();
		System.out.println("any:");
		int any = Integer.parseInt(lector.readLine());
		System.out.println("provincia de la matricula:");
		String matProv = lector.readLine();
		System.out.println("numero de la matricula:");
		int matNum = Integer.parseInt(lector.readLine());
		System.out.println("lletra de la matricula:");
		String matLet = lector.readLine();
		System.out.println("consum cada 100Kms");
		Float consum = Float.parseFloat(lector.readLine());
		System.out.println("Quants litres t� ara el teu vehicle?");
		feed = lector.readLine();
		
		Vehicle cotxe3 = new Vehicle(marca,model,any,matProv,matNum,matLet,consum);
		resposta = cotxe3.calcularKms(feed, cotxe3.getConsum());
		System.out.println("el teu cotxe pot rec�rrer: "+resposta+" Kms");
		System.out.println("a m�s la matricula del teu cotxe �s: "+ cotxe3.mat.toString());
		
		
	}

}
