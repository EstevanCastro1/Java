
public class Empleado extends Persona{
    private String departamento;

    public Empleado(String departamento, int edad, String nombre) {
        super(edad, nombre);
        this.departamento = departamento;
    }
    @Override
    public String imprimirInfo(){
        return super.imprimirInfo()+"Estas en el departamento "+this.departamento;
    
    }
}
