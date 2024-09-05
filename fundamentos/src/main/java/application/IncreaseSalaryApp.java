package application;

import entities.EmployeeId;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class IncreaseSalaryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("How many employees will be registered? ");
        int n = scanner.nextInt();

        List<EmployeeId> employees = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.printf("Employee #%d:\n", i + 1 );
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Salary: $");
            double salary = scanner.nextDouble();

            employees.add(new EmployeeId(id, name, salary));
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();

        EmployeeId employeeId =  employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(employeeId != null) {
            System.out.print("Enter the percentage: %");
            double percentage = scanner.nextDouble();
            employeeId.increaseSalary(percentage);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("List of employees:");

        for(EmployeeId employee: employees) {
            System.out.printf("%d, %s, %.2f\n", employee.getId(), employee.getName(), employee.getSalary());
        }

        scanner.close();
    }
}
