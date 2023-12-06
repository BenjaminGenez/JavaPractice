package Practice.Hyperskill.Methods.JavaPractice.src.oop.Polimorphism;


class Triangulo2 extends Figura2 {
    double base;
    double altura;

    Triangulo2(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double area() {
        return (base * altura) / 2;
    }
}