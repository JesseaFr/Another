package week7;
public class Main{
   public static void main(String[] args){
       Book b1= new Book();
       b1.name="Roblox";
       b1.author="Mads";
       b1.price=1267;
       System.out.println(b1.name);
       System.out.println(b1.author);
       System.out.println(b1.price);
       Book b2= new Book();
       b2.name="Ragna crimson the blood warrior";
       b2.author="Cat";
       b2.price=1267;
       System.out.println(b2.name);
       System.out.println(b2.author);
       System.out.println(b2.price);  
       Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 5;
        System.out.print("Area of Rectangle 1: ");
        r1.area();
        Rectangle r2 = new Rectangle();
        r2.length = 7;
        r2.breadth = 3;
        System.out.print("Area of Rectangle 2: ");
        r2.area();
        
        
        employee e1 = new employee();
        e1.id = 101;
        e1.name = "Priya";
        e1.salary = 25000;

        employee e2 = new employee();
        e2.id = 102;
        e2.name = "Kushal";
        e2.salary = 30000;

        employee e3 = new employee();
        e3.id = 103;
        e3.name = "Sachin";
        e3.salary = 28000;
        System.out.println("Employee 1:");
        e1.displayInfo();
        System.out.println("Employee 2:");
        e2.displayInfo();
        System.out.println("Employee 3:");
        e3.displayInfo();
        employee highest = e1;
        if (e2.salary > highest.salary) {
            highest = e2;
        }
        if (e3.salary > highest.salary) {
            highest = e3;
        }
        System.out.println("Employee with highest salary:");
        highest.displayInfo();
        
        Laptop l1 = new Laptop("Dell", 8, 75000);
        Laptop l2 = new Laptop("HP", 16, 85000);
        Laptop l3 = new Laptop("Lenovo", 12, 80000);
        System.out.println("Laptops with RAM greater than 8GB:\n");

        if (l1.ram > 8) {
            l1.showDetails();
            System.out.println();
        }

        if (l2.ram > 8) {
            l2.showDetails();
            System.out.println();
        }

        if (l3.ram > 8) {
            l3.showDetails();
            System.out.println();
        }
        
        
        Mobile m1 = new Mobile("Samsung", 18000);
        Mobile m2 = new Mobile("iPhone", 100000);
        Mobile m3 = new Mobile("Realme", 15000);
        System.out.println("Affordable Mobiles (Price < Rs 20000):\n");
        if (m1.isAffordable()) {
            m1.showDetails();
            System.out.println();
        }
        if (m2.isAffordable()) {
            m2.showDetails();
            System.out.println();
        }
        if (m3.isAffordable()) {
            m3.showDetails();
            System.out.println();
        }
        
        
        Result s1 = new Result(85, 90, 80);
        Result s2 = new Result(70, 75, 65);
        System.out.println("Result of Student 1:");
        s1.showResult();
        System.out.println("\nResult of Student 2:");
        s2.showResult();
        
    




   

       
       }
}