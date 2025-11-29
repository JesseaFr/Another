
/**
 * Write a description of class SellingPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
 public class SellingPrice
{
    public static void main(String[] args){
        
        float sp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marked price: ");
        float mp = input.nextFloat();
        System.out.println("Enter the category of the item(A,B,C,D)");
        char category = input.next().charAt(0);
        if (category=='A'){
            sp=mp-(mp*0.6f);
            System.out.println("Selling price of the item is" + sp);
        }
        else if (category=='B'){
            sp=mp-(mp*0.4f);
            System.out.println("Selling price of the item is" + sp);
        }
        else if (category=='C'){
            sp=mp-(mp*0.2f);
            System.out.println("Selling price of the item is" + sp);
        }
        else if (category=='D'){
            sp=mp-(mp*0.1f);
            System.out.println("Selling price of the item is" + sp);
        }
        else{
            System.out.println("Invalid Category");
        }
    }
}