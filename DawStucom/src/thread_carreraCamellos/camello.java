package thread_carreraCamellos;

import javax.swing.JLabel;

public class camello implements Runnable {

	private JLabel imagen;	
	private String nombre;
	
	
	public camello (JLabel imagen, String nombre){
		
		this.imagen=imagen;
		this.nombre=nombre;
	}
	
	public void run() {
		
		while(imagen.getX()<400){
			try {
				Thread.sleep((long) (Math.random()*50));
				imagen.setLocation(imagen.getX()+1, imagen.getY());
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("ha arribat el camell "+this.nombre);
	}
	
	
}