package Practice.Methods;

public class Cuenta {
    private float numeroCuenta;
    private int dniCliente;
    private double saldoActual;
    private double interesAnual;

    public Cuenta() {
        numeroCuenta = 0;
        dniCliente = 0;
        saldoActual = 0;
        interesAnual = 0;
    }
/**Constructor por defecto y constructor con DNI, saldo e interés
  Accedentes y mutadores. Para el número de cuenta no habrá mutador.
  actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés diario
 (interés anual dividido entre 365 aplicado al saldo actual).
  ingresar(double): permitirá ingresar una cantidad en la cuenta.
  retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
  Método que nos permita mostrar todos los datos de la cuenta.*/

    public Cuenta(float numeroCuenta, int dniCliente, double saldoActual, double interesAnual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }

    public float getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public void actualizarSaldo() {
        double interesDiario = (interesAnual / 365) / 100;
        saldoActual += saldoActual * interesDiario;
    }

    public void ingresar(double cantidad) {
        saldoActual += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldoActual) {
            saldoActual -= cantidad;
        } else {
            System.out.println("Saldo insuficiente para realizar la operación.");
        }
    }

    public void mostrarDatosCuenta() {
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldoActual);
        System.out.println("Interes anual: " + interesAnual + "%");
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(123456789, 987654321, 1000, 5);
        cuenta1.mostrarDatosCuenta();

        cuenta1.actualizarSaldo();
        System.out.println("Saldo despues de aplicar el interes diario:");
        cuenta1.mostrarDatosCuenta();

        cuenta1.ingresar(500);
        System.out.println("Saldo despues de ingresar 500:");
        cuenta1.mostrarDatosCuenta();

        cuenta1.retirar(200);
        System.out.println("Saldo después de retirar 200:");
        cuenta1.mostrarDatosCuenta();
    }
}
