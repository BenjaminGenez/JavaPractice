package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Inheretance;

public class TestAnimals {
    public static void main(String[] args) {
        // Using the constructor with all properties
        Animals lion = new Animals("Leo", 5, 4, 1.2);
        System.out.println("Created lion with all properties: " + lion);

        // Using the overloaded constructor with two properties
        Animals cat = new Animals("Whiskers", 3);
        System.out.println("Created cat with two properties (default paws and altura): " + cat);

        // Testing the getters
        System.out.println("The lion's age is: " + lion.getAgeAnimal());
        System.out.println("The cat's number of paws: " + cat.getPaws());

        // Testing the setters with valid values
        lion.setAgeAnimal(6);
        cat.setPaws(3); // Let's say our cat is special with 3 paws
        System.out.println("The lion's new age after using setter: " + lion.getAgeAnimal());
        System.out.println("The cat's new number of paws after using setter: " + cat.getPaws());

        // Testing the setters with invalid values
        lion.setAgeAnimal(-1); // This should not change the age and print a warning
        cat.setAltura(-0.5); // This should not change the altura and print a warning

        // Testing the additional behavior method
        lion.makeSound(); // Should print out that the lion makes a sound
        cat.makeSound(); // Should print out that the cat makes a sound

        // Printing the animals' info to see the current state
        System.out.println("Current state of lion: " + lion);
        System.out.println("Current state of cat: " + cat);
    }
}

