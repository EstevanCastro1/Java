
public class AlquilerMotosAcuesticas {

    public static void main(String[] args) {
        AlquilerMoto obj = new AlquilerMoto(22, "10005489", 2006, "LDA432", 3);
        System.out.println("id: " + 22);
        System.out.println("CedulaCliente: " + 10005489);
        System.out.println("IdentificadorMoto: " + "LDA432");
        System.out.println("Salida: " + "La edad es: " + obj.EsValido() + " No es Valida");
        System.out.println("Valor: " + obj.CalcularCosto());

    }

}
