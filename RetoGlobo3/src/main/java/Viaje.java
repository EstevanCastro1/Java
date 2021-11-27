import java.util.ArrayList;

public class Viaje {
    private int Id;
    private Persona[] personas;
    
    public Viaje(int Id, Persona[] personas){
        this.Id = Id;
        this.personas = personas;
    }

    public int getId() {
        return Id;
    }
    
    public void setId(int newId) {
        Id = newId;
    }
    public Persona[] getPersonas(){
        String cedula;
        int edad;
        String nombre;
        Persona datosPersonas[] = new Persona[personas.length];
        for (int i = 0; i < datosPersonas.length; i++) {
            cedula = personas[i].getCedula();
            edad = personas[i].getEdad();
            nombre = personas[i].getNombre();
            datosPersonas[i] = new Persona(cedula,edad,nombre);
        }
        return datosPersonas;
    }
    
    public int ObtenerNumeroPersonas() {
        int numPersonas = personas.length;
        return numPersonas;
    }
    
    public double CalcularCosto(){
        double costo = 0;
        double descuento = 0;
        if(ObtenerNumeroPersonas() > 0 && ObtenerNumeroPersonas() <=3){
            costo = ObtenerNumeroPersonas() * 450000;
            descuento = costo*0.03;
            costo = costo - descuento;
            return costo;
        }
        if(ObtenerNumeroPersonas() > 3 && ObtenerNumeroPersonas() <= 6){
            costo = ObtenerNumeroPersonas() * 450000;
            descuento = costo*0.06;
            costo = costo - descuento;
            return costo;
        }
        if (ObtenerNumeroPersonas() > 6){
            costo = ObtenerNumeroPersonas() * 450000;
            descuento = costo*0.1;
            costo = costo - descuento;
            return costo;
        }
        return costo;
    }
    
    public ArrayList<Globo> ObtenerGlobosRecomendados(){
        ArrayList<Globo> globosArrayList = new ArrayList<>();
        int numPersonas = ObtenerNumeroPersonas();
        String tipoGlobo;
        int capacidadGlobo;
        while (numPersonas >= 12){
            Globo aux = new Globo();
            tipoGlobo = "Globo Grande";
            capacidadGlobo = 12;
            numPersonas -= capacidadGlobo;
            aux.setIdentificador(tipoGlobo);
            aux.setCapacidad(capacidadGlobo);
            globosArrayList.add(aux);
        }
        while (numPersonas >= 8 && numPersonas<12){
            Globo aux = new Globo();
            tipoGlobo = "Globo Mediano";
            capacidadGlobo = 8;
            numPersonas -= capacidadGlobo;
            aux.setIdentificador(tipoGlobo);
            aux.setCapacidad(capacidadGlobo);
            globosArrayList.add(aux);
        }
        while (numPersonas > 0){
            Globo aux = new Globo();
                tipoGlobo = "Globo Pequeño";
                capacidadGlobo = 4;
                numPersonas -= capacidadGlobo;
                aux.setIdentificador(tipoGlobo);
                aux.setCapacidad(capacidadGlobo);
                globosArrayList.add(aux);
            }
        return globosArrayList;
    }
    
    public boolean ParticipanMenoresDeEdad(){
        boolean validacion;
        int cont = 0;
        for (int i = 0; i < ObtenerNumeroPersonas(); i++) {
            int validar_edad = personas[i].getEdad();
            if (validar_edad <= 17) {
                cont++;
            }
        }
        if (cont != 0) {
            validacion = true;
        } else {
            validacion = false;
        }
        return validacion;
    }
    
}

