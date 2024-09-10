package application;

import entities.JuristicPerson;
import entities.NaturalPerson;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TaxToPayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the number of tax payers: ");
        int qtd = scanner.nextInt();

        List<Person> personList = new ArrayList<>();

        for(int i = 1; i <= qtd; i++) {
            System.out.printf("Tax payer #%d data: \n", i);
            System.out.print("Individual or company? (i/c)-> ");
            char personType = scanner.next().toLowerCase().charAt(0);

            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Annual income: $");
            double annualIncome = scanner.nextDouble();

            if(personType == 'i') {
                System.out.print("Health expenditures: ");
                double healthcareExpenses = scanner.nextDouble();
                personList.add(new NaturalPerson(name, annualIncome, healthcareExpenses));
            } else if(personType == 'c'){
                System.out.print("Quantity of employees: ");
                int quantityOfEmployees = scanner.nextInt();
                personList.add(new JuristicPerson(name, annualIncome, quantityOfEmployees));
            }
        }

        System.out.println("Taxes Paid: ");
        for(Person person: personList) {
            System.out.println(person.getName() + ": $" + String.format("%.2f", person.taxes()));
        }

        double totalTaxesAmount = 0.0;
        for(Person person: personList) {
            totalTaxesAmount += person.taxes();
        }

        System.out.printf("Total taxes: $ %.2f", totalTaxesAmount);

        scanner.close();
    }
}
