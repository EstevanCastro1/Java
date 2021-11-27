
public class PruebaPoli {

    public static void main(String[] args) {
        Persona obejPersona = new Persona(30, "Luis");

        System.out.println("Imprirmir desde la clase persona" + obejPersona.imprimirInfo());

        Empleado oEmpleado = new Empleado("Cundinamarca", 20, "Melisa");
        System.out.println("Imprirmir desde la clase persona" + oEmpleado.imprimirInfo());
        imprimirPoliformismo(obejPersona);
    }

    public static void imprimirPoliformismo(Persona nombreParametro) {
        System.out.println("Imprimir Ejmplo" + nombreParametro.imprimirInfo());

    }
}
