package Practice.Hyperskill.Methods.JavaPractice.src.oop.Inheretance;

class Lavadora extends Electrodomestico {
    private static final double CARGA_DEFECTO = 5;

    private double carga;

    public Lavadora() {
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, CARGA_DEFECTO);
    }

    public Lavadora(double precioBase, double peso) {
        this(precioBase, peso, COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, CARGA_DEFECTO);
    }

    public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (carga > 30) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}