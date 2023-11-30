package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;

public class Estudiante extends Persona {
    private String idEstudiante;


    public Estudiante() {
        super();
    }


    public Estudiante(String nombre, String apellidos, String NIF, Direccion direccion, String idEstudiante) {
        super.setNombre(nombre);
        super.setApellidos(apellidos);
        super.setNIF(NIF);
        super.setDireccion(direccion);
        this.idEstudiante = idEstudiante;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }


    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }


    @Override
    public String toString() {
        return super.toString() + ", Estudiante: " +
                "idEstudiante='" + idEstudiante + '\'';
    }
}
