package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeAndOutSourceEmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the number of employees: ");
        int qtd = scanner.nextInt();

        List<Employee> employees = new ArrayList<>();

        for(int i = 1; i<=qtd; i++) {
            System.out.printf("Employee #%d data: \n", i);
            System.out.print("Outsourced (y/n)? ");
            String isOutSourced = scanner.next();

            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: $");
            double valuePerHour = scanner.nextDouble();

            if(isOutSourced.equals("y")) {
                System.out.print("Additional Charge: $");
                double additionalCharge = scanner.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("PAYMENTS: ");
        for(Employee employee: employees) {
            System.out.print(employee);
        }

        scanner.close();
    }
}
