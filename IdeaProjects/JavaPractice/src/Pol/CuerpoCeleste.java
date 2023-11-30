package Practice.Hyperskill.Methods.JavaPractice.src.Pol;

import java.util.ArrayList;
import java.util.List;

// Clase base para cualquier cuerpo celeste
abstract class CuerpoCeleste {
    protected String nombre;
    protected double masa;
    protected double diametroMedio;
    protected double periodoRotacion;

    public CuerpoCeleste(String nombre, double masa, double diametroMedio, double periodoRotacion) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametroMedio = diametroMedio;
        this.periodoRotacion = periodoRotacion;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Diámetro medio: " + diametroMedio + " km");
        System.out.println("Período de rotación: " + periodoRotacion + " horas");
    }
}

// Clase para representar estrellas (como el Sol)
class Estrella extends CuerpoCeleste {
    private String tipoEspectral;

    public Estrella(String nombre, double masa, double diametroMedio, double periodoRotacion, String tipoEspectral) {
        super(nombre, masa, diametroMedio, periodoRotacion);
        this.tipoEspectral = tipoEspectral;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo espectral: " + tipoEspectral);
    }
}

// Clase para representar planetas
class Planeta extends CuerpoCeleste {
    private double periodoTraslacion;
    private double distanciaMediaAlSol;
    private double excentricidadOrbita;
    private List<Satelite> satelites;

    public Planeta(String nombre, double masa, double diametroMedio, double periodoRotacion,
                   double periodoTraslacion, double distanciaMediaAlSol, double excentricidadOrbita) {
        super(nombre, masa, diametroMedio, periodoRotacion);
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.excentricidadOrbita = excentricidadOrbita;
        this.satelites = new ArrayList<>();
    }

    public void añadirSatelite(Satelite satelite) {
        satelites.add(satelite);
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Período de traslación: " + periodoTraslacion + " días");
        System.out.println("Distancia media al Sol: " + distanciaMediaAlSol + " km");
        System.out.println("Excentricidad de la órbita: " + excentricidadOrbita);
        for (Satelite satelite : satelites) {
            satelite.imprimirInformacion();
        }
    }
}

// Clase para representar satélites (como la Luna)
class Satelite extends CuerpoCeleste {
    private Planeta planetaOrbita;
    private double distanciaMediaAlPlaneta;
    private double excentricidadOrbita;

    public Satelite(String nombre, double masa, double diametroMedio, double periodoRotacion,
                    Planeta planetaOrbita, double distanciaMediaAlPlaneta, double excentricidadOrbita) {
        super(nombre, masa, diametroMedio, periodoRotacion);
        this.planetaOrbita = planetaOrbita;
        this.distanciaMediaAlPlaneta = distanciaMediaAlPlaneta;
        this.excentricidadOrbita = excentricidadOrbita;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Orbita alrededor de: " + planetaOrbita.nombre);
        System.out.println("Distancia media al planeta: " + distanciaMediaAlPlaneta + " km");
        System.out.println("Excentricidad de la órbita: " + excentricidadOrbita);
    }
}
