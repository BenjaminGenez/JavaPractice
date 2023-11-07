import java.util.Scanner;

class StringCategory {
    private String stringValue;
    private int category;

    // Constructor
    public StringCategory(String value, int category) {
        this.stringValue = value;
        this.category = category;
    }

    public String getStringValue() {
        return stringValue;
    }

    public int getCategory() {
        return category;
    }
}

public class StringCategorizationWithConstructor {

    public static void main(String[] args) {
        // Create StringCategory objects for each string
        StringCategory stringOne = new StringCategory("this is the name of an animal", 1);
        StringCategory stringTwo = new StringCategory("second string", 2);
        StringCategory stringThree = new StringCategory("third string", 3);
        StringCategory stringFour = new StringCategory("fourth string", 4);
        StringCategory stringFive = new StringCategory("fifth string", 5);

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 to 5) or >5 to find corresponding string: ");

        // Read user input
        String input = scanner.nextLine();
        scanner.close();

        try {
            int category = Integer.parseInt(input);
            String result = null;

            switch (category) {
                case 1:
                    result = stringOne.getStringValue();
                    break;
                case 2:
                    result = stringTwo.getStringValue();
                    break;
                case 3:
                    result = stringThree.getStringValue();
                    break;
                case 4:
                    result = stringFour.getStringValue();
                    break;
                case 5:
                    result = stringFive.getStringValue();
                    break;
                default:
                    if (category > 5) {
                        result = "No corresponding string found for input >5";
                    } else {
                        result = "Invalid category";
                    }
            }

            System.out.println("String for category " + category + ": " + result);
        } catch (NumberFormatException e) {
            // Handle invalid input (non-integer)
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
