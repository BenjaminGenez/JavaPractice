package Practice.ForLoop;

import java.util.Scanner;

public class for4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();

        int sumDivisibleBy6 = 0;

        for (int index = 0; index < n; index++) {
            int num = scanner.nextInt();
            if (num % 6 == 0) {
                sumDivisibleBy6 += num;
            }
        }

        System.out.println(sumDivisibleBy6);
    }

}
