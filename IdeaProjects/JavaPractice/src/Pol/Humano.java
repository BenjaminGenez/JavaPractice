package Practice.Hyperskill.Methods.JavaPractice.src.Pol;

import java.util.Vector;

// Interfaz Humano
interface Humano {
    void identificate();
}

// Clase Direccion
class Direccion {
    private String calle;
    private String ciudad;
    private String codigoPostal;
    private String pais;

    // Constructor predeterminado
    public Direccion() {
        this("", "", "", "");
    }

    // Constructor parametrizado
    public Direccion(String calle, String ciudad, String codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    // Métodos accedentes y mutadores
    // ...
}

// Clase Persona actualizada
class Persona implements Humano {
    private String nombre;
    private String apellidos;
    private String NIF;
    private Direccion direccion;

    // Constructor, getters y setters
    // ...

    @Override
    public void identificate() {
        System.out.println("Tipo: Persona");
    }
}

// Clase Estudiante
class Estudiante extends Persona {
    private String idEstudiante;

    // Constructor predeterminado, parametrizado, getters, setters y toString
    // ...
}

// Clase Profesor
class Profesor extends Persona {
    private String despacho;


}


