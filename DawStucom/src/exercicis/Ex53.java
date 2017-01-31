package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex53 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int[][]matriu=new int[4][4];
			for(int x=0;x<4;x++){
				for(int y=0;y<4;y++){
					System.out.println("escriu el nombre");
					String str1=teclado.readLine();
					matriu[x][y]=Integer.parseInt(str1);
				}
			}
			for(int x=0;x<4;x++){
				for(int y=0;y<4;y++){
					System.out.println(matriu[x][y]);
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}