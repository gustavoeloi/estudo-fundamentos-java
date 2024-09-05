package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class OrderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Birth date (DD/MM/YYYY) -> ");
        String dateString = scanner.next();
        LocalDate birthDay = LocalDate.parse(dateString, fmt);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = scanner.next();

        Order order1 = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), new Client(name, email, birthDay));

        System.out.print("How many items to this order? ");
        int qtdOrders = scanner.nextInt();

        for(int i=1; i <= qtdOrders; i++) {
            System.out.printf("Enter %d item data:\n", i);
            System.out.print("Product name: ");
            String productName = scanner.next();
            System.out.print("Product price: $");
            double productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int productQtd = scanner.nextInt();

            order1.addItem(new OrderItem(productQtd, productPrice, new Product(productName, productPrice)));
        }

        System.out.println(order1);

        scanner.close();
    }
}
