package application;

import entities.Sphere;

import java.util.Locale;
import java.util.Scanner;

public class SphereApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        double circumference = Sphere.circumference(radius);
        double volume = Sphere.volume(radius);
        double pi = Sphere.PI;

        System.out.printf("Circumference: %.2f \nVolume: %.2f\nPI Value: %.2f", circumference, volume, pi);

        scanner.close();
    }
}
