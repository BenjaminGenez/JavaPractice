package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Arrays;



import java.util.Random;

public class Primitiva2{
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[6];
        int count = 0;

        while (count < 6) {
            int numeroAleatorio = 1 + random.nextInt(49);
            if (!contains(numeros, numeroAleatorio, count)) {
                numeros[count++] = numeroAleatorio;
            }
        }

        bubbleSort(numeros);

        // Print the sorted numbers
        System.out.print("Ve tu suerte: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public static boolean contains(int[] array, int value, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j+1] and array[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
