package entities;

public class JuristicPerson extends Person{

    private int employeesQuantity;

    public JuristicPerson() {
        super();
    }

    public JuristicPerson(String name, double annualIncome, int employeesQuantity) {
        super(name, annualIncome);
        this.employeesQuantity = employeesQuantity;
    }

    public int getEmployeesQuantity() {
        return employeesQuantity;
    }

    public void setEmployeesQuantity(int employeesQuantity) {
        this.employeesQuantity = employeesQuantity;
    }

    @Override
    public double taxes() {
        double tax = 0.0;
        if(employeesQuantity >= 10) {
            tax = (14 * super.getAnnualIncome()) / 100;
        } else  {
            tax = (16 * super.getAnnualIncome()) / 100;
        }

        return tax;
    }
}
