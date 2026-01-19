package week10;


public class HospitalApp {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(101, "Dr. Sita", 80000, "Cardiology", 15000);
        Nurse n1 = new Nurse(201, "Nurse Ram", 35000, "Night", 5000);

        System.out.println(d1);
        System.out.println("Doctor salary (regular): Rs." + d1.calculateSalary());
        System.out.println("Doctor salary (with emergencies 3): Rs." + d1.calculateSalary(3));

        System.out.println(n1);
        System.out.println("Nurse salary: Rs." + n1.calculateSalary());
    }
    
}