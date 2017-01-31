package thread_hilos;

public class Principal {

	public static void main(String[] args) {
		Hilo h1 = new Hilo("soy el hilo 1");
		Hilo h2 = new Hilo("soy el hilo 2");
		
		Thread t1 = new Thread(h1);
		Thread t2 = new Thread(h2);
		
		//la funcion start inicia la funcion run
		t1.start();
		t2.start();
	} 

		
	
}
