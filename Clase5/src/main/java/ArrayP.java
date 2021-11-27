/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estevan Castro
 */
public class ArrayP {
    private int id;
    private String Clave;
    private Persona casa;

    public ArrayP(int id, String Clave, Persona casa) {
        this.id = id;
        this.Clave = Clave;
        this.casa=casa;
    }
    
    public static String met (ArrayP[] arreglos){
        int l;
        for (int i=0; i<arreglos.length; i++){
            //l=arreglos[i];
        }
        return "2";
   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public Persona getCasa() {
        return casa;
    }

    public void setCasa(Persona casa) {
        this.casa = casa;
    }
    
    
}
