/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estevan Castro
 */
//Para indicar que una clase hereda de otra se agrega la plabara extends seguido el nombre de la clase

public class HijaHerencia  extends TemaHerencia {
    protected String cargo;
    
    // OJO los contructores no se heredan

    public HijaHerencia(String nombre, int edad, String cargo ) {
        super(nombre, edad);
        this.cargo=cargo;
    }  

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clase Padre: ").append(super.toString());
        sb.append("Cargo: ").append(cargo);
        sb.append('}');
        return sb.toString();
    }
//    public void imprimirNombre(){
//        System.out.println("Nombre desde la clase hija "+nombre);
//    
//    }
    
    
    
    
}
