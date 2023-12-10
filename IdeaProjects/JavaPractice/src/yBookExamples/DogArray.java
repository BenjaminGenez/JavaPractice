package yBookExamples;

public class DogArray {
    public static void main(String[] args) {
        Dog[] myDog = new Dog[3];


        myDog[0] = new Dog();
        myDog[0].name = "fido";
        myDog[0].size = 10;
        myDog[0].bark();

        System.out.println();

        myDog[1] = new Dog();
        myDog[1].name = "rex";
        myDog[1].size = 20;
        myDog[1].bark();

        System.out.println();




    }
}
