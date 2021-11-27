/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estevan Castro
 */
public class Clasesnumero1 {
    private String nombre;
    private int edad;
    private double estatura;

    public Clasesnumero1(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    
    public void imprimirDatos(){
        System.out.println("Su nombre es: "+nombre);
    }
    
    public void sumap(){
    int suma=2+3;
    System.out.println(suma);
            
    }
    
    public int sumapr(){
        return 2+3;
    }
    
    public int edadanos(int anos){
        return this.edad+anos;
    }
    
    

}
