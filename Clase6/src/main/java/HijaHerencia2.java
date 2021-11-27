/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estevan Castro
 */

public class HijaHerencia2 extends TemaHerencia{

    private int sueldo;

    public HijaHerencia2(String nombre, int edad, int sueldo) {
        super(nombre, edad);
        this.sueldo=sueldo;
    }

    public HijaHerencia2(String nombre) {
        super(nombre);
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clase Padre: ").append(super.toString());
        sb.append("Sueldo: ").append(sueldo);
        
        sb.append('}');
        return sb.toString();
    }
    
    
}
