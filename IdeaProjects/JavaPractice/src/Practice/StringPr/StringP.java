package Practice.Hyperskill.Methods.JavaPractice.src.Practice.StringPr;

import java.util.Arrays;
import java.util.Scanner;

public class StringP{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce una palabra: ");
        String originalString = scanner.next();

        char[] chars = originalString.toCharArray();

        Arrays.sort(chars);

        String sortedString = new String(chars);
        System.out.println("Original: " + originalString);
        System.out.println("Ordenado: " + sortedString);

    }
}
