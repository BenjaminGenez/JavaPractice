package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

public class Oficial extends Empleado {

    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Nombre del " +
                "Oficial= " + nombre ;
    }
}
