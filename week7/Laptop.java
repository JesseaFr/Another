package week7;


/**
 * Write a description of class Laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Laptop
{
    String brand;
    int ram;
    double price;
    
    Laptop(String brand,int ram,double price){
        this.brand=brand;
        this.ram=ram;
        this.price=price;
    }
    void showDetails(){
        System.out.println("Brand is"+brand + "Ram"+ram +"Price is"+price);
        
    }
}

