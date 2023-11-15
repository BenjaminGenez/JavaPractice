package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

public class Animals {
    private String nameAnimal;

    private int ageAnimal;

    private int paws;

    private double altura;

    public Animals(String nameAnimal, int ageAnimal, int paws, double altura) {

        this.nameAnimal = nameAnimal;
        this.ageAnimal = ageAnimal;
        this.paws = paws;
        this.altura = altura;
    }

        public void setNameAnimal(int name){
            this.nameAnimal = nameAnimal;
        }


        public String getNameAnimal() {
            return nameAnimal;
        }

        public void setAgeAnimal(int ageAnimal) {
            this.ageAnimal = ageAnimal;
        }

        public int getAgeAnimal() {
            return ageAnimal;
        }

        public void setPaws() {
            this.paws = paws;
        }

        public int getPaws() {
            return paws;
        }

        public void setAltura() {
            this.altura = altura;
        }





}
