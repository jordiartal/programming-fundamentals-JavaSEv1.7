package exercicis;

public class Ex32 {
	public static void main (String[] args) {
		try {

			for (int num=0; num<1001; num=num+2){
				System.out.println(num);
			}
		}
		catch (Exception e){
			System.out.println("hi ha un error");
		}
	}
}