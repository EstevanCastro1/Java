import controlador.Controlador;
import modelo.Modelo;
import vista.Decano;
public class Ejecutar {
    public static void main(String[] args) {
        Decano objd = new Decano(); 
        Modelo objm = new Modelo();
        Controlador objc = new Controlador(objd,objm);
        objd.setVisible(true);
    }
    
}