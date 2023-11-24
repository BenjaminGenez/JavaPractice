package Practice.Hyperskill.Methods.JavaPractice.src.ExamT1;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        //String texto = "anana";
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca una palabra: ");
        String texto = scanner.next();

        if (esPalindromo(texto)) {
            System.out.println(texto + " es un palíndromo");
        } else {
            System.out.println(texto + " no es un palíndromo");
        }
    }

    public static boolean esPalindromo(String texto) {
        int inicio = 0;
        int fin = texto.length() - 1;
        while (inicio < fin) {
            if (texto.charAt(inicio) != texto.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }
}