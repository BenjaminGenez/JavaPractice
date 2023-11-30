package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Polimorphism;

public class PruebaUniversidad {

    public static void main(String[] args) {

        Direccion direccion = new Direccion("123 Java Street", "CodeCity", "12345", "Javaland");


        Estudiante student = new Estudiante();
        student.setNombre("Laura");
        student.setApellidos("Coder");
        student.setNIF("STU123456");
        student.setDireccion(direccion);
        student.setIdEstudiante("S12345678");


        Profesor professor = new Profesor();
        professor.setNombre("Dr. Java");
        professor.setApellidos("Bean");
        professor.setNIF("PRO987654");
        professor.setDireccion(direccion);
        professor.setDespacho("Office 101");


        System.out.println("Student Details:");
        System.out.println(student.toString());
        student.identificate();

        System.out.println("\nProfessor Details:");
        System.out.println(professor.toString());
        professor.identificate();
    }
}
