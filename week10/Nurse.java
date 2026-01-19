package week10;


/**
 * Write a description of class Nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends Person {
    private String shift;           
    private double extraAllowance; 

    public Nurse(int id, String name, double baseSalary, String shift, double extraAllowance) {
        super(id, name, baseSalary);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }

    public String getShift() { 
        return shift; 
    }
    public void setShift(String shift) { 
        this.shift = shift;
    }

    public double getExtraAllowance() { 
        return extraAllowance; 
    }
    public void setExtraAllowance(double extraAllowance) {
        this.extraAllowance = extraAllowance; 
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + extraAllowance;
    }

    @Override
    public String toString() {
        return "Nurse{id=" + getId() + ", name='" + getName() + "', baseSalary=" + getBaseSalary()
                + ", shift='" + shift + "', extraAllowance=" + extraAllowance + "}";
    }
}
