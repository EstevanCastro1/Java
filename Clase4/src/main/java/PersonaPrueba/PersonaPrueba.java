/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaPrueba;
import paquetepersona.Persona;

/**
 *
 * @author Estevan Castro
 */
public class PersonaPrueba {

    public static void main(String[] args) {
        Persona obj1= new Persona("Federico", 30000, false);
        System.out.println(obj1.getNombre());
        obj1.setNombre("Carlos");
        System.out.println(obj1.getNombre());
        System.out.println(obj1.toString());
    }
    
}
