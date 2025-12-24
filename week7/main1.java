package week7;

 class Main {
    public static void main(String [] args){
        BankAccount account1 = new BankAccount(122, "John", 30000);
        BankAccount account2 = new BankAccount(123, "George", 25000);
        
        account1.deposit(12000);
        account1.withdraw(1400);
        
        account2.deposit(5000);
        account2.withdraw(4200);
        
        System.out.println("Details");
        account1.displayBalance();
        account2.displayBalance();
    }
}
