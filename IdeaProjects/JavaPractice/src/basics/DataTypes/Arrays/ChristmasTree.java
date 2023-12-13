package basics.DataTypes.Arrays;

public class ChristmasTree {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6 };
        int count = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(numeros[count] + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Merry Christmas!");
    }

}
