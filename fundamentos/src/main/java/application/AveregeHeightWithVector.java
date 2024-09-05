package application;

import java.util.Locale;
import java.util.Scanner;

public class AveregeHeightWithVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("How many heights will you check -> ");
        int n = sc.nextInt();

        double[] vectorOfHeights = new double[n];

        for(int i=0; i<n; i++) {
            vectorOfHeights[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i=0; i<vectorOfHeights.length; i++){
            sum += vectorOfHeights[i];
        }

        double avg = sum / n;

        System.out.printf("The averege height is %.2f", avg);

        sc.close();

    }
}
