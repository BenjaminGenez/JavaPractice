package Practice.Hyperskill.Methods;

// Define a class named "Person"
class Person {
    // Instance variables
    private String name;
    private int age;

    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to test the Person class
public class Main {
    public static void main(String[] args) {
        // Create a new Person object using the constructor
        Person person1 = new Person("Alice", 30);

        // Call the displayInfo method to show the person's information
        person1.displayInfo();

        // Create another Person object
        Person person2 = new Person("Bob", 25);

        // Call the displayInfo method for the second person
        person2.displayInfo();
    }
}
