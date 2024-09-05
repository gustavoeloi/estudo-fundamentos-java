package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class AveregePriceOfProductsApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("How many products? -> ");
        int n = scanner.nextInt();

        Product[] products = new Product[n];

        for(int i = 0; i < n; i++) {
            System.out.printf("Name of %d° product: ", i + 1);
            String nameOfProduct = scanner.next();
            System.out.printf("Price of %s: $", nameOfProduct);
            double priceOfProduct = scanner.nextDouble();
            products[i] = new Product(nameOfProduct, priceOfProduct);
        }

        double sumOfPrices = 0.0;
        for(int i = 0; i < products.length; i++) {
            sumOfPrices += products[i].getPrice();
        }

        double avgPrice = sumOfPrices / n;

        System.out.printf("Averege price is $ %.2f", avgPrice);

        scanner.close();
    }
}
