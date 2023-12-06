package Practice.Hyperskill.Methods.JavaPractice.src.oop.Inheretance.Pol;

public class PruebaPuertaCoche {
    public static void main(String[] args) {
        PuertaCoche puerta = new PuertaCoche("Puerta principal", 50.0, 300.0);
        puerta.mostrarAtributos();
        puerta.abrir();
        puerta.bloquea();
        puerta.abrir();
        puerta.desbloquea();
        puerta.abrir();


        System.out.println("alarma activada?: " + (puerta.alarmaActivada() ? "si" : "No"));
        puerta.activarAlarma();
        System.out.println("alarma activada?: " + (puerta.alarmaActivada() ? "i" : "No"));
        puerta.desactivarAlarma();
    }
}