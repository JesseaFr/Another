

/**
 * Write a description of class TutorialC3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TutorialC3
{
    
    public static void main(String[] args)
    {
        int sum=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Ask for range; ");
        int range= input.nextInt();
        for (int i=1; i<=range; i++)
        {
            sum= sum+ i;
        }
        System.out.println(sum);
    }
}