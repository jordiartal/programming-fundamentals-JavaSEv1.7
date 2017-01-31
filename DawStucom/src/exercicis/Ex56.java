package exercicis;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex56 {
	public static void main (String[] args){
		try{
			BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
			int[][]matriu1=new int[4][3];
			int[][]matriu2=new int[4][3];
			int[][]matriu3=new int[4][3];
			for(int x=0;x<4;x++){
				for(int y=0;y<3;y++){
					System.out.println("escriu el nombre matriu 1");
					String str1=teclado.readLine();
					matriu1[x][y]=Integer.parseInt(str1);
					System.out.println("escriu el nombre matriu 2");
					String str2=teclado.readLine();
					matriu2[x][y]=Integer.parseInt(str2);
				}
			}
			for(int x=0;x<4;x++){
				for(int y=0;y<3;y++){
					matriu3[x][y]=matriu1[x][y]+matriu2[x][y];
				}
			}
			for(int x=0;x<4;x++){
				for(int y=0;y<3;y++){
					System.out.print(matriu3[x][y]);
				}
			System.out.println("");
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}