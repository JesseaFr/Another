package week7;


/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile
{
     String brand;
    double price;
    Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    boolean isAffordable() {
        return price < 20000;
    }
    void showDetails() {
        System.out.println("Brand: " + brand + ", Price: Rs " + price);
    }
}