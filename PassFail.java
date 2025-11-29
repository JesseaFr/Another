
/**
 * Write a description of class PassFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PassFail
{
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
       System.out.println("Enter Your Number");
       int num= input.nextInt();
       
       if (num >=40) {
            System.out.println("Pass");
       }
    }
}