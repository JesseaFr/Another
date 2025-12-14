import java.util.Scanner;
public class Student{
public static void main(String[] args){
String[] students={"Roblox","Sushant","Lol","Shike","kushal"};
System.out.println("Initial student lists");
for(String student:students){
System.out.println(student);
 
}
System.out.println("Second element" +""+students[2]);
 students[4]="Priya";
 System.out.println("updating element in index"+students[4]);
 Scanner sc=new Scanner(System.in);
 System.out.println("\n Enter a new student name to update ");
 String newname=sc.nextLine();
 students[1]=newname;
 System.out.println("\n Final Updated Student Lists");
 for(int i=0;i<students.length;i++){
 System.out.println("Answer" +i +""+students[i]);

 }
 

}
}