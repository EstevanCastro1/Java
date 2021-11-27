import java.util.Scanner;
public class Porcentaje15 {
    public static void main(String args[]) {
        System.out.println("Ingrese un valor para sacar el 15%");
        Scanner consola=new Scanner(System.in);
        var porcentaje=consola.nextInt();
        var resul=(porcentaje*15)/100;
        System.out.println("el 15% de "+porcentaje+" es "+resul);
}
}