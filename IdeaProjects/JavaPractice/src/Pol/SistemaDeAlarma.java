package Practice.Hyperskill.Methods.JavaPractice.src.Pol;

class Sensor {
    private double valorActual;

    public Sensor(double valorActual) {
        this.valorActual = valorActual;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }
}

class Timbre {
    public void activar() {
        System.out.println("El timbre se ha activado.");
    }

    public void desactivar() {
        System.out.println("El timbre se ha desactivado.");
    }
}

class Alarma {
    private Sensor sensor;
    private Timbre timbre;
    private double umbral;

    public Alarma(Sensor sensor, Timbre timbre, double umbral) {
        this.sensor = sensor;
        this.timbre = timbre;
        this.umbral = umbral;
    }

    public void comprobar() {
        if (sensor.getValorActual() > umbral) {
            timbre.activar();
        } else {
            timbre.desactivar();
        }
    }
}

class Luz {
    public void encender() {
        System.out.println("La luz se ha encendido.");
    }

    public void apagar() {
        System.out.println("La luz se ha apagado.");
    }
}

class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa(Sensor sensor, Timbre timbre, double umbral, Luz luz) {
        super(sensor, timbre, umbral);
        this.luz = luz;
    }

    @Override
    public void comprobar() {
        super.comprobar(); // Llama a la implementación de la superclase
        // Si el timbre está activo, también encender la luz
        Sensor sensor;
        sensor = null;
        double umbral = 0;
        if (sensor.getValorActual() > umbral) {
            luz.encender();
        } else {
            luz.apagar();
        }
    }
}

// Código de prueba
public class SistemaDeAlarma {
    public static void main(String[] args) {
        Sensor sensor = new Sensor(10.0);
        Timbre timbre = new Timbre();
        Luz luz = new Luz();
        Alarma alarma = new AlarmaLuminosa(sensor, timbre, 5.0, luz);

        // Supongamos que el sensor detecta un valor que supera el umbral
        sensor.setValorActual(7.0);
        alarma.comprobar(); // Debería activar el timbre y encender la luz

        // Ahora el sensor detecta un valor que no supera el umbral
        sensor.setValorActual(3.0);
        alarma.comprobar(); // Debería desactivar el timbre y apagar la luz
    }
}
