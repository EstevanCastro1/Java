
public class Globo {
    private String Identificador;
    private int capacidad;
    
    public Globo(){
        
    }

    public Globo(String identificador, int capacidad) {
        this.Identificador = identificador;
        this.capacidad = capacidad;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String identificador) {
        this.Identificador = identificador;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    @Override
    public String toString() {
        return "Globo{" + "Identificador=" + Identificador + ", capacidad=" + capacidad + '}';
    }
    
}
