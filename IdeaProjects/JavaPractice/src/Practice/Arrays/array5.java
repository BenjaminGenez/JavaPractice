package Practice.Arrays;

public class array5 {
    public static void main(String[] args) {
        int[] numeros = {1, -2, 0, 5, -7, 0, 10, -3, 0, 8};
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Número de elementos positivos: " + positivos);
        System.out.println("Número de elementos negativos: " + negativos);
        System.out.println("Número de ceros: " + ceros);
    }
}

