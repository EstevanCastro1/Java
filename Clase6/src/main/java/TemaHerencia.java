/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estevan Castro
 */
//Se crea
public class TemaHerencia {
    //los Atributos padre deben ser protegidos
    //para que se puedan unar en sus subclases directamente
    protected String nombre;
    protected int edad;

    public TemaHerencia(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public TemaHerencia(String nombre) {
        this.nombre = nombre;
    }

    public TemaHerencia() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //OJO:  Siempre que vean un @ significa que es un indicador
    // El override que es una sobrescritura
    @Override
    public String toString() {
        return "TemaHerencia {" + "Nombre: " + nombre + ", Edad: " + edad + '}';
    }
    
    
    
    
}
