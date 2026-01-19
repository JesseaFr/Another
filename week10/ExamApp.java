package week10;

public class ExamApp {
    public static void main(String[] args) {
        ScienceStudent s1 = new ScienceStudent(101, "Ram", 48);
        ManagementStudent m1 = new ManagementStudent(201, "Sita", 42);

        System.out.println(s1);
        System.out.println("Result: " + s1.calculateResult());
        System.out.println("Result with Grace: " + s1.calculateResult(5));

        System.out.println(m1);
        System.out.println("Result: " + m1.calculateResult());
        System.out.println("Result with Grace: " + m1.calculateResult(5));
    }
}
