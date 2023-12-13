package advance.Exeception;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int num = sc.nextInt();
        int factorial = 1;
        for (int index = 1; index <= num; index++) {
            factorial = factorial * index;
        }
        System.out.println("el factorial " + num + " es: " + factorial);


    }
}