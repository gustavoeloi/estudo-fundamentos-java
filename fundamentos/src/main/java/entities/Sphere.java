package entities;

public class Sphere {

    public static final double PI = Math.PI;

    public static double circumference(double radius) {
        // 2.PI.R
        return 2 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3.0;
    }
}
