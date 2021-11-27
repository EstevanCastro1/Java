import java.util.Scanner;
public class Calculadora {
   

    public static void main(String args[]) {
            System.out.println("Ingrese El Primer Numero");
            Scanner consola=new Scanner(System.in);
            var Num1=consola.nextInt();
            System.out.println("Ingrese El Segundo Numero");
            var Num2=consola.nextInt();
                System.out.println("Elige la Operacion\n 1)suma\n 2)resta\n 3)Multiplicacion\n 4)Division\n 5)Potencia\n 6)Raiz Cuadrada\n 7)Salir");
                var Opc=consola.nextInt();
                if(Opc==1){
                    int Suma=Num1+Num2;
                    System.out.println("La suma es "+Suma);
                
                }else if(Opc==2){
                    }else if (Num1>Num2){
                        int Resta=Num1-Num2;
                        System.out.println("La resta es "+Resta);
                    }else if (Num2>Num1){
                        int Resta=Num2-Num1;
                        System.out.println("La resta es "+Resta);
                }else if(Opc==3){
                    int Mul=Num1*Num2;
                    System.out.println("La Multiplicacion es "+Mul);

                }else if(Opc==4){
                    {if (Num1>0 && Num2>0){
                        int Div=Num1/Num2;
                        System.out.println("La Division es "+Div);
                    }if (Num1<0 || Num2<0){
                        System.out.println("Error, para hacer el calculo el numero debe ser mayor a cero");
                }else if(Opc==5){
                    System.out.println("Eliga 1 si quiere elevar "+Num1+" a la "+Num2+"\nEliga 2 si quiere elevar "+Num1+" a la "+Num2);
                    }var Po=consola.nextInt();
                    if (Po==1){ 
                        var elevar= Math.pow(Num1,Num2);
                        System.out.println("El resultado es "+elevar);
                    if (Po==2){ 
                        var elevar2= Math.pow(Num2,Num1);
                        System.out.println("El resultado es "+elevar2);

    }
    }
    }
    }  
    }
}