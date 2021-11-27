/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estevan Castro
 */
public class PruebaTemaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TemaHerencia objeto=new TemaHerencia("Carla",30);
        //System.out.println(objeto);
        //System.out.println(objeto.nombre);
        //System.out.println(objeto.getNombre());
        
        HijaHerencia objeto2 = new HijaHerencia("Erika",20,"Contadora");
        System.out.println(objeto2);
        
        HijaHerencia2 objeto3 = new HijaHerencia2("Erika",20,30000);
        System.out.println(objeto3);
        
        
    }
    
}
