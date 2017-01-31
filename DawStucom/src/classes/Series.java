package classes;
class Series {
	//atributs
	private String titol;
	private int cuantitat;
	private int []temporades; 						//s'inicialitza l'array  pero encara se li ha de dir cuantes files tindrá
	private boolean entregat;
	private String genere;
	private String creador;
	
	//constructors per defecte, per defecte son 3 temporades i entregat a false, la resta buid i per defecte
	public Series(){
		
		this.setTitol("");
		this.setCuantitat(3);
		this.setEntregat(false);
		this.setGenere("");
		this.setCreador("");
		temporades = new int[this.getCuantitat()];	//aquí es posen les files de l'array
		for(int i=0; i < this.cuantitat;i++){ 		// referenciant a this.cuantitat li diem que es crearan tants camps d'array com cuantitat
			this.temporades[i]=0;					//el this és referenciar a l'atribut
		}											//amb el bucle l'omplim a valors 0 
	}
	
	//constructors amb titol i creador
	public Series(String titol,String creador){
		this.setTitol(titol);
		this.setCuantitat(3);
		temporades = new int[this.getCuantitat()];
		for(int i=0; i < this.cuantitat;i++){  		
			this.temporades[i]=0;			
		}
		this.setEntregat(false);
		this.setGenere("");
		this.setCreador(creador);
	}
	
	//constructor amb tots els atributs excepte entregat
	public Series(String titol, String creador, int cuantitat, int []temporades, String genere){
		this.setTitol(titol);
		this.setCuantitat(cuantitat);
		temporades = new int[this.getCuantitat()];
		this.setTemporades(temporades);		 //aquí li diem que agafem la dada que ens proporciona el constructor, que ja és un array 
		this.setGenere(genere);
		this.setCreador(creador);
	}
	
	//setters de tots excepte de entregat
	public void setTitol(String titol){
		this.titol=titol;
	}
	public void setCuantitat(int cuantitat){
		this.cuantitat=cuantitat;
	}
	public void setTemporades(int[] temporades){ //en el setter li diem que crei tants camps en el array com this.cuantitat  
		for(int i=0; i < this.cuantitat;i++){    //llavors només cridant al setTemporades ja ho creem
			this.temporades[i]=temporades[i];		
		}
	}
	public void setEntregat(boolean entregat){
		this.entregat=entregat;
	}
	public void setGenere(String genere){
		this.genere=genere;
	}
	public void setCreador(String creador){
		this.creador=creador;
	}
	
	//getters
	public String getTitol(){
        return this.titol;
    }
	public boolean getEntregat(){
        return this.entregat;
    }
	public String getGenere(){
        return this.genere;
    }
	public String getCreador(){
        return this.creador;
    }
	public int getCuantitat(){
        return this.cuantitat;
    }
	public int[] getTemporades(){
        return this.temporades;
    }
}