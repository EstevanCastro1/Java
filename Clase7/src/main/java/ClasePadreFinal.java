
/**
 *
 * @author Estevan Castro
 */
public class ClasePadreFinal {
    private int num;

    public ClasePadreFinal() {
    }

    public ClasePadreFinal(int num) {
        this.num = num;
    }
    
    
    
    public final void imprimirMetodo(){
        System.out.println("Prueba Metodo final");
    
    }
    public void metodoOtro(){
        System.out.println("Prueba Metodo otro");
    
    }
}
