package bbdd_biblioteca;

public class Principal {
	public static Bibliobbdd interconexion;
	public static void main(String[] args) {
        new MenuPrincipal();
        interconexion = new Bibliobbdd();
	}
}
