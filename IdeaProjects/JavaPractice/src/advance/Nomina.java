package advance;
import java.util.Scanner;

public class Nomina {
    public static double calculateNetSalary(Employee employee) {
        double grossSalary = employee.getGrossSalary();
        double socialSecurityDeduction = grossSalary * employee.getSocialSecurityRate() / 100;
        double incomeTaxDeduction = grossSalary * employee.getIncomeTaxRate() / 100;
        return grossSalary - socialSecurityDeduction - incomeTaxDeduction;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Salario base:");
        double grossSalary = scanner.nextDouble();

        System.out.println("Seguridad Social:");
        double socialSecurityRate = scanner.nextDouble();

        System.out.println("iva:");
        double incomeTaxRate = scanner.nextDouble();

        Employee employee = new Employee(grossSalary, socialSecurityRate, incomeTaxRate);
        double netSalary = calculateNetSalary(employee);

        System.out.println("Salario neto: " + netSalary);
    }
}