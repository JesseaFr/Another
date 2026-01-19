package week10;

public class ManagementStudent extends Student {
    public ManagementStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }
    @Override
    public String calculateResult() {
        return getMarks() >= 45 ? "Pass (Management)" : "Fail (Management)";
    }
    public String calculateResult(int graceMarks) {
        return (getMarks() + graceMarks) >= 45 ? "Pass with Grace (Management)" : "Fail (Management)";
    }
}
