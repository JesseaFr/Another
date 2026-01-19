public abstract class Shape {

    // abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // concrete method
    public void displayShapeInfo() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
