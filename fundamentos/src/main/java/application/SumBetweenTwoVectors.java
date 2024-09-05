package application;

import java.util.Locale;
import java.util.Scanner;

public class SumBetweenTwoVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = scanner.nextInt();

        int[] vectorA = new int[n];
        int[] vectorB = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < vectorA.length; i++) {
            vectorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < vectorB.length; i++) {
            vectorB[i] = scanner.nextInt();
        }

        int[] vectorC = new int[n];

        for(int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("Vetor Resultante");
        for (int j : vectorC) {
            System.out.println(j);
        }

        scanner.close();
    }
}
