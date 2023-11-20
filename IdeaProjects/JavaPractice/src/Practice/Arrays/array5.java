package Practice.Arrays;

public class array5 {
    public static void main(String[] args) {
        int[] numeros = {1, -2, 0, 5, -7, 0, 10, -3, 0, 8};
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        String test;
        int second = 3;


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }


        System.out.println(second);
        System.out.println("new");
        System.out.println("elementos positivos: " + positivos);
        System.out.println("elementos negativos: " + negativos);
        System.out.println("Número de ceros: " + ceros);
    }
}

