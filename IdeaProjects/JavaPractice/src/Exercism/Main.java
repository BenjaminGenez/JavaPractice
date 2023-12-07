package Exercism;

public class Main {
    public static void main(String[] args) {
        UniversityStudent student = new UniversityStudent("John Doe", 20, "123456");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getStudentId());
        student.studyFor(3);
    }
}
