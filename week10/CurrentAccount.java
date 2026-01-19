package week10;

public class CurrentAccount extends Account {

    public CurrentAccount(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest();
    }

    public double calculateInterest(double rate) {
        return getBalance() * rate;
    }
}
