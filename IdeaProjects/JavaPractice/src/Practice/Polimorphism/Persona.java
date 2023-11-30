package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;

public class Persona implements Humano {
    private String nombre;
    private String apellidos;
    private String NIF;
    private Direccion direccion;

    // Constructor parametrizado y métodos accesores y mutadores
    public Persona(String nombre, String apellidos, String NIF, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.direccion = direccion;
    }

    @Override
    public void identificate() {
        System.out.println("Soy una persona y mi nombre es " + this.nombre);
    }

    // toString()
}
