package yBookExamples;

import java.util.Scanner;

public class trimE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String input = scanner.nextLine();
        String change = input.replace(" ", "_");
        String upper = change.toUpperCase();


        System.out.println(upper.trim());
    }
}
