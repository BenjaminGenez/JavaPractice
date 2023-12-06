package Practice.Hyperskill.Methods.JavaPractice.src.oop.Polimorphism;

class Cuenta3Ahorro3 extends Cuenta3 {
    private double interesVariable;
    private double saldoMinimo;

    public Cuenta3Ahorro3(Persona3 cliente, long numerocuenta, double interesVariable, double saldoMinimo) {
        super(cliente, numerocuenta);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public void retirar(double cantidad) {
        if (this.saldo - cantidad >= saldoMinimo) {
            this.saldo -= cantidad;
        }
    }

    @Override
    public void actualizarSaldo() {
        this.saldo += this.saldo * interesVariable;
    }

    public void setInteresVariable(double interesVariable) {
        this.interesVariable = interesVariable;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "numerocuenta=" + numerocuenta +
                ", saldo=" + saldo +
                ", cliente=" + cliente.getNombre() + " " + cliente.getApellidos() +
                ", interesVariable=" + interesVariable +
                ", saldoMinimo=" + saldoMinimo +
                '}';
    }
}