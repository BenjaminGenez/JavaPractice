package Practice.Arrays;

import java.util.Scanner;

public class array6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaNegativos = 0;
        int contadorNegativos = 0;
        int sumaPositivos = 0;
        int contadorPositivos = 0;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();

            if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            } else if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            }
        }

        if (contadorNegativos > 0) {
            double mediaNegativos = (double) sumaNegativos / contadorNegativos;
            System.out.println("Media de los números negativos: " + mediaNegativos);
        } else {
            System.out.println("No se introdujeron números negativos.");
        }

        if (contadorPositivos > 0) {
            double mediaPositivos = (double) sumaPositivos / contadorPositivos;
            System.out.println("Media de los números positivos: " + mediaPositivos);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

        scanner.close();
    }
}
