package Practice.Hyperskill.Methods.JavaPractice.src.oop.Polimorphism;

class Circulo2 extends Figura2 {
    private double radio;

    public Circulo2(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }
}