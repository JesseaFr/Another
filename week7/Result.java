package week7;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
   int subject1;
    int subject2;
    int subject3;
    Result(int s1, int s2, int s3) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }
    void showTotal() {
        int total = subject1 + subject2 + subject3;
        System.out.println("Total Marks: " + total);
    }
    void showPercentage() {
        double percentage = (subject1 + subject2 + subject3) / 3.0;
        System.out.println("Percentage: " + percentage + "%");
    }
    void showMarks() {
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
    }
    void showResult() {
        showMarks();
        showTotal();
        showPercentage();
    }
}