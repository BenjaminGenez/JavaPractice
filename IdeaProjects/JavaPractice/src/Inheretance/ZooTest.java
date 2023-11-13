package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

public class ZooTest {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo(5); // A zoo that can hold 5 animals

        Lion lion1 = new Lion("Leo", 4, "Loud Roar");
        myZoo.addAnimal(lion1);

        // Add more animals as needed

        myZoo.showAnimals(); // Display the animals in the zoo
    }
}
