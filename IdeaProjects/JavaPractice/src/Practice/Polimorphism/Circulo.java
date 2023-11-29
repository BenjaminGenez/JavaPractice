package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }
}