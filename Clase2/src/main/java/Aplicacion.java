/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estevan Castro
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n="Federico";
        Clasesnumero1 objeto=new Clasesnumero1(n, 34, 1.89);
        objeto.imprimirDatos();
        objeto.sumap();
        int resultado=objeto.sumapr();
        System.out.println("Metodo que me devuelve valor de la suma: "+resultado);
        System.out.println("en 6 años federico tendra "+objeto.edadanos(6));
        // TODO code application logic here
    }
    
}
