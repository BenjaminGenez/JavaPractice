package Practice.Hyperskill.Methods.JavaPractice.src.oop.Polimorphism;

class Cuenta3Corriente3 extends Cuenta3 {
    private static final double interesFijo = 0.015; // Interés fijo del 1.5%

    public Cuenta3Corriente3(Persona3 cliente, long numerocuenta) {
        super(cliente, numerocuenta);
    }

    @Override
    public void retirar(double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
        }
    }

    @Override
    public void actualizarSaldo() {
        this.saldo += this.saldo * interesFijo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numerocuenta=" + numerocuenta +
                ", saldo=" + saldo +
                ", cliente=" + cliente.getNombre() + " " + cliente.getApellidos() +
                '}';
    }
}