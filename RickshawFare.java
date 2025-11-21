import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double km = sc.nextDouble();

        System.out.print("Enter time (minutes): ");
        int minutes = sc.nextInt();

        System.out.print("Are you a local? (yes/no): ");
        String local = sc.next().toLowerCase();

        System.out.print("Is it night? (yes/no): ");
        String night = sc.next().toLowerCase();

        double fare = (km * 20) + (minutes * 2);

        fare = local.equals("yes") ? fare * 0.90 : fare;

        fare = night.equals("yes") ? fare * 1.20 : fare;

        System.out.println("Final Fare: Rs. " + Math.round(fare));
    }
}
