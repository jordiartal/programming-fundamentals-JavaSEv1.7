package triangle;
/**
 *  @author daw
 *  Paquete al que pertenece la clase.
 *
 */

public class Triangle {

	/**
	 * atributos de la clase Triangle
	 * */
	private int lado1;
	private int lado2;
	private int base;
	private int altura;

	/**
	 * métodos get() y set() de los atributos de la clase 
	 * 
	 */
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	/**
	 * método constructor de la clase Triangulo
	 * @param ladoUno
	 * @param ladoDos
	 * @param base
	 * @param altura
	 */
	public Triangle(int ladoUno, int ladoDos, int base, int altura) {
		this.lado1=ladoUno;
		this.lado2=ladoDos;
		this.base=base;
		this.altura=altura;
	}

	/**
	 * método main de la clase
	 * @param args parametres introduits per l'usuari
	 */
	public static void main(String[] args) {
		int val1=Integer.parseInt(args[0]);
		int val2=Integer.parseInt(args[1]);
		int val3=Integer.parseInt(args[2]);
		int val4=Integer.parseInt(args[3]);
		System.out.println("valor 1: "+args[0]);
		System.out.println("valor 2: "+args[1]);
		System.out.println("valor 3: "+args[2]);
		System.out.println("valor 4: "+args[3]);
		//crea el objeto tri 
		Triangle tri = new Triangle(val1,val2,val3,val4);

		//invocación del método perímetro obten. los valores del objeto tri
		tri.perimetro(tri.getLado1(),tri.getLado2(),tri.getBase());

		//invocación del método superficie, los valores de los 
		//parámetros los obtiene del objeto tri
		tri.superficie(tri.getBase(), tri.getAltura());
	}

	/**
	 * método que calcula el perímetro,
	 * los valores de los parámetros los obtiene del objeto tri
	 */
	public void perimetro(int lado1,int lado2,int base)
	{
		

		System.out.println("Su perimetro es igual a: "+(lado1+lado2+base));
	}

	/**
	 * método que calcula la superficie
	 * @param base
	 * @param altura
	 */
	
	public void superficie(int base, int altura)
	{
		int superficie;
		superficie=(base * altura) /2;
		System.out.println("Su superficie es igual a: " + (superficie));
	}
}