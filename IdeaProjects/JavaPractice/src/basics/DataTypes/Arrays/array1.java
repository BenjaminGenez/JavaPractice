package Practice.Arrays;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];




        for ( int i = 0; i < 10; i++){
            System.out.println("introduzca un numero:");
            numeros[i] = scanner.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < 10; i++){
            suma += numeros[i];

        }
        System.out.println(" la media vale" + 10 % 2);
    }
}

