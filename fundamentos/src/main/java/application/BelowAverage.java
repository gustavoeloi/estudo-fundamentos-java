package application;

import java.util.Locale;
import java.util.Scanner;

public class BelowAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();

        double[] vector = new double[n];

        double sum = 0.0;
        for(int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextDouble();
            sum += vector[i];
        }

        double avg = sum / vector.length;

        System.out.printf("Media do vetor: %.3f\n", avg);

        System.out.println("Elementos abaixo da média:");
        for(int i = 0; i < vector.length; i++) {
            if(vector[i] < avg) {
                System.out.println(vector[i]);
            }
        }

        scanner.close();
    }
}
