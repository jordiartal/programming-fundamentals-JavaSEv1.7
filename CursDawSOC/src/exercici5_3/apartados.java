package exercici5_3;

public class apartados {

	public apartados() {

	}

	public static void main(String[] args) {

		System.out.println("APARTADO 1");
		System.out.println("--------------------------");
		boolean var1 = (7 <= 5);
		System.out.println("sentència 1: " + var1);
		boolean var2 = (2 > 6);
		System.out.println("sentència 2: " + var2);
		boolean var3 = (3 != 5);
		System.out.println("sentència 3: " + var3);
		boolean var4 = (1 == 1 + 1);
		System.out.println("sentència 4: " + var4);
		System.out.println("--------------------------");
		System.out.println();

		System.out.println("APARTADO 2");
		System.out.println("--------------------------");
		boolean var5 = true || false && true;
		System.out.println("sentència 1: " + var5);
		boolean var6 = (false || false) && (!true);
		System.out.println("sentència 2: " + var6);
		boolean var7 = !true && !false;
		System.out.println("sentència 3: " + var7);
		boolean var8 = !(5 > 7 || 8 > 0 && 1 == 2);
		System.out.println("sentència 4: " + var8);
		System.out.println();

	}

}
