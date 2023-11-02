package Practice.ForLoop;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();



        int result = (b / n) - ((a - 1) / n);
        System.out.println(result);
    }
}
