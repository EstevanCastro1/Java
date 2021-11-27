import java.util.Scanner;
public class carro {
    public static void main(String args[]) {
        System.out.println("Ingresa tu nombre por favor");
        Scanner consola=new Scanner(System.in);
        var usuario=consola.nextLine();
        System.out.println("Bienvenido "+ usuario);
        int vi=0;
        var a=0.8;
        int t=30;
        var vf=vi+a*t;
        System.out.println("la velocidad final del auto es "+vf);


    }  
}
