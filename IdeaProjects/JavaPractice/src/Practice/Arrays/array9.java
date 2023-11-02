package Practice.Arrays;

import java.util.Random;

public class array9 {

    public static void main(String[] args) {
        int longitud = 10;

        Random random = new Random();

        int[] numerosAleatorios = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            numerosAleatorios[i] = random.nextInt(100);
        }

        System.out.print("Números aleatorios: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(numerosAleatorios[i] + " ");
        }
    }
}
