package advance.Exeception;

public class Ecuacion {
    public static void main(String[] args) {
        try {
            int a = 1, b = 3, c = 2;
            double root1, root2;

            double determinant = b * b - 4 * a * c;
            if (determinant < 0) {
                throw new IllegalArgumentException("The equation has no real roots.");
            }

            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}