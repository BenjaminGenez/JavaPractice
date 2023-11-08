package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bubblegum = 202;
        int toffee = 118;
        int ice = 2250;
        int milk = 1680;
        int doughnut = 1075;
        int pancake = 80;

        int cleaner = 850;
        int vendor = 1120;
        int manager = 1300;
        int loader = 900;
        int electricity = 100;
        int municipalService = 90;
        int security = 30;
        System.out.println("Earned Amount:");
        System.out.println("Bubblegum:   $" + bubblegum);
        System.out.println("Toffee: $" + toffee);
        System.out.println("Ice cream:   $" + ice);
        System.out.println("Milk chocolate: $" + milk);
        System.out.println("Doughnut: $" + doughnut);
        System.out.println("Pancake: $" + pancake);
        System.out.println();
        int total = bubblegum + toffee + ice + milk + doughnut + pancake;
        System.out.println("Income: $" + total);



        System.out.println("Staff expenses: ");
        String staffExpenses = scanner.next();
        System.out.println("Other expenses");
        String otherExpense = scanner.next();

        int expense = cleaner + vendor + manager + loader + electricity + security + municipalService;
        int netIncome = total - expense;
        System.out.println("Net income: $" + netIncome);



    }
}