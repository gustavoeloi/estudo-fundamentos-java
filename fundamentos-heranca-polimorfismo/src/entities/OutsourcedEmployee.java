package entities;

public class OutsourcedEmployee extends Employee {
    private double additionalCharge;

    public OutsourcedEmployee(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        double value = (110 * additionalCharge) / 100;
        return super.payment() + value;
    }

}
