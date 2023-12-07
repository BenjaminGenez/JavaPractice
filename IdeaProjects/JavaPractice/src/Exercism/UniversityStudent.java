package Exercism;

public class UniversityStudent extends Student implements Study {
    public UniversityStudent(String name, int age, String studentId) {
        super(name, age, studentId);
    }

    @Override
    public void studyFor(int hours) {
        System.out.println(getName() + " is studying for " + hours + " hours.");
    }
}