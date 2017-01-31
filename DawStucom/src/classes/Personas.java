package classes;
class Personas {
	//atributs
	private String dni;
	private String nombre;
	private String apellidos;
	private String domicilio;
		
	//constructors
	
	//constructor per defecte
	public Personas(){
		this.setDni("00000000");
		this.setNombre("");
		this.setApellidos("");
		this.setDomicilio("");
	}
	
	//constructor amb valors
	public Personas(String dni,String nombre,String apellidos,String domicilio){
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setDomicilio(domicilio);
	}
	//setters
	public void setDni(String dni){
		this.dni=dni;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setApellidos(String apellidos){
		this.apellidos=apellidos;
	}
	public void setDomicilio(String domicilio){
		this.domicilio=domicilio;
	}
	
	//getters
	public String getDni(){
        return this.dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    
    //metode getAtributs()
    public String getAtribut(){
    	String atributs=getDni()+" "+getNombre()+" "+getApellidos()+" "+getDomicilio();
    	return atributs;
    }
}
