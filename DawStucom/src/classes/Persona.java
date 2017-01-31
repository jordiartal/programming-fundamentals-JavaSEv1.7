package classes;
class Persona {
	//atributs
	private String nom;
	private int edat;
	private String dni;
	private char sexe;
	private double pes;
	private double alçada;
	
	//constructors
	
	//constructor per defecte
	public Persona(){
		this.setNom("sin nombre");
		this.setEdat(0);
		generaDNI();
		this.setSexe('H');
		this.setPes(0.0);
		this.setAlçada(0.0);
	}
	
	//constructor amb valors
	public Persona(String nom,int edat,String dni,char sexe,double pes,double alçada){
		this.setNom(nom);
		this.setEdat(edat);
		generaDNI();
		comprobarSexo(sexe);
		this.setPes(pes);
		this.setAlçada(alçada);
	}
	//setters
	public void setNom(String nom){
		this.nom=nom;
	}
	public void setEdat(int edat){
		this.edat=edat;
	}
	/*public void setDni(String dni){
		this.dni=dni;
	}*/
	public void setSexe(char sexe){
		comprobarSexo(sexe);
	}
	public void setPes(double pes){
		this.pes=pes;
	}
	public void setAlçada(double alçada){
		this.alçada=alçada;
	}
	//getters
	public String getNom(){
        return this.nom;
    }
    public int getEdat(){
        return this.edat;
    }
    public String getDni(){
        return this.dni;
    }
    public char getSexe(){
        return this.sexe;
    }
    public double getPes(){
        return this.pes;
    }
    public double getAlçada(){
        return this.alçada;
    }
    //calcularIMC()
    public int calcularIMC(){
    	int ideal=0;
    	if(getPes()/(getAlçada()*getAlçada())<18){
    		ideal=-1; //per sota
    	}
    	else if((getPes()/(getAlçada()*getAlçada()))>18 && (getPes()/(getAlçada()*getAlçada())<25)){
    		ideal=0; //ideal
    	}
    	else{
    		ideal=1; //per sobre
    	}
    	return ideal;
    }
  //esMayorDeEdad()
    public boolean esMayorDeEdad(){
    	boolean adult=true;
    	if(getEdat()>17){
    		adult=true;
    	}
    	else{
    		adult=false;
    	}
    	return adult;
    }
    //comprobarSexo(char sexe)
    private void comprobarSexo(char sexe){
    	if(sexe!='H'&& sexe!='D'){
    		this.sexe='H';
    	}		
    }
    //toString()
    public String toString(){
    	String parrafada=getNom()+" | "+getEdat()+" | "+getDni()+" | "+getSexe()+" | "+getPes()+" | "+getAlçada();
    	return parrafada;
    }
    //generaDNI()
    private void generaDNI(){
       	int numero=(int) (Math.random()*(99999999))+10000000;
       	String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKET";
        int modulo= numero % 23;
        char letra = juegoCaracteres.charAt(modulo); 
        String aleDni=numero+String.valueOf(letra);
        this.dni=aleDni;
    }
}
