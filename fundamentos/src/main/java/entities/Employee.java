package entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public double netSalary() {
        return this.grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        double amount = (percentage * grossSalary) / 100;
        this.grossSalary += amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return name +
                " , $ " +
                String.format("%.2f", netSalary());
    }
}
