public class Persona {
    protected  int edad;
    protected String nombre;
    
    public String imprimirInfo(){
        return "Te llamas "+this.nombre;
    
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

} 

