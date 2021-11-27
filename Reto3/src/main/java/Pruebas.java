
import java.util.Date;

public class Pruebas {

    public static void main(String[] args) {
        ////////////////////// Cliente 1 ///////////////////////////////////////////////
        Cliente cliente1 = new Cliente("100513551", 18, "Carlos");
        MotoAcuatica moto1 = new MotoAcuatica("LDA432", "RXT", "Sea-Doo");
        //(2021/07/18)
        Date fecha1 = new Date(121, 6, 18);
        Alquiler alquiler1 = new Alquiler(1, cliente1, moto1, fecha1, 1);
        System.out.println("Cliente: " + cliente1.getNombre() + " el costo del alquiler es: " + alquiler1.CalcularCosto());

        ////////////////////// Cliente 2 ///////////////////////////////////////////////
        Cliente cliente2 = new Cliente("10009931", 14, "Charlie");
        MotoAcuatica moto2 = new MotoAcuatica("LDA432", "RXT", "Sea-Doo");
        //(2021/07/18)
        Date fecha2 = new Date(121, 6, 18);
        Alquiler alquiler2 = new Alquiler(1, cliente2, moto2, fecha2, 1);
        System.out.println("Cliente: " + cliente2.getNombre() + " el costo del alquiler es: " + alquiler2.CalcularCosto());

        ////////////////////// Historial Numero 1 ///////////////////////////////////////////////
        Alquiler alquiler[] = new Alquiler[5];
        Cliente cliente3 = new Cliente("100009931", 20, "Carlos");
        MotoAcuatica moto3 = new MotoAcuatica("LDA432", "RXT", "Sea-Doo");
        //(2021/07/16)
        Date fecha3 = new Date(121, 6, 16);
        alquiler[0] = new Alquiler(1, cliente3, moto3, fecha3, 1);

        ////////////////////// Historial Numero 2 ///////////////////////////////////////////////
        Cliente cliente4 = new Cliente("100009931", 20, "Carlos");
        MotoAcuatica moto4 = new MotoAcuatica("LDA432", "RXT", "Sea-Doo");
        //(2021/07/18)
        Date fecha4 = new Date(121, 6, 18);
        alquiler[1] = new Alquiler(2, cliente4, moto4, fecha4, 2);

        ////////////////////// Historial Numero 3 ///////////////////////////////////////////////
        Cliente cliente5 = new Cliente("100009931", 20, "Carlos");
        MotoAcuatica moto5 = new MotoAcuatica("PDA432", "RXT", "Sea-Doo");
        //(2021/07/19)
        Date fecha5 = new Date(121, 6, 19);
        alquiler[2] = new Alquiler(6, cliente5, moto5, fecha5, 4);

        ////////////////////// Historial Numero 4 /////////////////////////////////////////////// 
        Cliente cliente6 = new Cliente("100009931", 20, "Carlos");
        MotoAcuatica moto6 = new MotoAcuatica("ZDA432", "RXT", "Sea-Doo");
        //(2021/07/14)
        Date fecha6 = new Date(121, 6, 14);
        alquiler[3] = new Alquiler(0, cliente6, moto6, fecha6, 3);

        /////////////////////// Historial numero 5 //////////////////////////////////////////////
        Cliente cliente7 = new Cliente("100009931", 20, "Carlos");
        MotoAcuatica moto7 = new MotoAcuatica("DDA432", "RXT", "Sea-Doo");
        //(2021/07/26)
        Date fecha7 = new Date(121, 6, 26);
        alquiler[4] = new Alquiler(8, cliente7, moto7, fecha7, 4);

        /////////////////////// Primera Validacion de Historial //////////////////////////////////
        //(2021/07/16)
        Date min = new Date(121, 6, 16);
        //(2021/07/20)
        Date max = new Date(121, 6, 20);
        Alquiler.VentasPorDias(alquiler, min, max);
        System.out.println("Cliente: " + cliente1.getNombre() + " el costo del alquiler es: " + Alquiler.VentasPorDias(alquiler, min, max));

        /////////////////////// Segunda Validacion de Historial /////////////////////////////////
        //(2021/07/19)
        Date min2 = new Date(121, 6, 19);
        //(2021/07/26)
        Date max2 = new Date(121, 6, 26);
        System.out.println("Cliente: " + cliente1.getNombre() + " el costo del alquiler es: " + Alquiler.VentasPorDias(alquiler, min2, max2));
        
        
        
        Alquiler alquileres[] = new Alquiler[3];
        Cliente cliente8 = new Cliente("100009931", 14, "Juanito");
        MotoAcuatica moto8 = new MotoAcuatica("DDA432", "RXT", "Sea-Doo");
        Date fecha8 = new Date(121, 6, 31);
        alquileres[0] = new Alquiler(23, cliente8, moto8, fecha8, 2);
        
        Cliente cliente9 = new Cliente("100009931", 43, "Juan");
        MotoAcuatica moto9 = new MotoAcuatica("DDA432", "RXT", "Sea-Doo");
        Date fecha9 = new Date(121, 6, 31);
        alquileres[1] = new Alquiler(24, cliente9, moto9, fecha9, 2);
        
        Cliente cliente10 = new Cliente("100009931", 23, "Carlos");
        MotoAcuatica moto10 = new MotoAcuatica("DDA432", "RXT", "Sea-Doo");
        Date fecha10 = new Date(121, 6, 31);
        alquileres[2] = new Alquiler(25, cliente10, moto10, fecha10, 4);
        System.out.println(alquileres[1].getCliente());
        
    }

}
