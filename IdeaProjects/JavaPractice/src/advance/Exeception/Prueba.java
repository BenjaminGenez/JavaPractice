package advance.Exeception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        boolean test;
        do {
            test = false;
            try {
                System.out.println("Introzca el término cuadrático: ");
                a = sc.nextInt();
                System.out.println("Introzca el término lineal: ");
                b = sc.nextInt();
                System.out.println("Introzca el término independiente: ");
                c = sc.nextInt();
            } catch (InputMismatchException e) {
                test = true;
                System.out.println("Tiene que usar números enteros!!!");
                sc.next();
            }
        } while (test);
    }
}
