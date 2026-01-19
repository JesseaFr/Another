


package week10;

public class Doctor extends Person {
    private String specialization;
    private double consultationFee;

    public Doctor(int id, String name, double baseSalary, String specialization, double consultationFee) {
        super(id, name, baseSalary);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public String getSpecialization() { 
        return specialization; 
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization; 
    }

    public double getConsultationFee() { 
        return consultationFee; 
    }
    public void setConsultationFee(double consultationFee) { 
        this.consultationFee = consultationFee; 
    }

    @Override
    public double calculateSalary() {
       
        return super.calculateSalary() + consultationFee;
    }

    
    public double calculateSalary(int emergencyCases) {
        double emergencyBonus = emergencyCases * 500; 
        return calculateSalary() + emergencyBonus;
    }

    @Override
    public String toString() {
        return "Doctor{id=" + getId() + ", name='" + getName() + "', baseSalary=" + getBaseSalary()
                + ", specialization='" + specialization + "', consultationFee=" + consultationFee + "}";
    }
}


