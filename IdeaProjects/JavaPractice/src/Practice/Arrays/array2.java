package Practice.Arrays;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el numer" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i += 2) {
            suma += numeros[i];
            contador++;
        }

        double media = (double) suma / contador;
        System.out.println("La media de los numeros en las posiciones pares es: " + media);


    }

}
