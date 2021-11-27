/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estevan Castro
 */
public class Caja {
   private int Ancho;
   private int Alto;
   private int Profundidad; 
    public Caja(){
    
    }
    public Caja(int Ancho, int Alto, int Profundidad) {
        this.Ancho = Ancho;
        this.Alto = Alto;
        this.Profundidad = Profundidad;
    }
   
     public int calcular(){
         int resultado= Ancho*Alto*Profundidad;
         return resultado;
    }
}
   