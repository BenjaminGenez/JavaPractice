package Practice.Hyperskill.Methods.JavaPractice.src.Inheretance;

public class PersonasTest {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("patata");
        System.out.println(empleado);

        Operario operario = new Operario("Operador");
        System.out.println(operario);

        Directivo directivo = new Directivo("Director");
        System.out.println(directivo);

        Oficial oficial = new Oficial("persona oficial");
        System.out.println(oficial);

        Tecnico tecnico = new Tecnico("tecnico");
        System.out.println(tecnico);
    }
}
