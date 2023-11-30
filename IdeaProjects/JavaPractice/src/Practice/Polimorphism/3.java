package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;

class Persona {
    private String nombre;
    private String apellidos;
    private String NIF;

    public Persona(String nombre, String apellidos, String NIF) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
    }

    // Getters y setters para nombre, apellidos y NIF
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getNIF() { return NIF; }
    public void setNIF(String NIF) { this.NIF = NIF; }
}
abstract class Cuenta {
    protected long numerocuenta;
    protected double saldo;
    protected Persona cliente;

    public Cuenta(Persona cliente, long numerocuenta) {
        this.cliente = cliente;
        this.numerocuenta = numerocuenta;
        this.saldo = 0.0;
    }

    // Métodos accedentes
    public long getNumerocuenta() { return numerocuenta; }
    public void setNumerocuenta(long numerocuenta) { this.numerocuenta = numerocuenta; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public Persona getCliente() { return cliente; }
    public void setCliente(Persona cliente) { this.cliente = cliente; }

    // Método para ingresar dinero
    public void ingresar(double cantidad) {
        this.saldo += cantidad;
    }

    // Método abstracto para retirar dinero
    public abstract void retirar(double cantidad);

    // Método abstracto para actualizar el saldo
    public abstract void actualizarSaldo();
}
