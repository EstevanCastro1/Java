import java.util.Scanner;
public class Vectores {
    public static void main(String args[]) {
        //Primera Forma
        System.out.println("Ingrese el ID:");
        Scanner consola=new Scanner(System.in);
        var id=consola.nextLine();
        var id1=consola.nextLine();
        var id2=consola.nextLine();
        String _Identificador[]=new String[3];
        _Identificador[0]=id;
        _Identificador[1]=id1;
        _Identificador[2]=id2;
        // Segunda Forma
        int vect2[]={1,2,3,4,5,6};
        // Recorrer Vector
        for (var i=0;i<_Identificador.length;i++){
            System.out.println(_Identificador[i]+" , ");
        }
        // Declarar Matriz 
        int mat[][]=new int[3][2];
        // o tambien
        //int mat[][]={{1,2},{3,2},{5,6}};
    }   

}
