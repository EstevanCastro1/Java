import java.util.Scanner;
public class Hora {
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre del trabajador");
        Scanner consola=new Scanner(System.in);
        var Nombre=consola.nextLine();
        System.out.println("Ingrese Horas Trabajadas");
        int Horas=consola.nextInt();
        System.out.println("Ingrese el Valor de la hora");
        int Valor=consola.nextInt();
        var gan=Horas*Valor;
        System.out.println("Empleado " + Nombre+" Usted Trabajo "+ Horas+" Horas"+" Su salario es de "+ gan);

        
    }
}


