package application;

import entities.PersonGender;

import java.util.Locale;
import java.util.Scanner;

public class DataAboutPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantas pessoas serão digitas? ");
        int n = scanner.nextInt();

        PersonGender[] people = new PersonGender[n];

        for(int i = 0; i<people.length; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double height = scanner.nextDouble();
            System.out.printf("Genêro da %da pessoa: ", i + 1);
            String gender = scanner.next();

            people[i] = new PersonGender(height, gender);
        }

        double shortPerson = 0.0;
        double tallestPerson = 0.0;
        double sumWomansHeight = 0.0;
        int qtdMans = 0;
        int qtdWomans = 0;

        for(int i=0; i<people.length; i++){
            shortPerson = people[0].getHeight();

            if(people[i].getHeight() < shortPerson) {
                shortPerson = people[i].getHeight();
            }

            if(people[i].getHeight() > tallestPerson) {
                tallestPerson = people[i].getHeight();
            }

            if(people[i].getGender().contains("M")) {
                qtdMans++;
            }

            if(people[i].getGender().contains("F")) {
                qtdWomans++;
               sumWomansHeight += people[i].getHeight();
            }

        }

        double avgWomansHeight = sumWomansHeight / qtdWomans;
        System.out.println("Menor altura: " + shortPerson);
        System.out.println("Maior altura: " + tallestPerson);
        System.out.printf("Media das alturas das mulheres: %.2f\n", avgWomansHeight);
        System.out.println("Quantidade de homens: " + qtdMans);

        scanner.close();
    }
}
