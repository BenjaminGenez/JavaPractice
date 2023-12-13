package basics.DataTypes.Arrays;

public class Fruits {
    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Orange";
        fruits[2] = "Banana";

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}