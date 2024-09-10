package entities;

public class NaturalPerson extends Person{
    private double healthcareExpenses;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, double annualIncome, double healthcareExpenses) {
        super(name, annualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    @Override
    public double taxes() {
        double valueTax = 0;

        if(super.getAnnualIncome() >= 20000.00) {
            valueTax = 25;
        } else  {
            valueTax = 15;
        }

        double taxWithHealthcare = (50 * healthcareExpenses) / 100;
        double taxAnnualIncome = (valueTax * super.getAnnualIncome()) / 100;

        return Math.max(0, taxAnnualIncome - taxWithHealthcare);
    }
}
