package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

class Lion {
    private String roarStyle;

    public Lion(String name, int age, String color, double altura, String roarStyle) {
        super(name, age, color, altura); // Calling Animal's constructor
        this.roarStyle = roarStyle;
    }


    public String getRoarStyle() {
        return this.roarStyle;
    }

    public void setRoarStyle(String roarStyle) {
        this.roarStyle = roarStyle;
    }
}
