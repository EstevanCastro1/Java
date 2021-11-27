import java.util.ArrayList;

public class Pruebas{
    public static void main(String[] args) {
        Viaje obj = new Viaje(23,13);
        var personas = obj.getNumPersonas();
        var costos = obj.CalcularCosto();
        ArrayList<Globo> array1 = new ArrayList<>();
        array1 = obj.ObtenerGlobosRecomendados();
        System.out.println("El viaje cuesta $"+costos+" y son "+personas+" personas.");
        System.out.println(obj.ObtenerGlobosRecomendados());
    }
}
