package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and heigth: ");
        System.out.print("Width: ");
        rectangle.setWidth(scanner.nextDouble());

        System.out.print("Height: ");
        rectangle.setHeight(scanner.nextDouble());

        System.out.println(rectangle);

        scanner.close();
    }
}
