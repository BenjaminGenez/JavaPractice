package Practice;

import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int totalSum = 0;
        for (int i = a; i <= b; i++) {
            totalSum += i;
        }

        System.out.println(totalSum);

    }
}
