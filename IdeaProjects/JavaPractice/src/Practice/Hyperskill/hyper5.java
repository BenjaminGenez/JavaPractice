package Practice.Hyperskill;

import java.util.Scanner;
/*Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
There is always an element divisible by 4 in the sequence and the number of elements does not exceed 1000.

As input, the program receives the number of elements in the sequence n (first line) and then the elements themselves (next n lines).
The program should print a single number: the maximum element of the sequence divisible by 4.

Try to solve this problem by using a for-loop.*/

public class hyper5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] table = new int[number];

        //int max = array[0];


        for (int index = 0; index < number; index++) {
            //for ()

            int result = number / 4;
            System.out.println(result);
        }


    }
}


/*public class FindMaxMinUsingLoop {
    public static void main(String[] args) {
        int[] array = {5, 12, 9, 18, 3, 21};

        int max = array[0]; // Assume the first element is the maximum initially
        int min = array[0]; // Assume the first element is the minimum initially

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update maximum value
            }

            if (array[i] < min) {
                min = array[i]; // Update minimum value
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}*/