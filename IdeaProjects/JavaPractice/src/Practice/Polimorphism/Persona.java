package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;

public abstract class Persona implements Humano {
    private String nombre;
    private String apellidos;
    private String NIF;
    private Direccion direccion;

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


    @Override
    public void identificate() {
        System.out.println("Tipo: " + this.getClass().getSimpleName());
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", NIF='" + NIF + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
