package advance.Exeception;

public class Test22 {
    public static void main(String[] args) {
        System.out.println("test" + 10 / 0);
        try {
            System.out.println("test" + 10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("test" + 10 / 0);
            System.out.println(e.getMessage());
        }



    }
}
