
import java.util.Date;

public class Alquiler {

    private int Id;
    private Cliente Cliente;
    private MotoAcuatica Moto;
    private Date Fecha;
    private int HorasAlquiler;

    public Alquiler(int id, Cliente cliente, MotoAcuatica moto, int horasAlquiler) {
        this.Id = id;
        this.Cliente = cliente;
        this.Moto = moto;
        this.HorasAlquiler = horasAlquiler;
        this.Fecha = new Date();
    }

    public Alquiler(int Id, Cliente cliente, MotoAcuatica moto, Date fecha, int horasAlquiler) {
        this.Id = Id;
        this.Cliente = cliente;
        this.Moto = moto;
        this.Fecha = fecha;
        this.HorasAlquiler = horasAlquiler;
    }

    public Cliente getCliente() {
        String Cedula = Cliente.getCedula();
        int Edad = Cliente.getEdad();
        String Nombre = Cliente.getNombre();
        return Cliente;
    }

    public MotoAcuatica getMoto() {
        return Moto;
    }

    public Date getFecha() {
        return Fecha;
    }
    
    public int getHorasAlquiler() {
        return HorasAlquiler;
    }

    public int CalcularCosto() {
        var caracter = Moto.getIdentificador().charAt(0);
        var texto = String.valueOf(caracter);
        var resultado = (Cliente.getEdad() >= 18);
        if ("L".equals(texto) && resultado == true) {
            return (30000 * HorasAlquiler);
        } else if ("D".equals(texto) && resultado == true) {
            return (45000 * HorasAlquiler);
        } else if ("P".equals(texto) && resultado == true) {
            return (90000 * HorasAlquiler);
        } else if (resultado == false) {
            return 0;
        } else {
            return (50000 * HorasAlquiler);
        }

    }

    public static int VentasPorDias(Alquiler[] alquileres, Date min, Date max) {
        var resultado= 0;
        for (Alquiler alquilere : alquileres) {
            if ((alquilere.getFecha().after (min) || 
                 alquilere.getFecha().equals(min))&& 
                (alquilere.getFecha().before(max) || 
                 alquilere.getFecha().equals(max))) {
                 resultado = resultado + alquilere.CalcularCosto();
            }
        }
        return resultado;
    }
    public static Cliente DescuentoCliente(Alquiler[]alquileres){
        for (Alquiler alquilere : alquileres) {
            int resultado = alquilere.Cliente.getEdad();
            if (resultado>18) {
                return alquilere.getCliente();
            }
        }   
        return null;  
            
    }
       public static int ObtenerPublicoObjetivo(Alquiler[]alquileres){
           for (Alquiler alquilere : alquileres) {
               int resultado = alquilere.Cliente.getEdad();
               if (resultado>17&&resultado<31){
                   return 1;
               }else if (resultado>30&&resultado<46){
                   return 2;
               }else if (resultado>45&&resultado<61){
                   return 3;
                   
               }
               
           }
        return 4;
          
        
    }       
 
}
