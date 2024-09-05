package entities;

public class Rectangle {
    private double width;
    private double height;

    public double area(){
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    public double diagonal() {
        return Math.sqrt((this.width * this.width) + (this.height * this.height));
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "AREA = " +
                area() +
                "\n PERIMETER = " +
                perimeter() +
                "\n DIAGONAL = " +
                diagonal();
    }
}
