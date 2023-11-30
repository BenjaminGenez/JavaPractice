package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;

public class ProgramaBancario3 {
    public static void main(String[] args) {
        // Crear un cliente
        Persona3 cliente1 = new Persona3("Juan", "Pérez", "12345678A");

        // Crear una cuenta corriente y una cuenta de ahorro
        Cuenta3 cuenta31 = new Cuenta3Corriente3(cliente1, 1001);
        Cuenta3 cuenta32 = new Cuenta3Ahorro3(cliente1, 1002, 0.02, 500);

        // Probar métodos en cuenta corriente
        cuenta31.ingresar(1000);
        cuenta31.retirar(200);
        cuenta31.actualizarSaldo();
        System.out.println(cuenta31.toString());

        // Probar métodos en cuenta de ahorro
        cuenta32.ingresar(1000);
        cuenta32.retirar(200); // Debería permitir si el saldo no cae por debajo del mínimo
        cuenta32.actualizarSaldo();
        System.out.println(cuenta32.toString());

        // Cambiar el interés en la cuenta de ahorro y actualizar de nuevo
        ((Cuenta3Ahorro3) cuenta32).setInteresVariable(0.03);
        cuenta32.actualizarSaldo();
        System.out.println("Después de actualizar con nuevo interés: " + cuenta32.toString());
    }
}

