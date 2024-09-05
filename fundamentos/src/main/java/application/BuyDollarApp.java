package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class BuyDollarApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarBought = scanner.nextDouble();

        double totalPriceInReais = CurrencyConverter.dollarConverter(dollarPrice, dollarBought);

        System.out.printf("Amount to be paid in reais: R$%.2f", totalPriceInReais);

        scanner.close();
    }
}
