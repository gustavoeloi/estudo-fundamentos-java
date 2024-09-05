package application;

import java.util.Locale;
import java.util.Scanner;

public class NegativeNumberApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantos números você irá digitar? ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        for(int i=0;i<n;i++){
            vector[i] = scanner.nextInt();
        }

        System.out.println("Números Negativos");
        for(int i=0; i<vector.length;i++){
            if(vector[i] < 0) {
                System.out.println(vector[i]);
            }
        }

        scanner.close();
    }
}
