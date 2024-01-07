package advance;

public class integrals {
    public static void main(String[] args) {
        String tree = "Pine";
        int size = 0;
        boolean flag = true;

        if (tree.equals("Pine")) {
            size = 10;
        }
        else if (tree.equals("Oak")) {
            size = 20;
        }
        else if (tree.equals("Maple")) {
            size = 30;
        }
        else {
            flag = false;
        }

        while (flag) {
            System.out.println("The size of the tree is " + size);
            flag = false;
        }

        int year = 2016;
        flag = true;

        if (year == 2016) {
            System.out.println("The year is " + year);
        }
        else if (year == 2017) {
            System.out.println("The year is " + year);
        }
        else if (year == 2018) {
            System.out.println("The year is " + year);
        }
        else {
            flag = false;
        }

        while (flag) {
            System.out.println("The year is " + year);
            flag = false;
        }

        flag = true;
        String str = "Hello";
        System.out.println("Welcome to Java");

        if (str.equals("Hello")) {
            System.out.println("Hello");
        }
        else if (str.equals("Hi")) {
            System.out.println("Hi");
        }
        else {
            flag = false;
        }

        while (flag) {
            System.out.println("Welcome to Java");
            flag = false;
        }

    }
}
