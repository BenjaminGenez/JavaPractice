package Practice.Hyperskill;

import java.util.Scanner;

public class hyper6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;
        int contador = 0;

        for (int index = 0; index < 10; index++) {
            System.out.print("Introduce el numer" + (index + 1) + ": ");
            numeros[index] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i += 2) {
            suma += numeros[i];
            contador++;
        }

        double media = (double) suma / contador;
        System.out.println("...: " + media);


    }

}
