
package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;


class Cuadrado2 extends Figura2 {
    private double lado;

    public Cuadrado2(double lado) {
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }
}