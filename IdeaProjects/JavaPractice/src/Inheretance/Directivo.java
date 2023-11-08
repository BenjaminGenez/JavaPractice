package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

public class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado" + nombre ;
    }
}
