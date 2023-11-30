package Practice.Hyperskill.Methods.JavaPractice.src.Pol;

public class PruebaPuertaCoche {
    public static void main(String[] args) {
        PuertaCoche puerta = new PuertaCoche("Puerta principal", 50.0, 300.0);
        puerta.mostrarAtributos();
        puerta.abrir(); // Intenta abrir la puerta
        puerta.bloquea(); // Bloquea la puerta
        puerta.abrir(); // Intenta abrir la puerta de nuevo
        puerta.desbloquea(); // Desbloquea la puerta
        puerta.abrir(); // Ahora sí debería abrir

        // Prueba de los métodos de la alarma
        System.out.println("¿Alarma activada?: " + (puerta.alarmaActivada() ? "Sí" : "No"));
        puerta.activarAlarma();
        System.out.println("¿Alarma activada?: " + (puerta.alarmaActivada() ? "Sí" : "No"));
        puerta.desactivarAlarma();
    }
}