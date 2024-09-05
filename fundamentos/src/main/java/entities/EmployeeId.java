package entities;

public class EmployeeId {

    private int id;
    private String name;
    private double salary;

    public EmployeeId(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        double amount = (percentage * this.salary) / 100;
        this.salary = this.salary + amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
