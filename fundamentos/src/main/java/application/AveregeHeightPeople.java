package application;

import entities.Person;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class AveregeHeightPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantas pessoas serão digitas? ");
        int n = scanner.nextInt();

        Person[] person = new Person[n];

        for(int i = 0; i < person.length; i++) {
            System.out.printf("Dados da %d° pessoa: \n", i + 1);
            System.out.print("Nome: ");
            String name = scanner.next();
            System.out.print("Idade: ");
            int age = scanner.nextInt();
            System.out.print("Altura: ");
            double height = scanner.nextDouble();

            person[i] = new Person(name, age, height);
        }

        double sumOfHeights = 0.0;
        double personUnderSixteen = 0;
        for(int i=0; i<person.length; i++) {
            sumOfHeights += person[i].getHeight();
            if(person[i].getAge() < 16) {
                personUnderSixteen++;
            }
        }

        double avgHeight = sumOfHeights / person.length;
        double percentageOfPeopleUnderSixteen = (personUnderSixteen / person.length) * 100;

        System.out.println("Altura média: " + avgHeight);
        System.out.println("Pessoa com menos de 16 anos: " + percentageOfPeopleUnderSixteen + "%");

        scanner.close();
    }
}
