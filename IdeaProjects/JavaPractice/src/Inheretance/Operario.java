package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

public class Operario extends Empleado {

    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Nombre del " +
                "Operario= " + nombre;
    }
}
