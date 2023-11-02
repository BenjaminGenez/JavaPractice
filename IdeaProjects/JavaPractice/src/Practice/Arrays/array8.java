package Practice.Arrays;

import java.util.Scanner;

public class array8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombreEmpleadoMasGana = "";
        double sueldoEmpleadoMasGana = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Introduce el nombre del empleado #" + i + ": ");
            String nombre = scanner.next();
            System.out.print("Introduce el sueldo del empleado #" + i + ": ");
            double sueldo = scanner.nextDouble();

            if (sueldo > sueldoEmpleadoMasGana) {
                sueldoEmpleadoMasGana = sueldo;
                nombreEmpleadoMasGana = nombre;
            }
        }

        System.out.println("El empleado que mas gana es " + nombreEmpleadoMasGana +
                " con un sueldo de " + sueldoEmpleadoMasGana);

        scanner.close();
    }
}
