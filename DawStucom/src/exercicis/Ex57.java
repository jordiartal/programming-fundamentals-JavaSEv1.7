package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//ejercici del cine
public class Ex57 {
	public static void main (String[] args){
		try{
			int sortida=1;
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			char[][]sala=new char[7][8];
					
			for(int x=0;x<7;x++){
				for(int y=0;y<8;y++){
					sala[x][y]='*';
				}
			}
			for(int x=0;x<7;x++){
				for(int y=0;y<8;y++){
					System.out.print(sala[x][y]+" ");
				}
				System.out.println("");
			}	
		
			while(sortida != 0){
				System.out.println("introdueix la posició o 0 per sortir");
				String butaca=teclado.readLine();
				
				
				if (butaca.length()<2){
					sortida=Integer.parseInt(butaca.substring(0,1));
					System.out.println("sortint del programa");
				}
				
				if (sortida != 0){
					int x=Integer.parseInt(butaca.substring(0,1));
					int y=Integer.parseInt(butaca.substring(2,3));
					
					if (x<8 && y<9){
						if (sala[x][y]=='o'){
							System.out.println("aquesta butaca ja està agafada");
						}
						if (sala[x][y]=='*'){
							sala[x][y]='o';	
						}
					}
					
					if (x>7 || y>8){
						System.out.println("aquesta informació es incorrecte");
					}
					
						for(int x1=0;x1<7;x1++){
						for(int y1=0;y1<8;y1++){
							System.out.print(sala[x1][y1]+" ");
						}
						System.out.println("");
					}
				}
				
				
			}
		}
		
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}