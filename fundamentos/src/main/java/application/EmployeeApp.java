package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    Employee employee = new Employee();

        System.out.print("Name: ");
        employee.setName(scanner.next());
        scanner.next();

        System.out.print("Gross Salary: ");
        employee.setGrossSalary(scanner.nextDouble());

        System.out.print("Tax: ");
        employee.setTax(scanner.nextDouble());

        System.out.println(employee);

        System.out.print("Which percentage to incrase salary? ");
        employee.increaseSalary(scanner.nextDouble());

        System.out.println("Updated data: " + employee);
    scanner.close();
    }
}

