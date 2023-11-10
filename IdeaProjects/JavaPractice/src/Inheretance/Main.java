package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        // Asigna objetos de las clases anteriores con los valores deseados
        electrodomesticos[0] = new Lavadora(200, 30, "blanco", 'A', 40);
        electrodomesticos[1] = new Television(500, 10, "negro", 'B', 50, true);
        // ...

        // Recorre el array y ejecuta el método precioFinal()
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

        // Imprime los resultados
        System.out.println("Precio total de electrodomésticos: " + precioTotalElectrodomesticos);
        System.out.println("Precio total de lavadoras: " + precioTotalLavadoras);
        System.out.println("Precio total de televisiones: " + precioTotalTelevisiones);
    }
}
