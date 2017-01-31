package thread_sincro;

import java.util.ArrayList;

public class Productor implements Runnable{
	private ArrayList<String>productos;

	public Productor (ArrayList<String>productos){
		this.productos = productos;
	}

	@Override
	public void run() {
		while(true){
			synchronized (productos) {
				try {
					productos.add("nuevo producto");
					System.out.println("creo un producto.");
					productos.notify();
					Thread.sleep(3000);				

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}