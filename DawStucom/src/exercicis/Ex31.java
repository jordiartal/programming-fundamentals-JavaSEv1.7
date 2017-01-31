package exercicis;

public class Ex31 {
	public static void main (String[] args) {
		try {

			for (int num=5; num<501; num++){
				System.out.println(num);
			}
		}
		catch (Exception e){
			System.out.println("hi ha un error");
		}
	}
}