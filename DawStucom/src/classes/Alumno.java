package classes;
class Alumno{
    private String dni;
    private String nombre;
    private int edad;
    private double nota;
    //Constructores
    public Alumno(){}
    public Alumno(String dni, String nombre,int edad,double nota){
        this.setDni(dni);
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setNota(nota);
    }
    //Setters
    public void setDni(String dni){
        this.dni = dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNota(double nota){
        this.nota = nota;
    }
    //Getters
    public String getDni(){
        return this.dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public double getNota(){
        return this.nota;
    }
}