package Practice.Hyperskill.Methods.JavaPractice.src.Pol;

public class PruebaAlarma {

    public static void main(String[] args) {
        // Let's create some sensors.
        Sensor sensor1 = new Sensor(25.0); // Below threshold
        Sensor sensor2 = new Sensor(45.0); // Above threshold
        Sensor[] sensors = {sensor1, sensor2};

        // Creating a bell.
        Timbre timbre = new Timbre();

        // Set the threshold for the alarm.
        double threshold = 30.0;

        // Time to create our alarms.
        Alarma alarma = new Alarma(threshold, sensors, timbre);
        Luz luz = new Luz();
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa(threshold, sensors, timbre, luz);

        // Run the tests for the Alarma.
        System.out.println("Testing Alarma...");
        alarma.comprobar();

        // Now, let's see the AlarmaLuminosa in action.
        System.out.println("Testing AlarmaLuminosa...");
        alarmaLuminosa.comprobar();
    }
}

