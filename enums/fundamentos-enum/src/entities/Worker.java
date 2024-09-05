package entities;

import entities.enums.WorkLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkLevel level;
    private double baseSalary;

    private Department department;
    private List<HourContract> hourContracts = new ArrayList<>();

    public Worker(String name, WorkLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(HourContract contract) {
        hourContracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        hourContracts.remove(contract);
    }

    public double income(int month, int year) {
        double sum = baseSalary;

        for(HourContract contract : hourContracts) {
            int monthValue = contract.getDate().getMonthValue();
            int yearValue = contract.getDate().getYear();


            if(monthValue == month && year == yearValue) {
                sum += contract.totalValue();
            }
        }

        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                ", hourContracts=" + hourContracts +
                '}';
    }
}
