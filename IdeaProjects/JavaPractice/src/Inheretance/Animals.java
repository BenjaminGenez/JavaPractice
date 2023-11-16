package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

public class Animals {
    private String nameAnimal;
    private int ageAnimal;
    private int paws;
    private double altura;

    // Constructor with all properties
    public Animals(String nameAnimal, int ageAnimal, int paws, double altura) {
        this.nameAnimal = nameAnimal;
        this.ageAnimal = ageAnimal;
        this.paws = paws;
        this.altura = altura;
    }

    public Animals(String whiskers, int ageAnimal) {
    }

    // Overloaded constructor with fewer parameters
//    public Animals(String nameAnimal, int ageAnimal) {
//        this.nameAnimal = nameAnimal;
//        this.ageAnimal = ageAnimal;
//        // Default values for paws and altura
//        this.paws = 4; // Assuming a default value
//        this.altura = 0.5; // Assuming a default value
//    }

    // Setters
    public void setNameAnimal(String nameAnimal){
        this.nameAnimal = nameAnimal;
    }

    public void setAgeAnimal(int ageAnimal) {
        if (ageAnimal >= 0) {
            this.ageAnimal = ageAnimal;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public void setPaws(int paws) {
        if (paws >= 0) {
            this.paws = paws;
        } else {
            System.out.println("Paws cannot be negative.");
        }
    }

    public void setAltura(double altura) {
        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura cannot be negative.");
        }
    }

    // Getters
    public String getNameAnimal() {
        return nameAnimal;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public int getPaws() {
        return paws;
    }

    public double getAltura() {
        return altura;
    }

    // Additional behavior method
    public void makeSound() {
        System.out.println(nameAnimal + " makes a sound.");
    }

    // toString method
    @Override
    public String toString() {
        return "Animals{" +
                "name='" + nameAnimal + '\'' +
                ", age=" + ageAnimal +
                ", paws=" + paws +
                ", altura=" + altura +
                '}';
    }
}

