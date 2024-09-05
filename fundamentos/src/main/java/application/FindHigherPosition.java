package application;

import java.util.Locale;
import java.util.Scanner;

public class FindHigherPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantos numeros você vai digitar? ");
        int n = scanner.nextInt();

        double[] vector = new double[n];

        for(int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextDouble();
        }

        double higherValue = 0.0;
        int higherPosition = 0;
        for(int i = 0; i < vector.length; i++) {
            if(vector[i] > higherValue) {
                higherValue = vector[i];
                higherPosition = i;
            }
        }

        System.out.println("Maior valor: "+ higherValue);
        System.out.println("Posição do maior valor: " + higherPosition);

        scanner.close();
    }
}
