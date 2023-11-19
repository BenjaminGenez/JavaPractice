package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

class Electrodomestico {
    protected double precioBase;
    protected String color1;
    protected char consumoEnergetico;
    protected double peso;

    // Constantes
    public static final String COLOR_DEFECTO = "black";
    public static final char CONSUMO_ENERGETICO_DEFECTO = 'F';
    public static final double PRECIO_BASE_DEFECTO = 100;
    public static final double PESO_DEFECTO = 5;

    public Electrodomestico() {
        this(PRECIO_BASE_DEFECTO, PESO_DEFECTO, COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, peso, COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO);
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor1() {
        return color1;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private void comprobarColor(String color) {
        String[] coloresDisponibles = {"black", "negro", "rojo", "azul", "gris"};
        this.color1 = color.toLowerCase();
        for (String colorDisponible : coloresDisponibles) {
            if (this.color1.equals(colorDisponible)) {
                return;
            }
        }
        this.color1 = COLOR_DEFECTO;
    }

    private void comprobarConsumoEnergetico(char letra) {
        String letrasValidas = "ABCDEF";
        if (letrasValidas.indexOf(letra) == -1) {
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
        } else {
            this.consumoEnergetico = letra;
        }
    }

    public double precioFinal() {
        double precioFinal = precioBase;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }

        if (peso >= 0 && peso < 20) {
            precioFinal += 10;
        } else if (peso >= 20 && peso < 50) {
            precioFinal += 50;
        } else if (peso >= 50 && peso < 80) {
            precioFinal += 80;
        } else if (peso >= 80) {
            precioFinal += 100;
        }

        return precioFinal;
    }
}