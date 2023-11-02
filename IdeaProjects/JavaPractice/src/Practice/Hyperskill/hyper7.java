package Practice.Hyperskill;

import java.util.Scanner;

public class hyper7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxDivisibleBy4 = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > maxDivisibleBy4) {
                maxDivisibleBy4 = num;
            }
        }

        System.out.println(maxDivisibleBy4);
    }
}

