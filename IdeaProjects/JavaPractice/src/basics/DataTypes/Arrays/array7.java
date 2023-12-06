package Practice.Arrays;

import java.util.Scanner;

public class array7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de alturas: ");
        int n = scanner.nextInt();

        double sumaAlturas = 0;
        double[] alturas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce la altura #" + (i + 1) + " en centímetros: ");
            alturas[i] = scanner.nextDouble();
            sumaAlturas += alturas[i];
        }

        double alturaMedia = sumaAlturas / n;
        System.out.println("Altura media: " + alturaMedia + " centímetros");

        int alturasSuperiores = 0;
        int alturasInferiores = 0;
        for (int i = 0; i < n; i++) {
            if (alturas[i] > alturaMedia) {
                alturasSuperiores++;
            } else if (alturas[i] < alturaMedia) {
                alturasInferiores++;
            }
        }

        System.out.println("Alturas superiores a la media: " + alturasSuperiores);
        System.out.println("Alturas inferiores a la media: " + alturasInferiores);

        scanner.close();
    }
}
