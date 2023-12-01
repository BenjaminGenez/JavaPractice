package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Interfaces;

public class App {
    public static void main(String[] args) {

        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        series[0] = new Serie("Serie A", 5, "Género A", "Creador A");
        series[1] = new Serie("Serie B", "Creador B");
        series[2] = new Serie("Serie C", 7, "Género C", "Creador C");
        series[3] = new Serie("Serie D", "Creador D");
        series[4] = new Serie("Serie E", 2, "Género E", "Creador E");

        videojuegos[0] = new Videojuego("Videojuego A", 50, "Género A", "Compañía A");
        videojuegos[1] = new Videojuego("Videojuego B", 20);
        videojuegos[2] = new Videojuego("Videojuego C", 30, "Género C", "Compañía C");
        videojuegos[3] = new Videojuego("Videojuego D", 10);
        videojuegos[4] = new Videojuego("Videojuego E", 40, "Género E", "Compañía E");


        series[1].entregar();
        videojuegos[0].entregar();
        series[3].entregar();
        videojuegos[4].entregar();


        int seriesEntregadas = contarEntregados(series);
        int videojuegosEntregados = contarEntregados(videojuegos);

        System.out.println("Hay " + seriesEntregadas + " series entregadas.");
        System.out.println("Hay " + videojuegosEntregados + " videojuegos entregados.");

        Serie serieConMasTemporadas = obtenerMaximo(series);
        Videojuego videojuegoConMasHoras = obtenerMaximo(videojuegos);

        System.out.println("La serie con más temporadas es: " + serieConMasTemporadas);
        System.out.println("El videojuego con más horas estimadas es: " + videojuegoConMasHoras);
    }

    public static int contarEntregados(Entregable[] entregables) {
        int entregados = 0;
        for (Entregable e : entregables) {
            if (e.isEntregado()) {
                entregados++;
                e.devolver();
            }
        }
        return entregados;
    }

    public static Serie obtenerMaximo(Serie[] series) {
        Serie max = series[0];
        for (int i = 1; i < series.length; i++) {
            if (series[i].compareTo(max) > 0) {
                max = series[i];
            }
        }
        return max;
    }

    public static Videojuego obtenerMaximo(Videojuego[] videojuegos) {
        Videojuego max = videojuegos[0];
        for (int i = 1; i < videojuegos.length; i++) {
            if (videojuegos[i].compareTo(max) > 0) {
                max = videojuegos[i];
            }
        }
        return max;
    }
}
