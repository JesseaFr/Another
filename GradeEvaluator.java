
import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your numeric grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine();
        String result = (grade >= 40) ? "Pass" : "Fail";
        System.out.println("\tYour grade:\t" + grade);
        System.out.println("\tStatus:\t\t" + result);
    }
}
