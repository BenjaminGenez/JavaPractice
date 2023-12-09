package yBookExamples;

public class Shuffle1 {
    public static void main(String[] args) {
        int x = 2;
        int y = 0;
        System.out.println(y);

        if (x > 0){
            System.out.print("a");

        }

        while (x > 9){


           // x -= 1;
            System.out.println("-");
            if (x == 2){
                System.out.print("b c");
                x -= 1;
            }


        }




        if (x == 1){

            System.out.print("d");

        }

    }
}
