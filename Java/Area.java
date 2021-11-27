import java.util.Scanner;
public class Area {
    public static void main(String args[]) {
            System.out.println("Ingrese el Perimetro");
            Scanner consola=new Scanner(System.in);
            var perimetro=consola.nextInt();
            System.out.println("Ingrese del apotema");
            Scanner consola2=new Scanner(System.in);
            var apotema=consola2.nextInt();
            var resultado=(perimetro*apotema)/2;
            System.out.println("el area es "+resultado);

    
    



    }  
}
