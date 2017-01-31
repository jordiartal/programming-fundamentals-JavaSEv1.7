package exercicis;
public class Ex54 {
	public static void main (String[] args){
		try{
			
			int[][]matriu=new int[5][5];
			for(int x=0;x<5;x++){
				for(int y=0;y<5;y++){
					if (x-y < 0){
						matriu[x][y]=-1;	
					System.out.print(matriu[x][y]);
					}
					if (x-y > 0){
						matriu[x][y]=+1;
					System.out.print(matriu[x][y]);
					}
					if (x-y==0){
						System.out.print("0");
					}
					
				}
				System.out.println("");
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}