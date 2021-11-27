import java.util.Scanner;
public class Funciones{

    public static void saludo(){
        System.out.println("Hola, Bienvenido ");
    }
    public static int suma(int num1, int num2){
        return num1+num2;
    }
    public static boolean mayor(int n){
        return n>0;
    }   
    public static void main(String[]args){
        Scanner consola=new Scanner(System.in);
        saludo();
        int a=3;
        int b=6;
        var resultado=suma(a,b);
        System.out.println("El resultado es: " +resultado);
        System.out.println("El resultado es: " +suma(a,b));
        
        if (mayor(resultado)){
            System.out.println(mayor(resultado));
            System.out.println("el numero es mayor que cero");
        }else{
            System.out.println("el numero es menor que cero"); 
        }
    }

}