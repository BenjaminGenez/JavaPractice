
package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;


class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }
}