public class Main {

    public static void main(String[] args){
        Persona persona = new Persona("Andrea", 27, 11111111);
        System.out.println("Mi nombre es "+ persona.getNombre());
        System.out.println("Tengo "+ persona.getEdad() + " años");
        System.out.println("Mi telefono es " + persona.getTelefono());

        Persona persona2 = new Persona();
        persona2.setNombre("Adrian");
        System.out.println("Mi nombre es "+ persona2.getNombre());
        persona2.setEdad(25);
        System.out.println("Tengo "+ persona2.getEdad() + " años");
        persona2.setTelefono(2222222);
        System.out.println("Mi telefono es " + persona2.getTelefono());
    }

}
