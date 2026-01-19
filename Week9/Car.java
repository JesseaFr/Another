package Week9;


/**
 * Write a description of class Scooter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private int doors;
     publicc Car(String brandName, int maxSpeed, int doors)
     {
        super(brandName, maxSpeed): 
        this.doors= doors;
     }
     public void displayDetails()
     {
         System.out.println("Car brand Name": "+super.brandName);
         System.out.println("Car Max Speed": "+super.maxSpeed);
         System.out.println("Number of doors for this car": "+ this.doors);
     }
    }