package advance.Exeception;

public class FactorialRecur {
    public static void main(String[] args) {
        System.out.println(factorial(1000));
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }

    }
}
