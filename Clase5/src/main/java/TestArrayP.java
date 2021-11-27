/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estevan Castro
 */
import java.util.Date;
public class TestArrayP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int numero=1;
        //ArrayP objvariable=new ArrayP(2,"3");
//        int edades[]=new int[3];
//        edades[0]=1;
//        edades[1]=3;
//        edades[2]=14;
//        for (int i=0; i<edades.length;i++){
//            System.out.println(" Posicion="+i+" Valor="+edades[i]);
        Persona p=new Persona("Techo");
       
        ArrayP pruebas[]= new ArrayP[2];
        pruebas[0]=new ArrayP(1,"ew",p);
        pruebas[1]=new ArrayP(4,"rf",p);
        
        for (int i=0; i<pruebas.length;i++){
            System.out.println(pruebas[i].getClave()+" "+pruebas[i].getId()+" "+pruebas[i].getCasa());
        
        }
        
    }
}
    

