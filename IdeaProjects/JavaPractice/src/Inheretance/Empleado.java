package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

public class Empleado {

    public String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre del" +
                " Empleado= " + nombre ;
    }
}
