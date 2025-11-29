
/**
 * Write a description of class SPwitchSWITCH here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SPwitchSWITCH
{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float mp;
    char category;
    float sp;
    System.out.println("Enter marked price: ");
    mp=input.nextFloat();
    
    System.out.println("Enter the category of the item(A,B,C,D)");
    category = input.next().charAt(0);
    
    switch (category){
            case 'A':
                sp=mp-(mp*0.6f);
                break;
            case 'B':
                sp=mp-(mp*0.4f);
                break;
            case 'C':
                sp=mp-(mp*0.2f);
                break;
            case 'D':
                sp=mp-(mp*0.1f);
                break;
            default:
                System.out.println("Invalid category");
                return;
        }
        System.out.println("The Selling Price of item is" + sp);
    }
}