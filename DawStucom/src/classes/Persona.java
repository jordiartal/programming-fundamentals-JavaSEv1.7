package classes;
class Persona {
	//atributs
	private String nom;
	private int edat;
	private String dni;
	private char sexe;
	private double pes;
	private double al�ada;
	
	//constructors
	
	//constructor per defecte
	public Persona(){
		this.setNom("sin nombre");
		this.setEdat(0);
		generaDNI();
		this.setSexe('H');
		this.setPes(0.0);
		this.setAl�ada(0.0);
	}
	
	//constructor amb valors
	public Persona(String nom,int edat,String dni,char sexe,double pes,double al�ada){
		this.setNom(nom);
		this.setEdat(edat);
		generaDNI();
		comprobarSexo(sexe);
		this.setPes(pes);
		this.setAl�ada(al�ada);
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
	public void setAl�ada(double al�ada){
		this.al�ada=al�ada;
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
    public double getAl�ada(){
        return this.al�ada;
    }
    //calcularIMC()
    public int calcularIMC(){
    	int ideal=0;
    	if(getPes()/(getAl�ada()*getAl�ada())<18){
    		ideal=-1; //per sota
    	}
    	else if((getPes()/(getAl�ada()*getAl�ada()))>18 && (getPes()/(getAl�ada()*getAl�ada())<25)){
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
    	String parrafada=getNom()+" | "+getEdat()+" | "+getDni()+" | "+getSexe()+" | "+getPes()+" | "+getAl�ada();
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
