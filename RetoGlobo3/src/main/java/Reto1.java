import java.util.ArrayList;
import java.util.Arrays;

public class Reto1{
    public static void main(String[] args) {
        Persona objPersona[] = new Persona[9];
        objPersona[0] = new Persona("1007790743",18,"Sebastian");
        objPersona[1] = new Persona("100779074",18,"David");
        objPersona[2] = new Persona("10077907",18,"Erika");
        objPersona[3] = new Persona("1007790",11,"Sasta");
        objPersona[4] = new Persona("100779",18,"Sara");
        objPersona[5] = new Persona("10077",18,"Mariana");
        objPersona[6] = new Persona("1007",18,"Soto");
        objPersona[7] = new Persona("100",18,"Docky");
        objPersona[8] = new Persona("100555",30,"Docky");
        
        Viaje obj = new Viaje(33,objPersona);
        
        System.out.println(Arrays.toString(obj.getPersonas()));
        System.out.println(obj.ParticipanMenoresDeEdad());
        
        var costos = obj.CalcularCosto();
        
        ArrayList<Globo> array1 = new ArrayList<>();
        
        array1 = obj.ObtenerGlobosRecomendados();
        System.out.println(obj.ObtenerGlobosRecomendados());
        System.out.println(obj.CalcularCosto()+" y personas: "+objPersona.length);
        
    }
}
