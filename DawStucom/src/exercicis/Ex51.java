package exercicis;

public class Ex51 {
	public static void main (String[] args){
		try{
			int[][]matriu=new int[5][5];
			for(int x=0;x<5;x++){
				for(int y=0;y<5;y++){
					matriu[x][y]=5;
					System.out.print(matriu[x][y]);
				}
				System.out.println("");
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}