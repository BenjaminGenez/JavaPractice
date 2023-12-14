package advance.Exeception;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("ingres una cadena de caracteres");
            String lect_teclado = scanner.nextLine();

            int posicion = 7;
            char caracterEnPosicion = caracterEn(lect_teclado, posicion);

            System.out.println("el caracter en la posicion " + posicion + " es: " + caracterEnPosicion);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("error");
        }
    }

    private static char caracterEn(String cadena, int posicion) {
        return cadena.charAt(posicion);
    }
}
