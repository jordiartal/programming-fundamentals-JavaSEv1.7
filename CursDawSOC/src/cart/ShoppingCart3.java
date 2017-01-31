package cart;

public class ShoppingCart3 {

	// Declare and initialize numeric fields: price, tax, quantity, and
	// total.
	static String nomCliente = "Juan Garcia";
	static String mensaje;
	static double precio = 10;
	static double tasa = 1.21;
	static double total;
	static int cantidad = 5;
	static String pant = "pantalón";
	static String pants = "pantalones";
	static boolean sinStock;

	public static void main(String[] args) {
		System.out.println("Ejecutamos el programa con FALSE");
		System.out.println("--------------------------------");
		compra(sinStock = false);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Ejecutamos el programa con TRUE");
		System.out.println("--------------------------------");
		compra(sinStock = true);

	}

	private static void compra(boolean sinStock) {

		// conditional about stock
		if (sinStock == false) {
			System.out.println("Hay pantalones disponibles");
			
			// Conditionals about singular/plural message
			if (cantidad > 1) {
				pant = pants;
			}

			// Modify message to include quantity
			String descProducto = "quiere comprar " + cantidad + " " + pant + " tipo vaquero azul oscuro talla 42.";
			mensaje = nomCliente + " " + descProducto;
			System.out.println(mensaje);

			// Calculate total and then print the total cost
			total = precio * cantidad * tasa;
			System.out.println("Coste total con tasas: " + total + "€");
			System.out.println("--------------------------------");
		} else {
			System.out.println("NO hay pantalones disponibles, no se calcula el precio ni se lanza mensaje.");
			System.out.println("--------------------------------");
		}
	}
}
