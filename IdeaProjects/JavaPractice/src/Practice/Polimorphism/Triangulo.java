package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;


class Triangulo extends Figura {
    double base;
    double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double area() {
        return (base * altura) / 2;
    }
}