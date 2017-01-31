package exercicis;
public class Ex52 {
	public static void main (String[] args){
		try{
			String[][]matriu=new String[5][5];
			for(int x=0;x<5;x++){
				for(int y=0;y<5;y++){
					matriu[x][y]=(x+","+y);
					System.out.println(matriu[x][y]);
				}
			}
		}
		catch(Exception e){
			System.out.println("hi ha un error");
		}
	}
}