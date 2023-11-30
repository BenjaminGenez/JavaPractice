package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;

public class Profesor extends Persona {
    private String despacho;

    // Constructores predeterminado y parametrizado
    public Profesor(String nombre, String apellidos, String NIF, Direccion direccion, String despacho) {
        super(nombre, apellidos, NIF, direccion);
        this.despacho = despacho;
    }

    // Métodos accesores y mutadores
    // toString()
}
