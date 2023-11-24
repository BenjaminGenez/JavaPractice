package Practice.Hyperskill.Methods.JavaPractice.src.ExamT1;

public class Palindromo {

    public static void main(String[] args) {
        String texto = "anana";

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