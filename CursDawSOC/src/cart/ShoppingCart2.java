package cart;

public class ShoppingCart2 {
	
	static String nomCliente = "Juan Garcia";
	static String mensaje;
	static double precio = 10;
	static double tasa = 1.21;
	static double total;
	static int cantidad = 5;
	static String pant = "pantalón";
	static String pants = "pantalones";
	
	public static void main(String[] args) {

		// Declare and initialize numeric fields: price, tax, quantity, and
		// total.
		
		

		if (cantidad > 1) {
			pant = pants;
		}
		String descProducto = "quiere comprar " + cantidad + " " + pant + " tipo vaquero azul oscuro talla 42.";
		
		// Modify message to include quantity

		total = precio * cantidad * tasa;
		mensaje = nomCliente + " " + descProducto;

		// Calculate total and then print the total cost

		System.out.println(mensaje);
		System.out.println();
		System.out.println("Coste total con tasas: " + total + "€");
	}
}
