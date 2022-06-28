public class Cliente extends Persona {

    private double credito;


    public Cliente(int edad, int telefono, String nombre, double credito) {
        super(edad, telefono, nombre);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
