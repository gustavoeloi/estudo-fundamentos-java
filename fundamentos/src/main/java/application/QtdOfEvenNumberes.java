package application;

import java.util.Locale;
import java.util.Scanner;

public class QtdOfEvenNumberes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantos números você vai digitar?");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        for(int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextInt();
        }

        int qtd = 0;
        System.out.println("Números pares: ");
        for(int i = 0; i < vector.length; i++){
            if(vector[i] % 2 == 0) {
                System.out.print(vector[i] + " ");
                qtd++;
            }
        }

        System.out.printf("\nQuantidade de pares: %d", qtd);
        scanner.close();
    }
}
