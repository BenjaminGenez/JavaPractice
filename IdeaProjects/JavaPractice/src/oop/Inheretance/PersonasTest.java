package Practice.Hyperskill.Methods.JavaPractice.src.oop.Inheretance;

public class PersonasTest {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Rafa");
        System.out.println(empleado);

        Operario operario = new Operario("-> Alfonso");
        System.out.println(operario);


        Directivo directivo = new Directivo(" Mario -> Directivo");
        System.out.println(directivo);


        Oficial oficial = new Oficial("Operario -> Oficial");
        System.out.println(oficial);

        Tecnico tecnico = new Tecnico("Pablo -> Operario -> ");
        System.out.println(tecnico);
        /*Empleado Rafa
        Empleado Mario -> Directivo
        Empleado Alfonso -> Operario
        Empleado Luis -> Operario -> Oficial
        Empleado Pablo -> Operario -> Tecnico*/
    }

}
