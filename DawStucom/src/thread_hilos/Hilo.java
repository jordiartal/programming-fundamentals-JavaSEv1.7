package thread_hilos;


//con implement runable se puede implementar los hilos de threads 
public class Hilo implements Runnable{

	private String mensaje;
	
	public Hilo(String mensaje){
		this.mensaje=mensaje;
	}
	
	public void run() {
		for(int i=0;i<50000;i++){
			System.out.println(mensaje);
		}
	}
}