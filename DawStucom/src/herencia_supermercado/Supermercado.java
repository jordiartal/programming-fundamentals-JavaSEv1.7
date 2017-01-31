package herencia_supermercado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Supermercado {
	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception{
		ArrayList <Producto> carro = new ArrayList<Producto>();
		int opcion;
		do{
			opcion = menu ();
			switch(opcion){
			case 1:
				nuevoProducto(carro);
				break;
			case 2:
				mostrarProducto(carro);
				break;
			case 3:
				modificarProducto(carro);
				break;
			case 0:
			default:
				System.out.println("Opcion incorrecta");
			}
		}while(opcion!=0);
	}
	private static void modificarProducto(ArrayList<Producto> carro) throws Exception {
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println("Que numero de producto quieres? [0-"+(carro.size()-1)+"]");
		int opcion=Integer.parseInt(br.readLine());
		System.out.println(carro.get(opcion).toString());
		Producto p = carro.get(opcion);
		if(p instanceof Frescos){
			System.out.println("nueva nom del país");
			
			((Frescos) p).setPais(br.readLine());
			System.out.println("nueva fecha envasado: \"dd-MM-YYYY\"");
			Date fecha_envasado=formato.parse(br.readLine());
			((Frescos) p).setFecha_envasado(fecha_envasado);
		}
		else if(p instanceof Refrigerados){
			//modificar codigo
		}
		else if(p instanceof Congelados){
			//modificar temperatura
		}
	}
	private static void mostrarProducto(ArrayList<Producto> carro)throws Exception {
		System.out.println("Que numero de producto quieres? [0-"+(carro.size()-1)+"]");
		int opcion=Integer.parseInt(br.readLine());
		System.out.println(carro.get(opcion).toString());
	}
	
	//
	private static void nuevoProducto(ArrayList <Producto> carro) throws Exception {
		int tipo;
		System.out.println("[1] - Producto Fresco");
		System.out.println("[2] - Producto Refrigerado");
		System.out.println("[3] - Producto Congelado");
		System.out.println("Elige tipo de producto:");
		tipo = Integer.parseInt(br.readLine());
		Date fecha_caducidad;
		int num_lot;
		Date fecha_envasado;
		String pais;
		String codigo;
		int temperatura;
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println("fecha caducidad: \"dd-MM-YYYY\"");
		fecha_caducidad=formato.parse(br.readLine());
		System.out.println("numero de lot");
		num_lot=Integer.parseInt(br.readLine());
		switch(tipo){
		case 1:
			System.out.println("fecha envasado: \"dd-MM-YYYY\"");
			fecha_envasado=formato.parse(br.readLine());
			System.out.println("nom del país");
			pais=br.readLine();
			carro.add(new Frescos(fecha_caducidad, num_lot, fecha_envasado, pais));
			break;
		case 2:
			System.out.println("introduce codigo");
			codigo=br.readLine();
			carro.add(new Refrigerados(fecha_caducidad, num_lot, codigo));
			break;
		case 3:
			System.out.println("introduce temperatura");
			temperatura=Integer.parseInt(br.readLine());
			carro.add(new Congelados(fecha_caducidad, num_lot, temperatura));
			break;
		default:
		}
	}

	//EL MENU D'OPCIONS
	private static int menu() throws Exception{
		int opcion;
		System.out.println("[1] - Nuevo producto");
		System.out.println("[2] - Mostrar producto");
		System.out.println("[3] - Salir");
		System.out.println("Elige opcion:");
		opcion=Integer.parseInt(br.readLine());
		return opcion;
	}
}