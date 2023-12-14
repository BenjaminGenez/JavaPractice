package advance;

public class Employee {
    private String name;
    private double grossSalary;
    private double socialSecurityRate;
    private double incomeTaxRate;

    public Employee(double grossSalary, double socialSecurityRate, double incomeTaxRate) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.socialSecurityRate = socialSecurityRate;
        this.incomeTaxRate = incomeTaxRate;
    }

    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getSocialSecurityRate() {
        return socialSecurityRate;
    }

    public double getIncomeTaxRate() {
        return incomeTaxRate;
    }
}