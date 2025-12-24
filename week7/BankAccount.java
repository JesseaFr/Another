package week7;

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
            System.out.println(amount + " deposited successfully.");
        }
    public void withdraw(double amount) {
            System.out.println(amount + " withdrawn successfully.");
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }
}
