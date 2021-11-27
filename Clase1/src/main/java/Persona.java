/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estevan Castro
 */
public class Persona {
    private String nombre;
    
    public Persona(){
        
    }
    public Persona(String nombre1){
        nombre=nombre1;
    }
    public static String imprimirNombre(String name){
        return name;
    
    }
    public void imprimir(){
        System.out.println("Mi nombre es "+nombre);
    }
}
