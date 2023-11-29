
package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Arrays;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Primitiva {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> numeros = new HashSet<>();

        while (numeros.size() < 6) {
            int numeroAleatorio = 1 + random.nextInt(49);
            numeros.add(numeroAleatorio);
        }

        // Convert HashSet to ArrayList
        List<Integer> sortedNumeros = new ArrayList<>(numeros);

        bubbleSort(sortedNumeros);


        System.out.println("Ve tu suerte: " + sortedNumeros);
    }


    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap list[j+1] and list[j]
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}



