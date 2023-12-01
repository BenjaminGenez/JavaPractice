package Practice.Hyperskill.Methods.JavaPractice.src.Pol;

public class PruebaAlarma {

    public static void main(String[] args) {

        Sensor sensor1 = new Sensor(25.0);
        Sensor sensor2 = new Sensor(45.0);
        Sensor[] sensors = {sensor1, sensor2};


        Timbre timbre = new Timbre();


        double threshold = 30.0;


        Alarma alarma = new Alarma(threshold, sensors, timbre);
        Luz luz = new Luz();
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa(threshold, sensors, timbre, luz);


        System.out.println("Testing Alarma...");
        alarma.comprobar();


        System.out.println("Testing AlarmaLuminosa...");
        alarmaLuminosa.comprobar();
    }
}

