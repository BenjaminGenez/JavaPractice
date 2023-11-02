package Practice.Arrays;

public class array4 {
    public static void main(String[] args) {
        int[] numerosPares = new int[20];

        int contador = 0;
        int numero = 2;


        while (contador < 20) {
            numerosPares[contador] = numero;
            numero += 2;
            contador++;
        }


        for (int i = 0; i < numerosPares.length; i++) {
            System.out.print(numerosPares[i] + " ");
        }
    }
}
