package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        String productName = sc.next();
        product.setName(productName);

        System.out.print("Price: $");
        double productPrice = sc.nextDouble();
        product.setPrice(productPrice);

        System.out.print("Quantity in  Stock: ");
        int productQtdInStock = sc.nextInt();
        product.setQuantity(productQtdInStock);

        System.out.println("Product Data" + product);

        System.out.println("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println("Updated data: " + product);
    }
}
