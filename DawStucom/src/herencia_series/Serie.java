package herencia_series;
class Serie {
	private String titulo;
	private int temp;
	private int[] temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//Constructors
	public Serie(){
		this.setTitulo("");
		this.setTemp(3);
		this.setTemporadas(this.temporadas);
		this.setEntregado(false);
		this.setGenero("");
		this.setCreador("");
	}
	public Serie(String titulo, String creador){
		this.setTitulo(titulo);
		this.setTemp(3);
		this.setTemporadas(this.temporadas);
		this.setEntregado(false);
		this.setGenero("");
		this.setCreador(creador);
	}
	public Serie(String titulo, int[] temporadas, String genero, String creador, int temp){
		this.setTitulo(titulo);
		this.setTemp(temp);
		this.setTemporadas(temporadas);
		this.setGenero(genero);
		this.setCreador(creador);
	}
	
	//setters
		public void setTitulo(String titulo){
			this.titulo = titulo;
		}
		public void setTemp(int temp){
			this.temp = temp;
		}
		public void setTemporadas(int[] temporadas){
			this.temporadas = temporadas;
		}
		public void setGenero(String genero){
			this.genero = genero;
		}
		public void setCreador(String creador){
			this.creador = creador;
		}
		public void setEntregado(boolean entregado){
			this.entregado = entregado;
		}
		
	//getters
		public String getTitulo(){
			return this.titulo;
		}
		public int getTemp(){
			return this.temp;
		}
		public int[] getTemporadas(){
			return this.temporadas;
		}
		public String getGenero(){
			return this.genero;
		}
		public String getCreador(){
			return this.creador;
		}	
}