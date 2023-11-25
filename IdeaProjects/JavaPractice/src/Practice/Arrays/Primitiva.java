package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Arrays;

import java.util.HashSet;
import java.util.Random;

public class Primitiva {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> numeros = new HashSet<>();


        while (numeros.size() < 6) {
            int numeroAleatorio = 1 + random.nextInt(49);
            numeros.add(numeroAleatorio);
        }
        System.out.println("for later");

        System.out.println("ve tu suerte:  " + numeros);
    }
}

