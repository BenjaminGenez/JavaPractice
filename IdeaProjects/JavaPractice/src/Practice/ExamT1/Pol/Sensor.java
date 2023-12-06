package Practice.Hyperskill.Methods.JavaPractice.src.Practice.ExamT1.Pol;

// The Sensor class holds the current value.
class Sensor {
    private double valorActual; // valorActual translates to current value

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

// The Timbre class has methods to activate or deactivate the bell.
class Timbre {
    public void activar() {
        System.out.println("Timbre activado! Ding dong!");
    }

    public void desactivar() {
        System.out.println("Timbre desactivado. Shhh!");
    }
}

// The Alarma class checks if the Sensor value exceeds the threshold.
class Alarma {
    private double umbral;
    private Sensor[] sensores;
    private Timbre timbre;

    public Alarma(double umbral, Sensor[] sensores, Timbre timbre) {
        this.umbral = umbral;
        this.sensores = sensores;
        this.timbre = timbre;
    }

    public void comprobar() {
        for (Sensor sensor : sensores) {
            if (sensor.getValorActual() > umbral) {
                timbre.activar();
                return;
            }
        }
        timbre.desactivar();
    }
}

// The Luz class represents the light that can be turned on.
class Luz {
    public void encender() {
        System.out.println("Luz encendida! 💡");
    }
}

// AlarmaLuminosa is an extension of Alarma that also turns on a light.
class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa(double umbral, Sensor[] sensores, Timbre timbre, Luz luz) {
        super(umbral, sensores, timbre);
        this.luz = luz;
    }

    @Override
    public void comprobar() {
        super.comprobar();
        if (luz != null) {
            // Let's assume if the bell is activated, the light should also be on.
            // This could be refined based on more specific requirements.
            luz.encender();
        }
    }
}
