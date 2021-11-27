
public class AlquilerMoto {
    private int Id;
    private String CedulaCliente;
    private int AnoNacimientoCliente;
    private String IdentificadorMoto;
    private int HorasAlquiler;

    public AlquilerMoto(int _Id, String _Cedula, int _AnoNacimiento, String _Identificador, int _Horas){
        System.out.println("Id: " +Id );
        System.out.println("CedulaCliente: "+CedulaCliente);
        System.out.println("AnoNacimientoCliente: "+AnoNacimientoCliente);
        System.out.println("IdentificadorMoto: "+IdentificadorMoto);
        System.out.println("HorasAlquiler: "+HorasAlquiler);
        
    
    }
    public static double CalcularCosto(String IdentificadorMoto, int HorasAlquiler){

    }



    public boolean EsValido(int _AnoNacimiento){
        return 18 >AnoNacimientoCliente;

    }
    

       
}
