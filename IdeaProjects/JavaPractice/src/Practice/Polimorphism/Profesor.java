package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;

public class Profesor extends Persona {
    private String despacho;


    public Profesor() {
        super();
    }

    public Profesor(String nombre, String apellidos, String NIF, Direccion direccion, String despacho) {
        super.setNombre(nombre);
        super.setApellidos(apellidos);
        super.setNIF(NIF);
        super.setDireccion(direccion);
        this.despacho = despacho;
    }


    public String getDespacho() {
        return despacho;
    }


    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }


    @Override
    public String toString() {
        return super.toString() + ", Profesor{" +
                "despacho='" + despacho + '\'' +
                '}';
    }
}
