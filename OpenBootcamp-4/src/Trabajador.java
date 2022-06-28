public class Trabajador extends Persona {

    private double salario;


    public Trabajador(int edad, int telefono, String nombre, double salario) {
        super(edad, telefono, nombre);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
