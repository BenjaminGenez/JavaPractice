package Practice.Hyperskill.Methods.JavaPractice.src.Constructors;

public class testDiary {
    public static void main(String[] args) {
        Diary myDiary = new Diary();

        myDiary.setSecret("Test diary");

        System.out.println("My secret is: " + myDiary.getSecret());

    }
}
