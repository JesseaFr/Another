
/**
 * Write a description of class Dimensions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Dimensions
{
public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String size;
        System.out.println("Enter the paper size:");
        size=input.nextLine();
        switch (size){
            case "A0":
                System.out.println("The dimension in millimeter is  841 x 1189 mm");
                System.out.println("The dimension in inches is 33.1 x 46.8 inches");
                break;
            case "A1":
                System.out.println("The dimension in millimeter is 594 x 841 mm");
                System.out.println("The dimension in inches is 23.4 x 33.1 inches");
                break;
            case "A2":
                System.out.println("The dimension in millimeter is 420 x 594 mm");
                System.out.println("The dimension in inches is 16.5 x 23.4 inches");
                break;
            case "A3":
                System.out.println("The dimension in millimeter is 297 x 420 mm");
                System.out.println("The dimension in inches is 11.7 x 16.5 inches");
                break;
            case "A4":
                System.out.println("The dimension in millimeter is : 210 x 297mm");
                System.out.println("The dimension in inches is 8.3 x 11.7 inches");
                break;
            case "A5":
                System.out.println("The dimension in millimeter is : 148 x 297mm");
                System.out.println("The dimension in inches is 5.8 x 8.3 inches");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}