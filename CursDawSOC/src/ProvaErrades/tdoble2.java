package ProvaErrades;
/**
 *  
 *  Aquesta classe calcula el doble del nombre entrat
 *  
 *   */ 
public class tdoble2 { 
	/**
	 *  
	 *  M�tode utilitzat per la m�quina virtual per executar la classe
	 *  
	 *  */ 
	public static void main(String[] argv) { 
		// Definici� de les varibles. 
		int nombre_1; 
		int resultat; 
		String missatge; 
		System.out.println("C�lcul del doble d'un nombre entrat"); 
		if ((argv.length>10)||(argv.length<1)) { 
			System.out.println("Error: Has d'entrar un m�nim d'un nombre i com a molt 10"); 
		} else { 
			for(int i=0;i<argv.length;i++) 
			{ 
				nombre_1=Integer.parseInt(argv[i]); 
				resultat=nombre_1*2; 
				missatge="El doble de "+" "+nombre_1+" "+"�s"+" "+resultat; 
				System.out.println(missatge); 
			} 
		} 
	} 
} 