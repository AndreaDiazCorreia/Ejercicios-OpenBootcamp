public class Main {

    public static void main(String[] args){

        Cliente cliente = new Cliente(27, 6665556, "Andrea", 27000.400);
        System.out.println("Mi nombre es " + cliente.getNombre() + " tengo " + cliente.getEdad() + " años de edad, mi telefono es " + cliente.getTelefono() + " y mi credito es " + cliente.getCredito() + " $");

        Trabajador trabajador = new Trabajador(25, 77788887, "Adrian", 100000.90);
        System.out.println("Mi nombre es " + trabajador.getNombre() + " tengo " + trabajador.getEdad() + " años de edad, mi telefono es " + trabajador.getTelefono() + " y mi salario es " + trabajador.getSalario() + " $");
    }
}
