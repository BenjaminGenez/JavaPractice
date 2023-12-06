
package Practice.Hyperskill.Methods.JavaPractice.src.oop.Polimorphism;


import java.util.Vector;

public class Jerarquia2 {
    public static void main(String[] args) {
        Vector<Figura2> figuras = new Vector<Figura2>();
        figuras.add(new Circulo2(10)); // Radio=10
        figuras.add(new Cuadrado2(10)); // Lado=10
        figuras.add(new Triangulo2(10, 5)); // Base=10, Altura=5

        for (Figura2 f : figuras) {
            System.out.println("Área: " + f.area());
        }
    }
}


















































