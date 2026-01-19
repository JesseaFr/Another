package week1;

public class Rectangle extends Shape implements Drawable {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
