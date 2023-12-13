package advance.Exeception;

public class Throw {
    public static void main(String[] args) {
        int[] matriz = new int[5];

        try {
            matriz[6] = 34;

        } catch (ArrayIndexOutOfBoundsException e) {

            matriz[3]=3;
        }
    }

}
