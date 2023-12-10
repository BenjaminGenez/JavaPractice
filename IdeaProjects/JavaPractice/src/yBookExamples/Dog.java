package yBookExamples;

public class Dog {

    String name;
    int size;

    public void bark(){
        System.out.println("wof");
    }
    public void bark(int numOfBarks){
        while(numOfBarks > 0){
            System.out.println("wof");
            numOfBarks = numOfBarks - 1;
        }
    }
    public void bark(String barkWord){
        System.out.println(barkWord);
    }
}
