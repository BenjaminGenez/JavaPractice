package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;

public class ProgramaBancario3 {
    public static void main(String[] args) {
        // Crear un cliente
        Persona cliente1 = new Persona("Juan", "Pérez", "12345678A");

        // Crear una cuenta corriente y una cuenta de ahorro
        Cuenta cuenta1 = new CuentaCorriente3(cliente1, 1001);
        Cuenta cuenta2 = new CuentaAhorro3(cliente1, 1002, 0.02, 500);

        // Probar métodos en cuenta corriente
        cuenta1.ingresar(1000);
        cuenta1.retirar(200);
        cuenta1.actualizarSaldo();
        System.out.println(cuenta1.toString());

        // Probar métodos en cuenta de ahorro
        cuenta2.ingresar(1000);
        cuenta2.retirar(200); // Debería permitir si el saldo no cae por debajo del mínimo
        cuenta2.actualizarSaldo();
        System.out.println(cuenta2.toString());

        // Cambiar el interés en la cuenta de ahorro y actualizar de nuevo
        ((CuentaAhorro3) cuenta2).setInteresVariable(0.03);
        cuenta2.actualizarSaldo();
        System.out.println("Después de actualizar con nuevo interés: " + cuenta2.toString());
    }
}

