package thread_sincro;

import java.util.ArrayList;

public class panaderia {

	public static void main(String[] args) {
		ArrayList<String>productos=new ArrayList<String>();
		
		/*
		Consumidor c1 = new Consumidor(productos);
		Consumidor c2 = new Consumidor(productos);
		Consumidor c3 = new Consumidor(productos);
		Consumidor c4 = new Consumidor(productos);*/
		
		Ventana v = new Ventana();
		Productor p= new Productor(productos);
		
		/*
		new Thread(c1).start();
		new Thread(c2).start();
		new Thread(c3).start();
		new Thread(c4).start();
		new Thread(p).start();*/
		
		new Thread(p).start();
		
	}
}
