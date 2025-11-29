public class DivisibleByOne
{
    public static void main(String[] args){
 int num=2;
 if(num % 3==0){
     if(num%5==0){
          System.out.println("It is divisible by both 3 and 5");
     }
     
 }
  else if(num%5==0){
       System.out.println("It is divisible by 5");
  }
  else{
      System.out.println("It is not divisible by both"); 
  }
}
}