
/**
 * Write a description of class Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Grade
{
  public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        float gpa;
        
        System.out.println("Enter the GPA:");
        gpa=input.nextFloat();
        
        if(gpa>3.6 && gpa<4.0){
            System.out.println("A+");
        }
        else if(gpa>3.2 && gpa<3.6){
            System.out.println("A");
        }
        else if(gpa>2.8 && gpa<3.2){
            System.out.println("B+");
        }
        else if(gpa>2.4 && gpa<2.8){
            System.out.println("B");
        }
        else if(gpa>2.0 && gpa<1.6){
            System.out.println("C+");
        }
        else if(gpa>1.6 && gpa<2.0){
            System.out.println("C");
        }
        else if(gpa<1.6 && gpa>0){
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid GPA");
        }
        
    }     
}
