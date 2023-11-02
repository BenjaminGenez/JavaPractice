package Practice.Arrays;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numero de alumnos: ");
        int numAlumnos = scanner.nextInt();

        int[] notas = new int[numAlumnos];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }

        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        int notaMedia = suma / numAlumnos;

        System.out.println("La nota media del grupo es: " + notaMedia);

        System.out.println("alumnos con notas superiores a la media:");
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] > notaMedia) {
                System.out.println("alumno " + (i + 1) + ": " + notas[i]);
            }
        }
    }
}


