public class Persona {
    private String cedula;
    private int edad;
    private String nombre;
    
    public Persona(){
        
    }
    
    public Persona(String cedula, int edad, String nombre){
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", edad=" + edad + ", nombre=" + nombre + '}';
    }
    
}
