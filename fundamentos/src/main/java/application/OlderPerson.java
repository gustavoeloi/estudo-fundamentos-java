package application;

import java.util.Locale;
import java.util.Scanner;

public class OlderPerson {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = scanner.nextInt();

        String[] nameVector = new String[n];
        int[] ageVector = new int[n];

        int higherAge = 0;
        int higherAgePosition = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            nameVector[i] = scanner.next();
            System.out.print("Idade: ");
            ageVector[i] = scanner.nextInt();

            if(ageVector[i] > higherAge) {
                higherAge = ageVector[i];
                higherAgePosition = i;
            }
        }

        System.out.println("Pessoa mais velha " + nameVector[higherAgePosition]);

        scanner.close();

    }
}
