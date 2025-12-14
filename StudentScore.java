import java.util.Scanner;

public class StudentScore{
    public static void main(String[] args) {
        
        int[] scores = {10, 20, 30, 40, 50};

        
        System.out.println("Original Scores:");
        for (int s : scores) {
            System.out.println(s);
        }

        
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
        for (int s : scores) {
            sum += s;
            if (s > highest) highest = s;
            if (s < lowest) lowest = s;
        }
        double average = (double) sum / scores.length;

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of subjects: ");
        int n = sc.nextInt();

        int[] dynamicScores = new int[n];
        System.out.println("Enter the scores:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            dynamicScores[i] = sc.nextInt();
        }

        
        System.out.println("\nUpdated Scores:");
        for (int s : dynamicScores) {
            System.out.println(s);
        }

        sc.close();
    }
}

