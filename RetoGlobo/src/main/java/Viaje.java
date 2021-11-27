import java.util.ArrayList;

public class Viaje {
    private int Id;
    private int NumPersonas;
    
    public Viaje(int Id, int NumPersonas){
        this.Id = Id;
        this.NumPersonas = NumPersonas;
    }

    public int getId() {
        return Id;
    }

    public void setId(int newId) {
        Id = newId;
    }

    public int getNumPersonas() {
        return NumPersonas;
    }

    public void setNumPersonas(int NumPersonas) {
        this.NumPersonas = NumPersonas;
    }
    
    public double CalcularCosto(){
        double costo = 0;
        double descuento = 0;
        if(NumPersonas>0 && NumPersonas<=3){
            costo = NumPersonas*450000;
            descuento = costo*0.03;
            costo = costo - descuento;
            return costo;
        }
        if(NumPersonas>3 && NumPersonas<=6){
            costo = NumPersonas*450000;
            descuento = costo*0.06;
            costo = costo - descuento;
            return costo;
        }
        if (NumPersonas>6){
            costo = NumPersonas*450000;
            descuento = costo*0.1;
            costo = costo - descuento;
            return costo;
        }
        return costo;
    }
    
    public ArrayList<Globo> ObtenerGlobosRecomendados(){
        ArrayList<Globo> globosArrayList = new ArrayList<>();
        int personas = NumPersonas;
        String tipoGlobo;
        int capacidadGlobo;
        while (personas >= 12){
            Globo aux = new Globo();
            tipoGlobo = "Globo Grande";
            capacidadGlobo = 12;
            personas -= capacidadGlobo;
            aux.setIdentificador(tipoGlobo);
            aux.setCapacidad(capacidadGlobo);
            globosArrayList.add(aux);
        }
        while (personas >= 8 && personas<12){
            Globo aux = new Globo();
            tipoGlobo = "Globo Mediano";
            capacidadGlobo = 8;
            personas -= capacidadGlobo;
            aux.setIdentificador(tipoGlobo);
            aux.setCapacidad(capacidadGlobo);
            globosArrayList.add(aux);
        }
        while (personas != 0){
            Globo aux = new Globo();
                tipoGlobo = "Globo Pequeño";
                capacidadGlobo = personas;
                personas -= capacidadGlobo;
                aux.setIdentificador(tipoGlobo);
                aux.setCapacidad(capacidadGlobo);
                globosArrayList.add(aux);
            }
        return globosArrayList;
    }
}
