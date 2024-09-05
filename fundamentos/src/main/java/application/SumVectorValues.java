package application;

import java.util.Locale;
import java.util.Scanner;

public class SumVectorValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantos números você vai digitar? ");
        int n = scanner.nextInt();

        double[] vector = new double[n];

        for(int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }

        double avg = sum / vector.length;

        System.out.print("Valores: ");
        for(int i=0; i<vector.length; i++) {
            System.out.print(" " +vector[i]);
        }
        System.out.println("\nSoma: " + sum);
        System.out.println("Media: " + avg);

        scanner.close();

    }
}
