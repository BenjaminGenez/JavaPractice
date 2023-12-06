package Practice.Hyperskill.Methods.JavaPractice.src.oop.Inheretance;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        Scanner scanner = new Scanner(System.in);


        // Initialize all array elements
        electrodomesticos[0] = new Lavadora(200, 30, "blanco", 'A', 40);
        electrodomesticos[1] = new Television(500, 10, "negro", 'B', 50, true);
        electrodomesticos[2] = new Lavadora(300, 25, "rojo", 'C', 35);
        electrodomesticos[3] = new Television(600, 15, "azul", 'D', 45, false);
        // Initialize the rest of the array elements...

        // Recorre el array y ejecuta el método precioFinal()
        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisiones = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            // Check if the element is not null before using it
            if (electrodomestico != null) {
                double precioFinal = electrodomestico.precioFinal();
                precioTotalElectrodomesticos += precioFinal;

                if (electrodomestico instanceof Lavadora) {
                    precioTotalLavadoras += precioFinal;
                } else if (electrodomestico instanceof Television) {
                    precioTotalTelevisiones += precioFinal;
                }
            }
        }

        // Imprime los resultados
        System.out.println("Precio total de electrodomésticos: " + precioTotalElectrodomesticos);
        System.out.println("Precio total de lavadoras: " + precioTotalLavadoras);
        System.out.println("Precio total de televisiones: " + precioTotalTelevisiones);
    }
}


/*public class Test {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];


        electrodomesticos[0] = new Lavadora(200, 30, "blanco", 'A', 40);
        electrodomesticos[1] = new Television(500, 10, "negro", 'B', 50, true);
        electrodomesticos[2] = new Lavadora(300, 25, "rojo", 'C', 35);
        electrodomesticos[3] = new Television(600, 15, "azul", 'D', 45, false);

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisiones = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            precioTotalElectrodomesticos += precioFinal;

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            } else if (electrodomestico instanceof Television) {
                precioTotalTelevisiones += precioFinal;
            }
        }


        System.out.println("Precio total de electrodomésticos: " + precioTotalElectrodomesticos);
        System.out.println("Precio total de lavadoras: " + precioTotalLavadoras);
        System.out.println("Precio total de televisiones: " + precioTotalTelevisiones);
    }
}*/
