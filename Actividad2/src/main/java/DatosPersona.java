/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estevan Castro
 */
import java.util.Scanner;
public class DatosPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args) {
        //solicitar datos
        System.out.println("Ingrese Su Nombre: ");
        Scanner consola=new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        String nombre=consola.nextLine();
        System.out.println("Ingrese Su Edad: ");
        int edad=consola.nextInt();
        System.out.println("Ingrese Su Genero: ");
        String genero=entrada.nextLine();
        System.out.println("Ingrese Su Peso: ");
        int peso=consola.nextInt();
        System.out.println("Ingrese Su Altura: ");
        double altura=consola.nextDouble();
        
        //imprimir datos
        Persona objeto=new Persona(nombre,edad,genero,peso,altura);
        System.out.println("Usuario: "+nombre);
        System.out.print("Genero: ");
        objeto.comprobarGenero();
        System.out.println("Edad: "+edad+" años, "+objeto.comprobarMayorEdad());
        System.out.println("Su peso es de: "+peso+" Kg\nSu altura es de: "+altura+" metros");
        System.out.println("Su IMC es: "+objeto.indiceIMC());  
    }
    
}
