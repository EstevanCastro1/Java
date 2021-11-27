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
    private int edad;
    private String genero;
    private int peso;
    private double altura;

    public Persona(String nombre, int edad, String genero, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void comprobarGenero(){
        
        switch(genero){
        case "h","H":
            System.out.println("Maculino");
            break;
        case "m","M":
            System.out.println("Femenino");
            break;
        default:
            System.out.println("Error, sin genero");
        }
    }
    public String comprobarMayorEdad(){
        if (edad>=18){
            return ("mayor de edad");
        }else{
            return ("menor de edad, debe de asistir con un adulto responsable");
        }
        
    }  
    public String indiceIMC(){
        var imc= (peso/(Math.pow(altura,2)));
        if (imc <20){ 
           return ("-1, el imc es menor que 20");
        }else if(imc >=20 && imc <26){
            return ("1, el imc esta entre 20 y 25 significa que esta por debajo de su peso");
        }else{
            return ("0, el imc es mayor a 25 y quiere decir que esta en sobre peso");
        }
        
    }
           
    
}
    

