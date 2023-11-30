package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;

public class Estudiante extends Persona {
    private String ID;

    // Constructores predeterminado y parametrizado
    public Estudiante(String nombre, String apellidos, String NIF, Direccion direccion, String ID) {
        super(nombre, apellidos, NIF, direccion);
        this.ID = ID;
    }

    // Métodos accesores y mutadores
    // toString()
}
