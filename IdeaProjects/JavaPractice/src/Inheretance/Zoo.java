package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

class Zoo {
    private Animals[] animals;
    private int count;

    public Zoo(int size) {
        animals = new Animals[size];
        count = 0;
    }


    Animals Capibara = new Animals("mini capibara", "4", "4", "12,2");



    public void addAnimal(Animals animal) {
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
            Animals animal = animals[i];
            System.out.println("Animal " + (i + 1) + ": " + animal.getNameAnimal() + ", Age: " + animal.getAgeAnimal());
        }
    }
}
