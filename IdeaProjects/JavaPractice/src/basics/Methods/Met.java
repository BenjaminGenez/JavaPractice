package basics.Methods;

public class Met {

    public static void display(int a) {

        System.out.println("Arguments: " + a);
    }

    public static void display(int a, int b)
    {
        System.out.println("Arguments: " + a + " and " + b);
    }

    // Method with three parameters
    public static void display(int a, int b, int c)
    {
        System.out.println("Arguments: " + a + ", " + b + ", and " + c);
    }

    public static void main(String[] args) {
        display(1);      // Calls the first method
        display(1, 2);   // Calls the second method
        display(1, 2, 3); // Calls the third method
    }
}