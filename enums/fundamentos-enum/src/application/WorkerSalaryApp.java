package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class WorkerSalaryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.next();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Level: ");
        WorkLevel level = WorkLevel.valueOf(scanner.next());
        System.out.print("Base salary: $");
        double baseSalary = scanner.nextDouble();

        List<HourContract> contracts = new ArrayList<>();
        System.out.print("How many contracts to this worker? ");
        int amountContracts = scanner.nextInt();

        Worker worker = new Worker(name, level, baseSalary, new Department(departmentName));

        for(int i = 0; i<amountContracts; i++) {
            System.out.printf("Enter contract #%d data:\n", i + 1);
            System.out.print("Date (DD/MM/YYYY) -> ");
            String dateString = scanner.next();
            System.out.print("Value per hour: $");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            int duration  = scanner.nextInt();

            LocalDate date = LocalDate.parse(dateString, fmt);

            HourContract hourContract = new HourContract(date, valuePerHour, duration);

            worker.addContract(hourContract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        String[] parts = monthAndYear.split("/");
        int month = Integer.parseInt(parts[0]);
        int year = Integer.parseInt(parts[1]);

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.printf("Income for %s: $%.2f", monthAndYear, worker.income(month, year));


        scanner.close();
    }
}
