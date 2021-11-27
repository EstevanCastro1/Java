
public class AlquilerMoto {

    private int Id;
    private String CedulaCliente;
    private int AnoNacimientoCliente;
    private String IdentificadorMoto;
    private int HorasAlquiler;

    public AlquilerMoto(int _Id, String _Cedula, int _AnoNacimiento, String _Identificador, int _Horas) {
        Id = _Id;
        CedulaCliente = _Cedula;
        AnoNacimientoCliente = _AnoNacimiento;
        IdentificadorMoto = _Identificador;
        HorasAlquiler = _Horas;
    }

    public double CalcularCosto() {
        var caracter = IdentificadorMoto.charAt(0);
        var texto = String.valueOf(caracter);
        double L = 30000;
        double D = 45000;
        double P = 90000;
        double X = 50000;
        int O = 0;
        var resultado = EsValido();
        if ("L".equals(texto) && resultado == true) {
            return (L * HorasAlquiler);
        } else if ("D".equals(texto) && resultado == true) {
            return (D * HorasAlquiler);
        } else if ("P".equals(texto) && resultado == true) {
            return (P * HorasAlquiler);
        } else if (resultado == false) {
            return (O);
        } else {
            return (X * HorasAlquiler);
        }

    }

    public boolean EsValido() {
        int res = 2021 - AnoNacimientoCliente;
        //System.out.println(res);
        return res >= 18;

    }

}
