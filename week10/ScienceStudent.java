package week10;

public class ScienceStudent extends Student {
    public ScienceStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }
    @Override
    public String calculateResult() {
        return getMarks() >= 50 ? "Pass (Science)" : "Fail (Science)";
    }
    public String calculateResult(int graceMarks) {
        return (getMarks() + graceMarks) >= 50 ? "Pass with Grace (Science)" : "Fail (Science)";
    }
}
