package thread_sincro;

import java.util.ArrayList;

public class Consumidor implements Runnable{
	private ArrayList<String>productos;
	
	

	public Consumidor() {
		
	}

	public Consumidor (ArrayList<String>productos){
		this.productos = productos;
	}

	@Override
	public void run() {
		synchronized (productos){
			if(productos.size()==0){
				try {
					System.out.println("no hay productos, me espero...");
					productos.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			productos.remove(0);
			System.out.println("consumo y me las piro!!!");
		}
	}
}
