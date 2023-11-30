package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;

class CuentaCorriente3 extends Cuenta {
    private static final double interesFijo = 0.015; // Interés fijo del 1.5%

    public CuentaCorriente3(Persona cliente, long numerocuenta) {
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