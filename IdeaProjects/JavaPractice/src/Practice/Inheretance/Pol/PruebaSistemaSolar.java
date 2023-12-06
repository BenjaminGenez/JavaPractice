package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Inheretance.Pol;

public class PruebaSistemaSolar {
    public static void main(String[] args) {
        Estrella sol = new Estrella("Sol", 1.989e30, 1.391e6, 587.28, "G2V");

        Planeta tierra = new Planeta("Tierra", 5.972e24, 12742, 24, 365.25, 1.496e8, 0.0167);
        Satelite luna = new Satelite("Luna", 7.34767309e22, 3474.8, 655.728, tierra, 3.844e5, 0.0549);

        tierra.añadirSatelite(luna);
        sol.imprimirInformacion();
        tierra.imprimirInformacion();
        luna.imprimirInformacion();
    }
}
