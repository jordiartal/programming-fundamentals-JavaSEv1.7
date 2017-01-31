package hashmap_juegos;
public class VideoJuego extends Juego implements Descargable{
	
	private boolean multijugador;
	private String genero;
	public VideoJuego(int codigo, String nombre, double precio,
			boolean multijugador, String genero) {
		super(codigo, nombre, precio);
		this.multijugador = multijugador;
		this.genero = genero;
	}
	
	public boolean isMultijugador() {
		return multijugador;
	}
	
	public void setMultijugador(boolean multijugador) {
		this.multijugador = multijugador;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void Descargar() throws Exception {
		System.out.println("***** INICIANDO DESCARGA******");
		System.out.println("conectando con el servidor...[OK]");
		System.out.println("Descargnado...");
		for(int i=0;i<100;i++){
			Thread.sleep(100);
			System.out.println(".");
		}	
	}
	
	public void cancelarDescarga() {	
	
	}

	@Override
	public String toString() {
		return "VideoJuego [multijugador=" + multijugador + ", genero="
				+ genero + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", precio=" + precio + "]";
	}	 

}
