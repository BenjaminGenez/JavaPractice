package Practice.Hyperskill.Methods.JavaPractice.src.bookh;

public class BottleSong {
    public static void main(String[] args) {
        int bottleNum = 10;
        String word = "bottles";

        while (bottleNum > 0){
            if (bottleNum == 1){
            }
            word = "bottle";
            System.out.println(bottleNum + " green " + word + " sitting on the wall");
            System.out.println(bottleNum + " green " + word + " sitting on the wall");
            System.out.println("And if one green " + word + " were to fall");
            bottleNum -= 1;
            System.out.println("there'll be " + bottleNum + " green bottles sitting on the wall");
        }
       /* if (bottleNum == 0){
            System.out.println("There'll be no bottles sitting on the wall");
        }*/
    }
}
