package Practice.Hyperskill.Methods;

public class Divided {
    public static void main(String[] args) {
        int a = 5;
        double result = divideByTwo(a);
        System.out.println("Result is: " + String.valueOf(result));
    }
    static double divideByTwo(int num) {


       return  (double) num / 2;
    }
}