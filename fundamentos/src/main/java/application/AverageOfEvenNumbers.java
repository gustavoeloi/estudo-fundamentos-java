package application;

import java.util.Locale;
import java.util.Scanner;

public class AverageOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantos números serão digitados? ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        int sum = 0;
        for(int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextInt();
            if(vector[i] % 2 == 0) {
                sum += vector[i];
            }
        }

        int avg = sum / vector.length;

        if(avg != 0) {
            System.out.println("Media dos pares " + avg);
        } else {
            System.out.println("Nenhum número par");
        }


        scanner.close();
    }
}
