package exercici5_3;

public class calculoNota {

	public static void main(String[] args) {
		int[] calificaciones = {7,9,5,8,9};
		double mitjana = 0;
		
		for(int i=0; i<calificaciones.length;i++){
			mitjana += calificaciones[i];  
		}
		
		mitjana = mitjana/calificaciones.length;
		
		if(mitjana >= 5){
			System.out.println("APROBAT amb un: "+mitjana);	
		}
		else{
			System.out.println("SUSPENS amb un: "+mitjana);
		}
				
	}

}
