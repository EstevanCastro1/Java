import java.util.Scanner;
public class emprendedor {
    public static void main(String[] args) {
        System.out.println("Ingrese el Valor del producto al cual le desea ganar el 30%");
        Scanner consola=new Scanner(System.in);
        var compra=consola.nextInt();
        var gan=compra*0.30;
        var resul=compra+gan;
        System.out.println("el producto tiene un costo de " + compra);
        System.out.println("lo puede vender en "+Math.round(resul));
        

        
    }
}
