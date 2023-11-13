package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

class Zoo {
    private Animal[] animals;
    private int count;

    public Zoo(int size) {
        animals = new Animal[size];
        count = 0;
    }


    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count] = animal;
            count++;
        } else {
            System.out.println("The zoo is full!");
        }
    }

    public void showAnimals() {
        String visitor;

        for (int i = 0; i < count; i++) {
            Animal animal = animals[i];
            System.out.println("Animal " + (i + 1) + ": " + animal.getName() + ", Age: " + animal.getAge());
        }
    }
}
