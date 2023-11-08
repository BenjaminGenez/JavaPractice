package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

public class Tecnico extends Empleado {

    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Nombre del " +
                "Tecnico= " + nombre ;
    }
}
