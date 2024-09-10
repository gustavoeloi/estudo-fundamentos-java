package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProductsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        List<Product> products = new ArrayList<>();

        for(int i = 1; i<= n; i++) {
            System.out.printf("Product #%d data: \n", i);
            System.out.print("Common, used or imported? (c, u, i) -> ");
            char typeProduct = scanner.next().toLowerCase().charAt(0);

            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Price: ");
            double price = scanner.nextDouble();


            if(typeProduct == 'c') {
                products.add(new Product(name, price));
            } else if (typeProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY) -> ");
                String date = scanner.next();
                products.add(new UsedProduct(name, price, LocalDate.parse(date, fmt)));
            } else if (typeProduct == 'i') {
                System.out.println("Customs fee: ");
                double customsFee = scanner.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println("PRICE TAGS: ");
        for(Product product: products) {
            System.out.println(product.priceTag());
        }

        scanner.close();
    }
}
