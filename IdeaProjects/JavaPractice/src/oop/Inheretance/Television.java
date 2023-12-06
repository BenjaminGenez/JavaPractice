package Practice.Hyperskill.Methods.JavaPractice.src.oop.Inheretance;

class Television extends Electrodomestico {
    private static final double RESOLUCION_DEFECTO = 20;
    private static final boolean TDT_DEFECTO = false;

    private double resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, RESOLUCION_DEFECTO, TDT_DEFECTO);
    }

    public Television(double precioBase, double peso) {
        this(precioBase, peso, COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, RESOLUCION_DEFECTO, TDT_DEFECTO);
    }

    public Television(double precioBase, double peso, String color, char consumoEnergetico, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (resolucion > 40) {
            precioFinal *= 1.3;
        }

        if (sintonizadorTDT) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}