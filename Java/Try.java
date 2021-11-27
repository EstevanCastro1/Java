import java.util.Scanner;
public class Try {
    public static void main(String args[]) {
        Scanner consola=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        try{
            int numero = consola.nextInt();
            System.out.println("El numero es: "+numero);
        }catch(Exception e){
            System.out.println("Solo ingrese un numero"); 
        }finally{
            System.out.println("Fin del proceso"); 
        }
        
    }
}
 