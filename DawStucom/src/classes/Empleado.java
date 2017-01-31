package classes;
class Empleado{
    private String dni;
    private String nombre;
    private String apellidos;
    private String domicilio;
    private String fcontrat;
    private double sueldo;
     
    //Constructores
    public Empleado(){}
    
    public Empleado(String dni, String nombre,String apellidos,String domicilio,String fcontrat,double sueldo){
    	this.setDni(dni);
    	this.setNombre(nombre);
    	this.setApellidos(apellidos);
    	this.setDomicilio(domicilio);
    	this.setFcontrat(fcontrat);
    	this.setSueldo(sueldo);
    }
    
    //Setters
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
    public void setFcontrat(String fcontrat){
    	this.fcontrat=fcontrat;
    }
    public void setSueldo(double sueldo){
    	this.sueldo=sueldo;
    }
    
    //Getters
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
    public String getFcontrat(){
        return this.fcontrat;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    
    //Metodes
    //getAtributos() retorna tots els atributs concatenats
    public String getAtributos(){
    	String dades= (getDni()+" "+getNombre()+" "+getApellidos()+" "+getDomicilio()+" "+getFcontrat()+" "+getSueldo());
    	return dades;
    }
}