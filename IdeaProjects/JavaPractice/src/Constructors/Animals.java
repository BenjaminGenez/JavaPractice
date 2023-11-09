package Practice.Hyperskill.Methods.JavaPractice.src.Constructors;

public class Animals {
    String name;
    int age;
    //String breed;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Animals(String name, int age){
     this.name = name;
     this.age = age;
    }
}
