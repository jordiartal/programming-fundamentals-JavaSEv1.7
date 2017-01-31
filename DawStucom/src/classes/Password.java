package classes;
class Password {
	//atributs
	private int longitud;
	private String contrasenya;
	
	//constructors
	public Password(){
		this.setLongitud(8);
		generaPassword(this.longitud);
	}
	
	//setters
	public void setLongitud(int longitud){
		this.longitud=longitud;
		generaPassword(this.longitud);
	}
	
	//getters
	public int getLongitud(){
        return this.longitud;
    }
    public String getContrasenya(){
        return this.contrasenya;
    }
    
    //metodes
    
    /*esFuerte devuelve un booleano si es fuerte o no, 
    para que sea fuerte debe tener m�s de 2 may�sculas, m�s de 1 min�scula y m�s de 5 n�meros */
    public boolean esFuerte(String contrasenya){
			int minus=0;
	    	int nums=0;
	    	int mayus=0;
	    	int i=0;
	    while (i<contrasenya.length()){
	    	if(contrasenya.charAt(i)>'a'&&contrasenya.charAt(i)<'z'){
	        	minus++;
	        	}
	        if(contrasenya.charAt(i)>'A'&&contrasenya.charAt(i)<'Z'){
	        	mayus++;
	        }
	        if(contrasenya.charAt(i)>'0'&&contrasenya.charAt(i)<'9'){	
	        	nums++;
	        }
	        i++;
	    }
	    if(minus>0 && mayus>2 && nums>5){
	    return true; //�s forta
	    }
	    else{
	    return false;
	    }
    }
    
    /*genera password genera la contrase�a del objeto con la longitud que tenga.*/
    private void generaPassword(int longitud){
    	String pass="";
    	String base="1234567890qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPASDFGHJKL�ZXCVBNM";
    	int i=0;
    	while (i<longitud){
    		int rand=(int)(Math.random()*63);
    		pass=pass+base.charAt(rand);
    		i++;
    	}
    	this.contrasenya=pass;
    }
}